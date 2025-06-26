/*
 * JOUR 01 JOB 11
 * Ecrire un programme java qui calcule la factorielle n 
 * d'un entier saisi par  l'utilisateur
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job11 {
    public static void main (String[] args){
        System.out.println("Entrez la valeur dont vous voulez calculer la factorielle :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=n; i++){
            fact *=i;
        }
        System.out.println("Le résultat : " + fact);
        sc.close();
    }
}
//Pour executer et compiler : .\run.bat jour01.Job11