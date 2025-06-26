/*
 * Ecrire un programme java qui demande à l'utilisateur de saisir
 * un entier n et lui affiche la somme des n premiers cubes.
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int somme = 0;

        for (int i = 1; i <= n; i++){
            somme += i*i*i;
        }
        System.out.println(somme);
        sc.close();
    }
}
//Pour compiler et executer : .\run.bat jour01.Job08
//entré n : 4 sortie 100 :)
