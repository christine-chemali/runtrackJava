/* JOUR 05 JOB 03 RUNTRACK JAVA
 * Dans ce job l'objectif est d'ajouter des 
 * composants d'interface utilisateur à la fenêtre, 
 * notamment l'étiquette "Nom" un champ texte pour
 * entrer un nom et un bouton "Envoyer"
 * Les composants doivent être organisé à l'aide de 
 * la dispostion FlowPane Layout.
 * le but est de comprendre comment ajouter des 
 * composants d'interface utilisateur à une fenêtre
 * graphique et comment utiliser la dispositon FlowPane Layout
 * pour les organiser
 * 
 * Résultat attendu
 * -> Une fenêtre graphique avec une étiquette "Nom",
 * un champ de texte et un bouton "Envoyer"
 * -> Les composants doivent être organisés à l'aide de la 
 * dispositon FlowPane Layout
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

public class job03App extends Application {

    @Override
    public void start(Stage primaryStage){
        //Créer le FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);

        //Créer les composants
        Label nameLabel = new Label("Nom :");
        TextField namField = new TextField();
        Button sendButton = new Button("Envoyer");
        
    }
    
}
