 /*
 * JOUR 01 JOB 01 RUNTRACK JAVA
 * Vous savez déja afficher System.out.println()
 * Récuperez une saisie clavier et affichez la.
 */

package com.runtrack.jour01;
import java.util.Scanner;

public class Job01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String saisie = sc.nextLine();
        System.out.println(saisie);
        sc.close();

    }
}
//Scanner gère les inputs
//System.in = clavier Vs System.out = terminal
// Pour compiler et executer : .\run.bat jour01.Job01
// il faut entrer le mot dans le terminal et ensuite entrée.
