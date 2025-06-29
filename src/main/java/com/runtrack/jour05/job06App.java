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

    }
    
}
