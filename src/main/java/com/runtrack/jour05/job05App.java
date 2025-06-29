/* JOUR 05 JOB 05 RUNTRACK JAVA
 * Dans ce job, l'objectif est d'ajouter un évenement au bouton
 * "Envoyer" pour afficher le nom entré dans le champ de texte dans la console
 * Le but est de comprendre comment utiliser les évenements en java fx
 * pour répondre aux actions de l'utilisateur
 * 
 * Résultat attendu
 * -> lorsque le bouton "Envoyer" est cliqué, le nom entré dans le champ
 * de texte doit être affiché dans la console
 * 
 */

 package com.runtrack.jour05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class job05App extends Application {

    @Override
    public void start(Stage primaryStage){
        //Créer le FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(15);
        flowPane.setVgap(15);
        flowPane.setPadding(new javafx.geometry.Insets(20));

        //Creer les composants
        Label nameLabel = new Label("Nom :");
        TextField nameField = new TextField();
        Button sendButton = new Button("Envoyer");

        //Créer l'evenement sur le bouton envoyer
        sendButton.setOnAction(e -> {
            String name = nameField.getText();
            System.out.println("Nom entré : " + name);
        });
        
        // Application des styles
        flowPane.setStyle("-fx-background-color: #f0f0f0;");
        nameLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #333;");
        nameField.setStyle("-fx-padding: 8px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
        sendButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; " +
                           "-fx-padding: 10px 20px; -fx-border-radius: 5px; " +
                           "-fx-background-radius: 5px; -fx-font-weight: bold;");
        
        //Ajout des composants
        flowPane.getChildren().addAll(nameLabel, nameField, sendButton);

        //Création de la scene
        Scene scene = new Scene(flowPane, 400, 300);

        //Configuration de la fenêtre
        primaryStage.setTitle("Job 05 - Gestion d'évenemnents");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
//Pour compiler et executer : .\run.bat jour05.job05App