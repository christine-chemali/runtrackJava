/*
 * JOUR 01 JOB02 RUNTRACK JAVA
 * Ecrire un programme java qui demande un prénom
 * et qui répond "bonjour prénom"
 */
package com.runtrack.jour01;
import java.util.Scanner;

public class Job02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String prenom = sc.nextLine();
        System.out.println("Bonjour :) " + prenom);
        sc.close();

    }
}

//Pour compiler et executer : .\run.bat jour01.Job02
//Entrer son prénom en utilisant le clavier puis entrée
//On doit voir apparaitre : bonjour prenom
