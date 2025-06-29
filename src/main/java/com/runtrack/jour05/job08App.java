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

        //Deuxième onglet - HBox
        Tab tab2 = new Tab("Panneau Horizontal");
        HBox hbox = new HBox(15);
        hbox.setPadding(new javafx.geometry.Insets(20));

        Label label2 = new Label("HBox");
        Button button2 = new Button("Btn 1");
        Button button3 = new Button("Btn 2");
        Button button4 = new Button("Btn 3");

        hbox.getChildren().addAll(label2, button2, button3, button4);
        tab2.setContent(hbox);

        //Troisième onglet - formulaire
        Tab tab3 = new Tab("Formulaire");
        VBox formBox = new VBox(10);
        formBox.setPadding(new javafx.geometry.Insets(20));

        Label nameLabel = new Label("Nom :");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email :");
        TextField emailField = new TextField();
        CheckBox newsletterCheck = new CheckBox("S'abonner à la newsletter");
        Button submitButton = new Button("Soumettre");

        
    }
    
}
