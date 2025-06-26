/*
 * JOUR 03 JOB 01 RUNTRACK JAVA POO - POLY - L'art abstait
 * 
 * Programmer la hierarchie de classes
 * "Rectangle coloré héritant de rectangle" en obéissant 
 * aux contraintes suivantes :
 * - la classe Rectangle possède les attributs double largeur et hauteur
 * - La classe RectangleColore hérite de Rectangle et possède un attribut couleur de type String
 * - Le code résultant doit pouvoir être testé avec le programme principal ci-dessous
 * et produire en sortie :
 * Test 1 :
 * Rectangle :
 * largeur = 12.5
 * hauteur = 4.0
 * Test 2 :
 * Rectangle :
 * largeur = 12.5
 * hauteur = 4.0
 * couleur = rouge
 * Test 3 :
 * Rectangle :
 * largeur = 12.5
 * hauteur = 4.0
 * couleur = rouge
 * true
 * true
 * false
 * false
 * false
 * 
 * les méthodes toString et equals nécéssaires ne doivent pas comporter
 * de duplication de code
 */

package com.runtrack.jour03;

public class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2 :");
        //le type de rect1 est RectangleColore
        //l'objet contenu dans rect1 est de type RectangleColore
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");

        //le type de rect2 est Rectangle
        //l'objet contenu dans rect2 est de type RectangleColore
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2)); //1.
        System.out.println(rect2.equals(rect1)); //2.
        System.out.println(rect1.equals(null)); //3.
        System.out.println(rect.equals(rect1)); //4.
        System.out.println(rect1.equals(rect)); //5.
    }
}

class Rectangle {
    double largeur;
    double hauteur;

    Rectangle(double largeur, double hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String toString(){
        return "Rectangle :\nlargeur = " + largeur + "\nhauteur = " + hauteur;
    }

    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Rectangle r = (Rectangle)obj;
        return largeur == r.largeur && hauteur == r.hauteur;
    }
}

class RectangleColore extends Rectangle {
    String couleur;

    RectangleColore(double largeur, double hauteur, String couleur){
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    public String toString(){
        return super.toString() + "\ncouleur = " + couleur;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof RectangleColore r)) return false;
        return super.equals(obj) && couleur.equals(r.couleur);
    }
}
//Pour compiler et executer : .\run.bat jour03.ToStringEq