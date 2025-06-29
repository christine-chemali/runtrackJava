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

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
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
        table.getColumns().addAll(nomCol, prenomCol, ageCol);

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
        exportButton.setOnAction(e -> exportToCSV(data));
        exportButton.setStyle("-fx-background-color: #FF9800; -fx-text-fill: white; " +
                             "-fx-padding: 10px 20px; -fx-border-radius: 5px; " +
                             "-fx-background-radius: 5px; -fx-font-weight: bold;");
    }

     private void exportToCSV(ObservableList<Person> data) {
        
     }
    
}
