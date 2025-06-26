/*
 * JOUR 03 JOB 02 RUNTRACK JAVA
 * Vous vous interessez dans cet exercice à décrire
 * les données d'un jeu simulant des combats de magiciens.
 * Dans ce jeu, il existe trois types de cartes: les terrains
 * les créatures
 * les sortilèges
 * Les terrains possèdent une couleur
 * (parmi 5 : blanc(B), bleu(b), noir(n), rouge(r), vert(v))
 * Les crétures possèdent un nom, un nombre de points de dégats
 * et un nombre de points de vie
 * les sortilèges possèdent un nom et une explication sous forme
 * de texte, de plus, chaque carte indèpendament de son type
 * possède un cout. Celui d'un terrain des de 0
 * Dans un programme Magic.java, proposez et implémentez 
 * une hierarchie des classes permettant de représenter des cartes
 * de différents types.
 * Chaque classe aura un constructeur permettant de spécifier
 * la/les valeurs de ses attributs.
 * De plus chaque constructeur devra afficher le type de la
 * carte.
 * Le programme doit utiliser la conception orientée objet et ne 
 * pas comporter de duplication de code
 * Ajouter ensuite aux cartes une méthode afficher() qui pour
 * toute carte affiche son cout et la valeur de ses arguments spécifiques
 * Créez de plus une classe Jeu pour représenter un jeu de carte
 * cad  une collection de telle cartes
 * Cette classe devra avoir une methode piocher() permettant
 * d'ajouter une carte au jeu. On supposera qu'un jeu comporte au 
 * plus 10 cartes.Le jeu comportera égalemnt une méthode jouer() 
 * permettant de jouer une carte
 * Pour simplifier on jouera ls cartes dans l'ordre ou
 * elles sont stockées dans le jeu et on mettra la carte jouée
 * à null dans le jeu de carte.
 * Pour finir, dans la méthode main, constituez un jeu
 * contenant divers types de cartes et faites afficher le jeu grace
 * à une méthode afficher propre à cette classe
 */


package com.runtrack.jour03;

// Classe abstraite pour toutes les cartes
abstract class Carte {
    protected int cout;
    public Carte(int cout){
        this.cout = cout;
    }
    public abstract void afficher();
    public int getCout(){
        return cout;
    }   
}

//Classe pour les cartes terrain
class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur){
        super(0);
        this.couleur = couleur;
        System.out.println("Création d'une carte de type Terrain");
    }

    @Override
    public void afficher(){
        System.out.println("Terrain - Coût : " + cout + ", Couleur : " + couleur);
    }

    public char getCouleur(){
        return couleur;
    }
}
