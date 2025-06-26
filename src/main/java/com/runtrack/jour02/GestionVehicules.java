/*
 * JOUR 02 JOB 4 RUNTRACK JAVA
 * 
 * Dans un fichier GestionVehicules.java 
 * définir une classe Vehicule qui a pour attributs des informations
 * valables pour tout type de vehicule
 * - sa marque
 * - sa date d'achat
 * - son prix d'achat
 * - son prix courant.
 * 
 * Definir un constructeur prenant en paramètre
 * les trois attributs correspondant à la marque
 * la date d'achat, et le prix d'achat, le prix courant sera 
 * calculé plus tard
 * Définir une méthode publique void affiche() qui affiche 
 * l'état de l'instance, c'est à dire la valeur de ses attributs 
 * 
 */
//========================================================
//                          JOB 4.0
//========================================================

// package com.runtrack.jour02;

// public class GestionVehicules {
//     public static void main(String[] args){
//         Vehicule v = new Vehicule("Renault", "01/01/2020", 20000 );
//         v.affiche();
//     }
// }

// class Vehicule {
//     String marque;
//     String dateAchat;
//     double prixAchat;
//     double prixCourant;

//     Vehicule(String marque, String dateAchat, double prixAchat){
//         this.marque = marque;
//         this.dateAchat = dateAchat;
//         this.prixAchat = prixAchat;
//     }
    
    // void affiche() {
    //     System.out.println("Marque: " + marque + ", Date: " + dateAchat + ", Prix: " + prixAchat + ", Prix courant: " + prixCourant);
    // }
// }

//JOB 4.1
/*
 * Définir deux classes Voiture et Avion, héritant de la classe
 * Véhicule et ayant les attributs supplémentaires suivants:
 * Pour la classe Voiture :
 *  - sa cylindrée
 *  - son nombre de portes;
 *  - sa puissance;
 *  - son kilométrage.
 * Pour la classe Avion :
 *  - son type de moteur 
 * ("HELICES" ou autre, nous utiliserons "REACTION" pour les exemples);
 * - son nombre d'heures de vol
 * Définir, pour chacune de ces classes, 
 * un constructeur permettant l'initialisation explicite 
 * de l'ensemble des attributs ainsi qu'une méthode affichant
 * la valeur des attributs 
 * Constructeurs et méthodes d'affichage devront utiliser les
 * méthodes appropriées de la classe parente.
 */

 //========================================================
//                          JOB 4.1
//========================================================

//  package com.runtrack.jour02;

// public class GestionVehicules {
//     public static void main(String[] args){
//         Vehicule v = new Voiture("Renault", "01/01/2020", 20000, 2000, 5, 130, 50000 );
//         v.affiche();

//         Avion a = new Avion("Boeing", "01/01/2019", 1000000, "HELICES", 5000);
//         a.affiche();
//     }
// }

// class Vehicule {
//     String marque;
//     String dateAchat;
//     double prixAchat;
//     double prixCourant;

//     Vehicule(String marque, String dateAchat, double prixAchat){
//         this.marque = marque;
//         this.dateAchat = dateAchat;
//         this.prixAchat = prixAchat;
//     }
    
    // void affiche() {
    //     System.out.println("Marque: " + marque + ", Date: " + dateAchat + ", Prix: " + prixAchat + ", Prix courant: " + prixCourant);
    // }
// }

// class Voiture extends Vehicule {
//     int cylindres;
//     int nbPortes;
//     int puissance;
//     int kilometrage;

//     Voiture(String marque, String dateAchat, double prixAchat, int cylindres, int nbPortes, int puissance, int kilometrage){ 
//         super(marque, dateAchat, prixAchat);
//         this.cylindres = cylindres;
//         this.nbPortes = nbPortes;
//         this.puissance = puissance;
//         this.kilometrage = kilometrage;
// }

// void affiche(){
//     super.affiche();
//     System.out.println("Cylindrée : " + cylindres + ", portes : " + nbPortes + ", Puissance : " + puissance + ", km : " + kilometrage);
//     }
// }

// class Avion extends Vehicule {
//     String typeMoteur;
//     int nbHeuresVol;

//     Avion(String marque, String dateAchat, double prixAchat, String typeMoteur, int nbHeuresVol) {
//         super(marque, dateAchat, prixAchat);
//         this.typeMoteur = typeMoteur;
//         this.nbHeuresVol = nbHeuresVol;
//     }

