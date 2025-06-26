/*
 * Ecrire un programme java qui demande à l'utilisateur
 * d'entrer un nombre et puis inverse ce nombre et l'affiche
 * à l'utilisateur . Par exemple : 12345 devient 54321
 */
package com.runtrack.jour01;
import java.util.Scanner;

public class Job14 {
    public static void main(String[] args){
        System.out.println("Entrez un nombre composé de plusieurs entiers :");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        int inverse = 0;

        while (nombre > 0){ 
        inverse = inverse * 10 + nombre % 10;
        nombre /= 10;
        }
        System.out.println("Le nombre inversé est : " + inverse);
        sc.close();
    }
}

//Pour compiler et executer : .\run.bat jour01.Job14