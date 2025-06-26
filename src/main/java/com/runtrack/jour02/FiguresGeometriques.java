/*
 * JOUR 02 JOB 03.0 / 3.1 / 3.2 / 3.4  RUNTRACK JAVA
 * Ecrire un programme FiguresGeometriques.java définissant
 * l'objet Rectangle ayant une largeur et une longueur (format double)
 * les getters et les setters correspondants ainsi qu la méthode 
 * surface 
 * +---------------------+
 *      RECTANGLE       
 * +---------------------+
 *    #largeur:double     
 *    #longueur:double    
 * +---------------------+
 *    +Rectangle
 *    +surface:double
 *    +getLongueur:double
 *    +getLargeur:double
 *    +setLargeur:void
 *    +setLongueur:void
 * +----------------------+
 *    longueur:double
 *    largeur:double
 * +----------------------+
 *  */

//Job 03.0
// package com.runtrack.jour02;

// public class FiguresGeometriques {
//     public static void main(String[] args){
//         Rectangle rect = new Rectangle(5.0, 3.0);
//         System.out.println("Surface : " + rect.surface());
//     }
// }

// class Rectangle {
//     private double largeur;
//     private double longueur;

//     public Rectangle(double longueur, double largeur){
//         this.longueur = longueur;
//         this.largeur = largeur;
//     }

//     public double surface(){
//         return longueur*largeur;
//     }

//     public double getlongueur(){
//         return longueur;
//     }

//     public double getLargeur(){
//         return largeur;
//     }
    
//     public void setLongueur(double longueur){
//         this.longueur = longueur;
//     }

//     public void setLargeur(double largeur){
//         this.largeur = largeur;
//     }
// }

//Job 03.1
/*
 * Ecrire un programme FiguresGéométriques.java 
 * la definition de l'objet Cercle ayant un centre avec
 * deux coordonnées x et y (double) ainsi que le rayon (double),
 * les getters et les setters correspondants ainsi que 
 * la méthode qui prend deux valeurs x et y pour vérifier
 * si le point est à l'intèrieur du cercle ou non
 * 
 * +---------------------------+
 *         Cercle
 * +---------------------------+
 *  #x:double
 *  #y:double
 *  #rayon:double
 * +---------------------------+
 *  +Cercle
 *  +affiche:void
 *  +getX:double
 *  +setCentre:void
 *  +surface:double
 *  +estInterieur:boolean
 *  +getRayon:double
 *  +setRayon:void
 * +---------------------------+
 *  x:double
 *  y:double
 *  rayon:double
 * +---------------------------+
 * */

//job3.1 code

// package com.runtrack.jour02;

// public class FiguresGeometriques {
//     public static void main(String[] args){
//         Rectangle rect = new Rectangle(5.0, 3.0);
//         System.out.println("Surface : " + rect.surface());
//         Cercle cercle = new Cercle(0.0, 0.0, 5.0);
//         cercle.affiche();
//         System.out.println("Point (3,4) est intérieur : " + cercle.estInterieur(3.0, 4.0));
//     }
// }

// class Rectangle {
//     private double largeur;
//     private double longueur;

//     public Rectangle(double longueur, double largeur){
//         this.longueur = longueur;
//         this.largeur = largeur;
//     }

//     public double surface(){
//         return longueur*largeur;
//     }

//     public double getlongueur(){
//         return longueur;
//     }

//     public double getLargeur(){
//         return largeur;
//     }
    
//     public void setLongueur(double longueur){
//         this.longueur = longueur;
//     }

//     public void setLargeur(double largeur){
//         this.largeur = largeur;
//     }
// }

// class Cercle {
//     private double x;
//     private double y;
//     private double rayon;

//     public Cercle(double x, double y, double rayon){
//         this.x = x;
//         this.y = y;
//         this.rayon = rayon;
//     }

//     public void affiche() {
//         System.out.println("Cercle de centre (" + x + "," + y + ") et de rayon " + rayon);
//     }

//     public double getX(){
//         return x;
//     }

//     public void setCentre(double x, double y){
//         this.x = x;
//         this.y = y;
//     }

//     public double surface(){
//         return Math.PI * rayon * rayon;
//     }

//     public boolean estInterieur(double pointX, double pointY){
//         double distance = Math.sqrt(Math.pow(pointX - x, 2) + Math.pow(pointY -y, 2));
//         return distance <= rayon;
//     }

//     public double getRayon(){
//         return rayon;
//     }

//     public void setRayon(double rayon){
//         this.rayon = rayon;
//     }
// }

//Job 3.2
/*
 * Ajouter une classe RectangleColore qui hérite de Rectangle
 * Cette classe doit simplement avoir un attribut de plus, couleur, de type int.
 * Ne pas oublier de créeer un constructeur
 */

