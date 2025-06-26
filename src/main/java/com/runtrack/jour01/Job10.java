/*
 * Ecrire un programme java 
 * qui calcule la factorielle de 8
 */

package com.runtrack.jour01;

public class Job10 {
    public static void main(String[]args){
      int fact = 1;
      for (int i = 1; i <= 8; i++){
        fact *= i;
      }
      System.out.println("La factorielle de 8 est : " + fact);
    }
}
// Pour compiler et executer : 
//40320
    
