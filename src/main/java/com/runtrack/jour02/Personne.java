/*
 * JOUR 02 JOB 00 RUNTRACK JAVA
 * Créer un programme java et définir un objet personne.
 * Il doit disposer :
 * - D'attributs publics : nom, prénom
 * - D'attributs protégés : date de naissance, lieu de naissance
 * - D'attributs privés : adresse, téléphone
 * Quelles sont les différences de ces différents types d'attributs ?
 * Pour quels type a t'on besoin d'acesseurs : getter ou setter ? 
 */

package com.runtrack.jour02;

public class Personne {
    public String nom;
    public String prenom;
    protected String dateNaissance;
    protected String lieuNaissance;
    private String adresse; 
    private String telephone;

    public String getAdressed(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
}

/*
 * Les différents types d'attributs ont
 * les caractéristiques suivantes :
 * 1. Attributs public
 *  accessibles depuis n'importe ou
 * Pas besoin de getters / setters
 *  Ex : nom et prénom peuvent être lus et modifiés directement
 * 2. Attributs protégès :
 * Accessibles dans la même classe, les classes filles et le même package
 * Getters et setters optionnels suivant le besoin d'accès hors package
 * Ex: dateNaissance et lieuNaissance sont accéssibles aux classes héritées
 * 3. Attributs privés :
 * Nécessite des setters et getters pour pouvoir y acceder de l'extèrieur
 * ex : adresse et telephone qui ont des getters et setters
*/

//Pour compiler et executer : .\run.bat jour02.Personne
