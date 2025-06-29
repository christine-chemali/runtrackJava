/* JOUR 05 JOB 07 RUNTRACK JAVA
 * 
 * Dans ce job, l'objectif est d'ajouter un tableau de 
 * données avec plusieurs colonnes et lignes
 * Ensuite, un bouton "Exporter" doit être ajouté pour
 * exporter les données du tableau dans un fichier CSV
 * Le but est de comprendre comment ajouter des tableaux en 
 * java fx et comment manipuler les données d'un tableau
 * 
 * Résultat attendu
 * -> Une fenêtre graphique avec un tableau de données
 * et un bouton "Exporter"
 * -> les données du tableau doivent être exportées dans un 
 * fichier CSV lorsque le bouton "Exporter" est cliqué
 */

package com.runtrack.jour05;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class job07App extends Application {

    //Classe pour representer une personne
    public static class Person {
        private final SimpleStringProperty nom;
        private final SimpleStringProperty prenom;
        private final SimpleStringProperty age;
        

        public Person(String nom, String prenom, String age){
            this.nom = new SimpleStringProperty(nom);
            this.prenom = new SimpleStringProperty(prenom);
            this.age = new SimpleStringProperty(age);
        }

        public String getNom(){ return nom.get(); }
        public String getPrenom(){ return prenom.get(); }
        public String getAge(){ return age.get(); }
    }

    @Override
    public void start(Stage primaryStage) {
        //Creer la VBox
        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(20));
        

    }
    
}
