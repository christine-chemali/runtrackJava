/*
 * JOUR 01 JOB05 RUNTRACK JAVA
 * Ecrire un programme qui demande à l'utilisateur de saisir
 * successivement trois nombres et de lui afficher le 
 * maximum des deux.
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
        sc.close();

    }
}
// Pour compiler et executer : .\run.bat jour01.Job05
// Math.max(b, c) compare b et c et renvoie le max des 2
//ensuite on le compare à a et cela renvoie le plus grand des 2
//C'est une comparaison deux à deux :)