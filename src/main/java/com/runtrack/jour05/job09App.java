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
            
