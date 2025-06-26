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
 * Pour simplifier on jouera les cartes dans l'ordre ou
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

// Classe pour les cartes créatures
class Creature extends Carte {
    private String nom;
    private int degats;
    private int pointsDeVie;

    public Creature(String nom, int degats, int pointsDeVie, int cout){
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.pointsDeVie = pointsDeVie;
        System.out.println("Création d'une carte de type Créature");
    }

    @Override
    public void afficher() {
        System.out.println("Créature - Coût : " + cout + "; Nom : " + nom + "; Dégats : " + degats + "; Points de vie : " + pointsDeVie);
    }
    
    public String getNom(){
        return nom;
    }
    public int getDegats(){
        return degats;
    }
    public int pointsDeVie(){
        return pointsDeVie;
    }
}

//Classe pour les cartes sortilèges
class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication, int cout){
        super(cout);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Création d'une carte de type Sortilège");
    }

    @Override
    public void afficher(){
        System.out.println("Sortilège - Coût : " + cout + "; Nom : " + nom + "; Explication : " + explication);
    }

    public String getNom(){
        return nom;
    }

    public String getExplication(){
        return explication;
    }
}

//Classe pour le jeu de cartes
class Jeu {
    private Carte[] cartes;
    private int nbCartes;
    private static final int MaxCartes = 10;

    public Jeu(){
        cartes = new Carte[MaxCartes];
        nbCartes = 0;
    }

    public void piocher(Carte carte){
        if(nbCartes < MaxCartes){
            cartes[nbCartes] = carte;
            nbCartes++;
            System.out.println("Carte ajoutée au jeu !");
        } else {
            System.out.println("Le jeu est plein, impossible d'ajouter une carte !");
        }
    }

    public void jouer(){
        for (int i = 0; i < nbCartes; i++) {
            if (cartes[i] != null){
                System.out.println("Carte jouée : ");
                cartes[i].afficher();
                cartes[i] = null;
                return;
            }
        }
        System.out.println("Aucune carte à jouer !");
    }

    public void afficher(){
        System.out.println("\n========= AFFICHAGE DU JEU =========");
        System.out.println("Nombre de cartes dans le jeu : " + nbCartes);
        for (int i = 0; i < nbCartes; i++){
            if (cartes[i] != null){
                System.out.println("Carte " + (i  + 1) + " : ");
                cartes[i].afficher();
            } else {
                System.out.println("Carte " + (i + 1) + " - [ Carte Jouée ]");
            }           
        }
        System.out.println("=================================\n");
    }
}

//Classe principale
public class Magic {
    public static void main(String[] args){
        System.out.println("==== CREATION DU JEU DE CARTES MAGIQUES ====\n");
        Jeu monJeu = new Jeu();
        System.out.println("---- Ajout des cartes au jeu ----");

        monJeu.piocher(new Terrain('B'));
        monJeu.piocher(new Terrain('r'));
        monJeu.piocher(new Terrain('v'));

        monJeu.piocher(new Creature("Dragon Rouge", 8, 6, 5));
        monJeu.piocher(new Creature("Gobelin", 2, 1, 1));
        monJeu.piocher(new Creature("Fée", 4, 5, 4));

        monJeu.piocher(new Sortilege("Boule de feu", "Inflige 3 dégats à une cible", 3));
        monJeu.piocher(new Sortilege("Soin", "Restaure 4 points de vie", 2));
        monJeu.piocher(new Sortilege("Foudre", "Inflige 1 dégat à toutes les créatures", 1));

        monJeu.afficher();

        //test du système de jeu
        System.out.println("--- Test du système de jeu ---");
        monJeu.jouer();
        monJeu.jouer();
        monJeu.jouer();

        monJeu.afficher();
    }
}

//Pour compiler et executer : .\run.bat jour03.Magic

//Sortie terminal
// ==== CREATION DU JEU DE CARTES MAGIQUES ====

// ---- Ajout des cartes au jeu ----
// Création d'une carte de type Terrain
// Carte ajoutée au jeu !
// Création d'une carte de type Terrain
// Carte ajoutée au jeu !
// Création d'une carte de type Terrain
// Carte ajoutée au jeu !
// Création d'une carte de type Créature
// Carte ajoutée au jeu !
// Création d'une carte de type Créature
// Carte ajoutée au jeu !
// Création d'une carte de type Créature
// Carte ajoutée au jeu !
// Création d'une carte de type Sortilège
// Carte ajoutée au jeu !
// Création d'une carte de type Sortilège
// Carte ajoutée au jeu !
// Création d'une carte de type Sortilège
// Carte ajoutée au jeu !

// ========= AFFICHAGE DU JEU =========
// Nombre de cartes dans le jeu : 9
// Carte 1 : 
// Terrain - Coût : 0, Couleur : B
// Carte 2 :
// Terrain - Coût : 0, Couleur : r
// Carte 3 :
// Terrain - Coût : 0, Couleur : v
// Carte 4 :
// Créature - Coût : 5; Nom : Dragon Rouge; Dégats : 8; Points de vie : 6
// Carte 5 :
// Créature - Coût : 1; Nom : Gobelin; Dégats : 2; Points de vie : 1
// Carte 6 :
// Créature - Coût : 4; Nom : Fée; Dégats : 4; Points de vie : 5
// Carte 7 :
// Sortilège - Coût : 3; Nom : Boule de feu; Explication : Inflige 3 dégats à une cible
// Carte 8 :
// Sortilège - Coût : 2; Nom : Soin; Explication : Restaure 4 points de vie
// Carte 9 :
// Sortilège - Coût : 1; Nom : Foudre; Explication : Inflige 1 dégat à toutes les créatures
// =================================

// --- Test du système de jeu ---
// Carte jouée :
// Terrain - Coût : 0, Couleur : B
// Carte jouée :
// Terrain - Coût : 0, Couleur : r
// Carte jouée :
// Terrain - Coût : 0, Couleur : v

// ========= AFFICHAGE DU JEU =========
// Nombre de cartes dans le jeu : 9
// Carte 1 - [ Carte Jouée ]
// Carte 2 - [ Carte Jouée ]
// Carte 3 - [ Carte Jouée ]
// Carte 4 :
// Créature - Coût : 5; Nom : Dragon Rouge; Dégats : 8; Points de vie : 6
// Carte 5 :
// Créature - Coût : 1; Nom : Gobelin; Dégats : 2; Points de vie : 1
// Carte 6 :
// Créature - Coût : 4; Nom : Fée; Dégats : 4; Points de vie : 5
// Carte 7 :
// Sortilège - Coût : 3; Nom : Boule de feu; Explication : Inflige 3 dégats à une cible
// Carte 8 :
// Sortilège - Coût : 2; Nom : Soin; Explication : Restaure 4 points de vie
// Carte 9 :
// Sortilège - Coût : 1; Nom : Foudre; Explication : Inflige 1 dégat à toutes les créatures
// =================================