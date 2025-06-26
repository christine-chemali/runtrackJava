
/*JOB 00 JOUR 01 RUNTRACK JAVA
 * Déclarer une variable de chaque type (char, string, int, long, float, boolean)
 * Afficher les valeurs stockées
 * Pour int TOTO, stocker 3.817 puis afficher la valeur de TOTO
 * Que constate t'on ?
 */

 package com.runtrack.jour01;

public class Job00
{
    public static void main(String[] args) { 

    char c='A';
    String s="Hello";
    int i= 10;
    int TOTO = (int)3.817;
    long l= 1000000L;
    float f= 3.14f;
    boolean b = true;

    System.out.println(c);
    System.out.println(s); 
    System.out.println(i);
    System.out.println(TOTO);
    System.out.println(l); 
    System.out.println(f);
    System.out.println(b);

    }
}

//Pour TOTO : Cela affiche 3 en console, la partie décimale ne s'affiche pas ... :) prévisible

//Pour compiler et executer : .\run.bat jour01.Job00