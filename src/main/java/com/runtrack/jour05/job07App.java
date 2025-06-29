/* JOUR 05 JOB 07 RUNTRACK JAVA
 * 
 * Dans ce job, l'objectif est d'ajouter un tableau de 
 * données avec plusieurs colonnes et lignes
 * Ensuite, un bouton "Exporter" doit être ajouté pour
 * exporter les données du tableau dans un fichier CSV
 * Le but est de comprendre comment ajouter des tableaux en 
 * java fx et comment manipuler les données d'un tableau
 * 
 * Résultat attendu
 * -> Une fenêtre graphique avec un tableau de données
 * et un bouton "Exporter"
 * -> les données du tableau doivent être exportées dans un 
 * fichier CSV lorsque le bouton "Exporter" est cliqué
 */

package com.runtrack.jour05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class job07App extends Application {

    //Classe pour representer une personne
    public static class Person {
        private final SimpleStringProperty nom;
        private final SimpleStringProperty prenom;
        private final SimpleStringProperty age;
        

        public Person(String nom, String prenom, String age){
            this.nom = new SimpleStringProperty(nom);
            this.prenom = new SimpleStringProperty(prenom);
            this.age = new SimpleStringProperty(age);
        }

        public String getNom(){ return nom.get(); }
        public String getPrenom(){ return prenom.get(); }
        public String getAge(){ return age.get(); }
    }

    @Override
    public void start(Stage primaryStage) {
        //Creer la VBox
        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(20));

        //Creer le tableView
        TableView<Person> table = new TableView<>();

        //Creer les colonnes
        TableColumn<Person, String> nomCol = new TableColumn<>("Nom");
        nomCol.setCellValueFactory(cellData -> cellData.getValue().nom);
        nomCol.setPrefWidth(150);

        TableColumn<Person, String> prenomCol = new TableColumn<>("Prénom");
        prenomCol.setCellValueFactory(cellData -> cellData.getValue().prenom);
        prenomCol.setPrefWidth(150);

        TableColumn<Person, String> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(cellData -> cellData.getValue().age);
        ageCol.setPrefWidth(100);

        //Ajout des colonnes au tableau
        table.getColumns().add(nomCol);
        table.getColumns().add(prenomCol);
        table.getColumns().add(ageCol);

        //Données d'exemple
        ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("Dupont", "Jean", "25"),
            new Person ("Martin", "Marie", "30"),
            new Person("Bernard", "Pierre", "35"),
            new Person("Durand", "Sophie", "28")
           );

           table.setItems(data);

        //Bouton d'export
        Button exportButton = new Button("Exporter");
        exportButton.setOnAction(e -> exportToCSV(data, primaryStage));
        exportButton.setStyle("-fx-background-color: #FF9800; -fx-text-fill: white; " +
                             "-fx-padding: 10px 20px; -fx-border-radius: 5px; " +
                             "-fx-background-radius: 5px; -fx-font-weight: bold;");

        //Ajouter les composants
        vbox.getChildren().addAll(table, exportButton);

        //Créer la scene
        Scene scene = new Scene(vbox, 500, 400);

        //Configuration de la fenêtre
        primaryStage.setTitle("Job 07 - Tableau avec export CSV");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     //Echappe une valeur pour leformat CSV
    private String escapeCSV(String value) {
        if (value == null) {
            return "";
        }
        
        // Si la valeur contient des virgules, guillemets ou sauts de ligne, on l'entoure de guillemets et on double les guillemets internes
        if (value.contains(",") || value.contains("\"") || value.contains("\n") || value.contains("\r")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        
        return value;
    }

    private void exportToCSV(ObservableList<Person> data, Stage parentStage) {
        // Créer le sélecteur de fichier
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Sauvegarder le fichier CSV");
        fileChooser.setInitialFileName("export_personnes.csv");
        
        // Ajouter un filtre pour les fichiers CSV
        FileChooser.ExtensionFilter csvFilter = new FileChooser.ExtensionFilter("Fichiers CSV (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(csvFilter);
        
        // Ouvrir la boîte de dialogue
        File selectedFile = fileChooser.showSaveDialog(parentStage);
        
        if (selectedFile != null) {
            try (FileWriter writer = new FileWriter(selectedFile, StandardCharsets.UTF_8)) {
                // En-têtes avec BOM UTF-8 pour Excel
                writer.write("\uFEFF"); // BOM UTF-8
                writer.write("Nom,Prénom,Âge\n");
                
                // Données avec échappement CSV
                for (Person person : data) {
                    writer.write(escapeCSV(person.getNom()) + "," + 
                               escapeCSV(person.getPrenom()) + "," + 
                               escapeCSV(person.getAge()) + "\n");
                }
                
                // Afficher une confirmation
                showAlert(Alert.AlertType.INFORMATION, "Export réussi", 
                         "Le fichier CSV a été créé avec succès :\n" + selectedFile.getAbsolutePath());
                
            } catch (IOException e) {
                // Afficher l'erreur à l'utilisateur
                showAlert(Alert.AlertType.ERROR, "Erreur d'export", 
                         "Erreur lors de la création du fichier CSV :\n" + e.getMessage());
            }
        }
    }
    
    //Afficher une boîte de dialogue d'alerte
    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//pour compiler et executer : .\run.bat jour05.job07App