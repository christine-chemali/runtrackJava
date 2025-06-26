/*
 * JOUR 01 JOB 04
 * Ecrire un programme java 
 * qui demande à l'utilisateur de saisir un nombre
 * et de lui afficher son carré
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * n);
        sc.close();
    }
}

//Pour compiler et executer : .\run.bat jour01.Job04
//entrer le chiffre en utilisant le clavier puis entrée
//le carré s'affiche en dessous.
