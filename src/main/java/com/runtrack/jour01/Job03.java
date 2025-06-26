/*
 * JOUR 01 JOB 03 RUNTRACK JAVA
 * Ecrire un programme java qui crée un tableau de 10 entiers
 * qui stocke dans l'ordre les entiers de 0 à 9
 * Combien vaut T[0], T[1], T[5], T[9] et T[10]
 */

package com.runtrack.jour01;

public class Job03 {
    public static void main(String[] args){
        int[] T = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(T[0]);
        System.out.println(T[1]);
        System.out.println(T[5]);
        System.out.println(T[10]);
    }
}

//Pour compiler et executer : .\run.bat jour01.Job03
// 0
// 1
// 5
// [WARNING]
// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//Il y a donc une erreur parce que l'index 10 est hors limites