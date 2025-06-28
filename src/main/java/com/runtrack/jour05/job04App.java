/* JOUR 05 JOB 03 RUNTRACK JAVA
 * Dans ce job, l'objectif est d'ajouter un style et un
 * thème à la fenêtre et aux composants.
 * Le but est de comprendre comment personnaliser l'apparence
 * des composants de l'interface utilisateur en utilisant des
 * styles et des thèmes.
 * 
 * Résultat attendu
 * -> La fenêtre et les composants doivent avoir un style
 * et un thème personnalisé.
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

public class job04App extends Application {

    @Override
    public void start(Stage primarStage){

        //Créer le FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(15);
        flowPane.setVgap(15);
        flowPane.setPadding(new javafx.geometry.Insets(20));

        //Créer les composants
        Label nameLabel = new Label("Nom :");
        TextField nameField = new TextField();
        Button sendButton = new Button("Envoyer");

        //Appliquer des styles
        flowPane.setStyle("-fx-background-color: #f0f0f0;");
        nameLabel.setStyle("-fx-font-size: 14 px; -fx-font-weight: bold; -fx-text-fill: #333; ");
        nameField.setStyle("-fx-padding: 8px; -fx-bordr-radius: 5px; -fx-background-radius: 5px;");
        sendButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; " +
        "-fx-padding: 10px; -fx-border-radius: 5 px; " + 
        "-fx-background-radius: 5px; -fx-font-weight: bold;");

        //Effet hover sur le bouton
        sendButton.setOnMouseEntered(e -> 
        sendButton.setStyle("-fx-background-color: #45a049; -fx-text-fill: white;" + 
        "-fx-padding: 10px 20px; -fx-border-radius: 5px;" + 
        "-fx-background-radius: 5px; -fx-font-weight: bold;"));

        sendButton.setOnMouseExited(e ->
        sendButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; " +
        "-fx-padding: 10px 20px; -fx-border-radius: 5 px; " +
        "-fx-background-radius: 5px; -fx-font-weight: bold"));
    
        //Ajout des composants
        flowPane.getChildren().addAll(nameLabel, nameField, sendButton);
    }
    
}
