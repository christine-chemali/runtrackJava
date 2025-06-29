/* JOUR 05 JOB 09 RUNTRACK JAVA Fx
 * 
 * Dans ce job l'objectif est d'ajouter une boite de 
 * dialogue pour demander une confirmaiton avant de
 * quitter l'applicatin et une boitr de dialogue pour 
 * afficher des messages d'erreur
 * Le but est de comprendre comment utiliser les
 *  boites de dialogue en javafx pour interagir avec
 * l'utilisateur
 * 
 * Résultat attendu
 * -> Une boite de dialogue doit s'afficher pour demander
 * une confirmation avant de quitter l'application
 * -> Une boite de dialogue doit s'afficher pour afficher un 
 * message d'erreur si l'utilisateur entre des données invalides
 */

package com.runtrack.jour05;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


import java.util.Optional;

public class job09App extends Application {

    @Override
    public void start(Stage primaryStage){
        //creer la Vbox
        VBox vbox = new VBox(15);
        vbox.setPadding(new javafx.geometry.Insets(20));

        //Champ de saisie
        Label nameLabel = new Label("Nom (obligatioire) : ");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age (nombre uniquement) :");
        TextField ageField = new TextField();

        //Bouttons
        Button validateButton = new Button("Valider");
        Button quitButton = new Button("Quitter"); 

         // Action sur le bouton Valider
        validateButton.setOnAction(e -> {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            
            // Validation des données
            if (name.isEmpty()) {
                showErrorDialog("Erreur de saisie", "Le nom est obligatoire !");
                return;
            }
            
            if (!ageText.isEmpty()) {
                try {
                    int age = Integer.parseInt(ageText);
                    if (age < 0 || age > 150) {
                        showErrorDialog("Erreur de saisie", "L'âge doit être entre 0 et 150 ans !");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    showErrorDialog("Erreur de saisie", "L'âge doit être un nombre valide !");
                    return;
                }
            }
            
            // Si tout est valide
            showInfoDialog("Succès", "Données validées avec succès !\n" +
                          "Nom: " + name + 
                          (ageText.isEmpty() ? "" : "\nÂge: " + ageText));
        });
        
        // Action sur le bouton Quitter avec confirmation
        quitButton.setOnAction(e -> {
            if (showConfirmDialog("Confirmation", "Êtes-vous sûr de vouloir quitter l'application ?")) {
                primaryStage.close();
            }
        });
        
        // Gestion de la fermeture de la fenêtre
        primaryStage.setOnCloseRequest(e -> {
            e.consume(); // Empêche la fermeture directe
            if (showConfirmDialog("Confirmation", "Êtes-vous sûr de vouloir quitter l'application ?")) {
                primaryStage.close();
            }
        });
        
        // Application des styles
        nameLabel.setStyle("-fx-font-weight: bold;");
        ageLabel.setStyle("-fx-font-weight: bold;");
        validateButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; " +
                              "-fx-padding: 10px 20px; -fx-border-radius: 5px; " +
                              "-fx-background-radius: 5px; -fx-font-weight: bold;");
        quitButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; " +
                          "-fx-padding: 10px 20px; -fx-border-radius: 5px; " +
                          "-fx-background-radius: 5px; -fx-font-weight: bold;");
        
        // Ajout des composants
        vbox.getChildren().addAll(nameLabel, nameField, ageLabel, ageField, 
                                validateButton, quitButton);
        
        // Création de la scène
        Scene scene = new Scene(vbox, 400, 300);
        
        // Configuration de la fenêtre
        primaryStage.setTitle("Job 09 - Boîtes de dialogue");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // Méthode pour afficher une boîte de dialogue de confirmation
    private boolean showConfirmDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        
        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }
    
    // Méthode pour afficher une boîte de dialogue d'erreur
    private void showErrorDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    // Méthode pour afficher une boîte de dialogue d'information
    private void showInfoDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

//Pour compiler et commenter : .\run.bat jour05.job09App