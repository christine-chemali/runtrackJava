/*
 * JOUR 01 JOB 11 RUNTRACK JAVA
 * Ecrire un programme java qui demande à l'utilisateur de saisir
 * un nombre entier n et de lui afficher successivement tous les nombres
 * pairs qui sont inférieurs ou égals à n.
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job12 {
    public static void main(String[] args){
        System.out.println("Entrez un nombre entier :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Les nombres pairs sont : ");
        for (int i = 0; i <= n; i +=2){
            System.out.println(i);
        }
        sc.close();
    }
    
}
// Pour compiler et exécuter : .\run.bat jour01.Job12