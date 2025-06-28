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
        
    }
    
}