//     void affiche() { 
//         super.affiche();
//         System.out.println("Moteur : " + typeMoteur + ", Heures de vol : " + nbHeuresVol);
//     }
// }

/*
 * Job 4.2
 * Ajouter une méthode void calculePrix(int anneActuelle) dans la classe
 * Vehicule qui à ce niveau fixe le prix courant au prix d'achat moins 1 % 
 * par année (entre la date d'achat et la date actuelle)
 * Re définir cette méthode dans les deux sous-classes Voiture et Avion de
 * sorte à calculer le prix courant en fonction de certains critères, et mettre à
 * jour l'attribut correspondant au prix courant :
 * - pour une voiture, le prix courant est égale au prix d'achat, moins :
 *  2% pour chaque année depuis l'achat jusqu'à la date actuelle
 *  5% pour chaque tranche de 10000km parcourus (on arrondit à la tranche la plus proche)
 *  10% s'il s'agit d'un véhicule de marque "Renault" ou "Fiat" (ou d'autres marques de votre choix)
 *  et + 20% s'il s'agit d'un véhicule de marque "Ferrari" ou "Porche" (idem)
 * - Pour un avion, le prix courant est égal au prix d'achat, moins :
 *  10% pour chaque tranche de 100 heures de vol s'il s'agit d'un avion à hélices
 *  10% pour chaque tranche de 1000 heures de vol pour les autres types de moteurs
 *  Le prix doit rester positif (donc s'il est négatif, on le met à 0)
 * 
 */
//========================================================
//                          JOB 4.2
//========================================================

  package com.runtrack.jour02;

public class GestionVehicules {
    public static void main(String[] args){
        Vehicule v = new Voiture("Renault", "01/01/2020", 20000, 2000, 5, 130, 50000 );
        v.calculePrix(2025);
        v.affiche();

        Avion a = new Avion("Boeing", "01/01/2019", 1000000, "HELICES", 5000);
        a.calculePrix(2025);
        a.affiche();
    }
}

class Vehicule {
    String marque;
    String dateAchat;
    double prixAchat;
    double prixCourant;

    Vehicule(String marque, String dateAchat, double prixAchat){
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }
    
    void calculePrix(int anneeActuelle){
        int age = anneeActuelle - Integer.parseInt(dateAchat);
        prixCourant = prixAchat * (1 - 0.01 * age);
    }

    void affiche() {
        System.out.println("Marque: " + marque + ", Date: " + dateAchat + ", Prix: " + prixAchat + ", Prix courant: " + prixCourant);
    }
}

class Voiture extends Vehicule {
    int cylindres;
    int nbPortes;
    int puissance;
    int kilometrage;

    Voiture(String marque, String dateAchat, double prixAchat, int cylindres, int nbPortes, int puissance, int kilometrage){ 
        super(marque, dateAchat, prixAchat);
        this.cylindres = cylindres;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    void calculePrix(int anneeActuelle){
        int age = anneeActuelle - Integer.parseInt(dateAchat);
        prixCourant = prixAchat;
        prixCourant *= (1 - 0.02 * age);
        prixCourant *= (1 - 0.05 * Math.round(kilometrage/10000.0));

        if(marque.equals("Renault") || marque.equals("Fiat")) {
            prixCourant *= 0.9;
        }
        if(marque.equals("Ferrari") || marque.equals("Porche")) {
            prixCourant *= 1.2;
        }
        if(prixCourant < 0) prixCourant = 0;

        }

    void affiche(){
        super.affiche();
        System.out.println("Cylindrée : " + cylindres + ", portes : " + nbPortes + ", Puissance : " + puissance + ", km : " + kilometrage);
        }
}

class Avion extends Vehicule {
    String typeMoteur;
    int nbHeuresVol;

    Avion(String marque, String dateAchat, double prixAchat, String typeMoteur, int nbHeuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.nbHeuresVol = nbHeuresVol;
    }

    void calculePrix(int anneeActuelle) {
        prixCourant = prixAchat;
        if(typeMoteur.equals("HELICES")) {
            prixCourant *= (1 - 0.1 * Math.round(nbHeuresVol/100.0));   
        } else {
            prixCourant *= (1- 0.1 * Math.round(nbHeuresVol/1000.0));
        }
        if(prixCourant < 0) prixCourant = 0;
    }

    void affiche() { 
        super.affiche();
        System.out.println("Moteur : " + typeMoteur + ", Heures de vol : " + nbHeuresVol);
    }
}