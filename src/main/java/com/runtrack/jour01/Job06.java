/*
 * JOUR 01 JOB 06 RUNTRACK JAVA
 * Ecrire un programme en java qui 
 * demande à l'utilisateur de taper 5 entiers 
 * et qui affiche leur moyenne.
 * Vous êtes limités à 2 variables.
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job06 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double somme = 0;

    for (int i = 0; i < 5; i++) {
    somme += sc.nextDouble();
    }
System.out.println(somme / 5);
sc.close();
}
}

//Pour compiler et executer : .\run.bat jour01.Job06
//on utilise double pour permettre les resultats avec des decimales
//la boucle for s'execute 5 fois (de 0 à 4) et à chaque  