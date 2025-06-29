/* JOUR 05 JOB 08 RUNTRACK JAVA FX
 * Dans ce job l'objectif est d'utiliser des panneaux
 * pour organiser les composants de la fenêtre
 * Ensuite des onglets doivent être ajoutés pour afficher
 * plusieurs panneaux
 * le but est de comprendre comment utiliser les 
 * panneaux pour organiser les composants de l'interface
 * utilisateur et comment ajouter des ongles pour afficher
 * plusieurs panneauw
 * 
 * Résultat attendu
 * -> Une fenêtre graphique avec plusieurs panneaux organisés
 *  à l'aide de la dispositon VBox ou HBox layout
 * -> Des onglets doivent être ajoutés pour afficher les 
 * différents panneaux
 * 
 */

package com.runtrack.jour05;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class job08App extends Application {

    @Override
    public void start(Stage primaryStage){
        //Créer le TbPane
        TabPane tabPane = new TabPane();

        //Premier onglet vBox
        Tab tab1 = new Tab("Panneau Vertical");
        VBox vbox = new VBox(15);
        vbox.setPadding(new javafx.geometry.Insets(20));

        Label label1 = new Label("Panneau organisé en VBox");
        TextField textField1 = new TextField("Champ de texte 1");
        TextField textField2 = new TextField("Champ de texte 2");
        Button button1 = new Button("Bouton VBox");

        vbox.getChildren().addAll(label1, textField1, textField2, button1);
        tab1.setContent(vbox);

        //
    }
    
}
