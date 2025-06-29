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

        
    }
    
}
