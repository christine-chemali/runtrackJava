/*
 * JOUR 01 JOB 09 RUNTRACK JAVA
 * Ecrire un programme java qui demande à l'utilisateur de
 * saisir son age et de lui afficher qu'il est mineur si son
 * âge est infèrieur à 18 ans et qu'il est majeur dans le cas
 * contraire
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job09 {
    public static void main(String[] args){
        System.out.println("Entrez votre age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("mineur");
        } else {
            System.out.println("majeur");
        }
        sc.close();
    }
}

//Pour compiler et executer : .\run.bat jour01.Job09
