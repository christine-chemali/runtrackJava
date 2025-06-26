/*
 * JOUR 01 JOB 07 RUNTRACK JAVA
 * Ecrire un programme java qui calule la somme 
 * des 100 premiers.
 */

package com.runtrack.jour01;

public class Job07 {
    public static void main(String[] args){
        int somme = 0;
        for (int i = 1; i <= 100; i++){
            somme += i;
        }
        System.out.println(somme);
    }

}
//Pour compiler et executer : .\run.bat jour01.Job07
//5050