 /*
 * JOUR 02 JOB 02 RUNTRACK JAVA
 * le programme Erreur ci-dessous définit les classes
 * E1, E2, E3, E4, E5 et Erreur
 * Pour chacune des 5 instructions d'affichage dans la méthode
 * indiquez si l'instruction est correcte ou fausse.
 * Compiler et corriger le problème pour vérifier les réponses.
 */

// package com.runtrack.jour02;

// class Erreur {
//     public static void main(String args[]){
//         E1 x = new E1();
//         E2 y = new E2();
//         E3 z = new E3();
//         E4 v = new E4();
//         E5 w = new E5();
//         System.out.println(x.a); //Correct ou faux ? : Correct la classe E1 a un attribut 'a' accessible
//         System.out.println(y.c); //Correct ou faux ? : Faux la classe E2 hérite de E1 mais n'a pas accès à l'attribut 'c'
//         System.out.println(z.b); //Correct ou faux ? : Correct la classe E3 hérite de E2 mais n'a pas accès à l'attribut 'b'
//         System.out.println(v.c); //Correct ou faux ? : Faux la classe E4 n'est pas définie dans le code
//         System.out.println(w.a); //Correct ou faux ? : Faux la classe E5 hérite de E4 qui n'est pas définie
//     }
// }

// class E1 {
//     int a = 1;
// }
// class E2 extends E1 { 
//     int b = 2;
// }
// class E3 extends E2 {
//     int c = 3;
// }
// class E5 extends E4 {
//     int e = 5;
// }

//Pour corriger il faut :
// définir la classe E4
// Utiliser uniquement les attributs disponibles dans la hierarchie d'héritage
// OU 
// Modifier la structure des classes pour correspondre aux accès demandés
// Il faut rendre la classe Erreur publique. Dans Java, la classe principale qui contient la méthode main doit être déclarée public
// Correction :

package com.runtrack.jour02;

public class Erreur {
    public static void main(String args[]){
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a); 
        System.out.println(y.c); 
        System.out.println(z.b); 
        System.out.println(v.c); 
        System.out.println(w.a); 
    }
}

class E1 {
    int a = 1;
}
class E2 extends E1 { 
    int b = 2;
    int c = 3;
}
class E3 extends E2 {
    int b = 4;
}
class E4 extends E1 {
    int c = 5;
}
class E5 extends E4 {
    int e = 5;
}
//Pour compiler et executer : .\run.bat jour02.Erreur