//  package com.runtrack.jour02;

// public class FiguresGeometriques {
//     public static void main(String[] args){
//         Rectangle rect = new Rectangle(5.0, 3.0);
//         System.out.println("Surface : " + rect.surface());
        
//         Cercle cercle = new Cercle(0.0, 0.0, 5.0);
//         cercle.affiche();
//         System.out.println("Point (3,4) est intérieur : " + cercle.estInterieur(3.0, 4.0));

//         RectangleColore rectCol = new RectangleColore(4.0,2.0,1);
//         System.out.println("Surface rectangle coloré : " + rectCol.surface());
//     }
// }

// class Rectangle {
//     private double largeur;
//     private double longueur;

//     public Rectangle(double longueur, double largeur){
//         this.longueur = longueur;
//         this.largeur = largeur;
//     }

//     public double surface(){
//         return longueur*largeur;
//     }

//     public double getlongueur(){
//         return longueur;
//     }

//     public double getLargeur(){
//         return largeur;
//     }
    
//     public void setLongueur(double longueur){
//         this.longueur = longueur;
//     }

//     public void setLargeur(double largeur){
//         this.largeur = largeur;
//     }
// }

// class RectangleColore extends Rectangle {
//     private int couleur;

//     public RectangleColore(double longueur, double largeur, int couleur) {
//         super(longueur, largeur);
//         this.couleur = couleur;
//     }

//     public int getCouleur (){
//         return couleur;
//     }

//     public void setCouleur(int couleur) {
//         this.couleur = couleur;
//     }

// }

// class Cercle {
//     private double x;
//     private double y;
//     private double rayon;

//     public Cercle(double x, double y, double rayon){
//         this.x = x;
//         this.y = y;
//         this.rayon = rayon;
//     }

//     public void affiche() {
//         System.out.println("Cercle de centre (" + x + "," + y + ") et de rayon " + rayon);
//     }

//     public double getX(){
//         return x;
//     }

//     public void setCentre(double x, double y){
//         this.x = x;
//         this.y = y;
//     }

//     public double surface(){
//         return Math.PI * rayon * rayon;
//     }

//     public boolean estInterieur(double pointX, double pointY){
//         double distance = Math.sqrt(Math.pow(pointX - x, 2) + Math.pow(pointY -y, 2));
//         return distance <= rayon;
//     }

//     public double getRayon(){
//         return rayon;
//     }

//     public void setRayon(double rayon){
//         this.rayon = rayon;
//     }
// }

//Job 3.4
/*
 * Définir une classe Figure contenant deux attributs
 * X et Y (double) qui représentent le centre de la figure
 * une méthode affiche () qui affiche simplement les
 * coordonnées du centre en paramètre
 * Modifier votre programme pour que les classes
 * Cercle et Rectangle héritent de la classe Figure
 * 
 * +----------------------+
 *     Figure
 * +----------------------+
 *    +Figure
 *    +affiche:void
 *    +setCentre:void
 * +----------------------+
 *   x:double
 *   y: double
 * +----------------------+
 * 
 */

package com.runtrack.jour02;

public class FiguresGeometriques {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(0.0, 0.0, 5.0, 3.0);
        System.out.println("Surface : " + rect.surface());
        
        Cercle cercle = new Cercle(0.0, 0.0, 5.0);
        cercle.affiche();
        System.out.println("Point (3,4) est intérieur : " + cercle.estInterieur(3.0, 4.0));

        RectangleColore rectCol = new RectangleColore(1.0, 1.0, 4.0, 2.0, 1);
        rectCol.affiche();
        System.out.println("Surface rectangle coloré : " + rectCol.surface());
    }
}

class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y){
    this.x = x;
    this.y = y;
    }

    public void affiche (){
        System.out.println("Centre : (" + x + ", " + y + ")");
    }

    public void setCentre(double x, double y){
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends Figure {
    private double largeur;
    private double longueur;

    public Rectangle(double x, double y, double longueur, double largeur){
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface(){
        return longueur*largeur;
    }

    public double getlongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }
    
    public void setLongueur(double longueur){
        this.longueur = longueur;
    }

    public void setLargeur(double largeur){
        this.largeur = largeur;
    }
}

class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur);
        this.couleur = couleur;
    }

    public int getCouleur (){
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

}

class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon){
        super(x, y);
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle de centre (" + x + "," + y + ") et de rayon " + rayon);
    }

    public double surface(){
        return Math.PI * rayon * rayon;
    }

    public boolean estInterieur(double pointX, double pointY){
        double distance = Math.sqrt(Math.pow(pointX - x, 2) + Math.pow(pointY -y, 2));
        return distance <= rayon;
    }

    public double getRayon(){
        return rayon;
    }

    public void setRayon(double rayon){
        this.rayon = rayon;
    }
}