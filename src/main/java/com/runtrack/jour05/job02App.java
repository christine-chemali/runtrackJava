/* JOUR 05 JOB 02 RUNTRACK JAVA
 * Dans ce job, l'objectif est de créer une fenêtre simple avec une
 * disposition borderlayout
 * Le but est de comprendre comment créer une fenêtre graphique et
 * comment utiliser la disposition BorderPane layout pour organiser 
 * les différents composants dans la fenêtre.
 * Il est également demandé d'ajouter un bouton "Quitter" 
 * en bas de la fenêtre qui fermera l'application lorsqu'il sera
 * cliqué.
 * Enfin la fenêtre doit être affichée
 * 
 * Résultat attendu :
 * -> une fenêtre graphique simple avec une disposition BorderPane
 * -> Un bouton "Quitter" en bas de la fenêtre qui ferme l'application
 * lorsqu'il est cliqué.
 */

package com.runtrack.jour05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class job02App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Créer le BorderPane
        BorderPane borderPane = new BorderPane();

        //Créer le bouton quitter
        Button quitButton = new Button("Quitter");
        quitButton.setOnAction(e -> primaryStage.close() );

        //Ajouter le bouton en bas
        borderPane.setBottom(quitButton);

        //Créer la scène
        Scene scene = new Scene(borderPane, 400, 300);
        
        //Configurer la fenêtre
        primaryStage.setTitle("Job 02 - BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

//Pour compiler et executer : .\run.bat jour05.job02App