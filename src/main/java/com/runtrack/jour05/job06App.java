/* JOUR 05 JOB 06 RUNTRACK JAVA FX
 * Dans ce job, l'objectif est d'ajouter une liste déroulante
 * de choix pour sélectionner un élément et une liste 
 * déroulante pour séléctionner une couleur
 * Ensuite un bouton "OK" doit être ajouté pour afficher les 
 * choix sélectionnés dans la console
 * Le but est de comprendre comment ajouter des 
 * listes déroulantes en javafx et comment récuperer
 * les choix utilisateur
 * 
 * Résultat attendu:
 * -> Une fenêtre graphique avec deux listes déroulantes et
 * un bouton 'OK'
 * 
 */

package com.runtrack.jour05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class job06App extends Application {
    
    @Override
    public void start(Stage primaryStage){
        //Créer le VBox
        VBox vbox = new VBox(15);
        vbox.setPadding(new javafx.geometry.Insets(20));

        //Créer les labels
        Label itemLabel = new Label("Sélectionnez un élement :");
        Label colorLabel = new Label("Sélectionnez une couleur :");

        //Créer des ComboBox
        ComboBox<String> itemCombo = new  ComboBox<>();
        itemCombo.getItems().addAll("Pomme", "Banane", "Orange", "Fraise", "Raisin");
        itemCombo.setPromptText("Choisir un fruit");

        ComboBox<String> colorCombo = new ComboBox<>();
        colorCombo.getItems().addAll("Rouge", "Vert", "Bleu", "Jaune", "Violet");
        colorCombo.setPromptText("Choisir une couleur");

        //Creer le bouton OK
        Button okButton = new Button("OK");
        okButton.setOnAction(e -> {
            String selectedItem = itemCombo.getSelectionModel().getSelectedItem();
            String selectedColor = colorCombo.getSelectionModel().getSelectedItem();

            System.out.println("Element sélectionné : " + (selectedItem != null ? selectedItem : "Aucun"));
            System.out.println("Couleur sélectionnée : " + (selectedColor != null ? selectedItem : "Aucune"));
        });

        //Appliquer les styles
        vbox.setStyle("-fx-background-color: #f0f0f0; ");
        itemLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; ");
        okButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; " + 
        "-fx-padding: 10px 20px; -fx-border-radius: 5px; " + 
        "-fx-backround-radius: 5px; -fx-font-weight: bold; ");
    }
    
}
