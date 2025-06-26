/*
 * JOUR 01 JOB 13 RUNTRACK JAVA
 * Ecrire un programme java qui demande à l'utilisateur
 * de saisir un nombre entier n inférieur ou égal à 9 et de lui
 * afficher la table de multiplication de ce nombre
*/
package com.runtrack.jour01;
import java.util.Scanner;


public class Job13 {
    public static void main (String[] args){
        System.out.println("Entrez votre nombre entier infèrieur ou égal à 9 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("La table de multiplication : ");
        
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i +" = " + (n*i));
        }
        sc.close();
    }
}

//Pour compiler et executer : .\run.bat jour01.Job13
