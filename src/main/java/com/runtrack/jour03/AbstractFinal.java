/*
 * Jour 03 JOB 00 RUNTRACK JAVA POLY - L'ART Abstrait
 * 
 * Le programme AbstractFinal ci-dessous implémente une petite
 * hièrarchie de 4 classes (A, B, C et D). 
 * Il y a 3 erreurs dans la méthode main et une erreur dans la classe D
 * Toutes les erreurs sont dues à une utilisation erronée
 * des modificateurs abstract et final
 * Expliquez ces erreurs
 *  
 */

// package com.runtrack.jour03;

// public class AbstractFinal {
//     public static void main(String[] args){
//         A[] tab = new A[3];
//         tab[0] = new B();
//         tab[1] = new C();
//         tab[1].b = 2;       //Erreur 1 : b n'est pas un membre de A
//         ((C)tab[2]).c + 3;  //Erreur 2 : tab[2] est null + opération inutile
//                             //Erreur 3 : c est final, ne peut pas être modifié
//     }
// }

// abstract class A {
//     int a;
// }

// class B extends A {
//     int b;
// }

// class C extends A {
//     final double c = 1;
// }

// abstract class D extends A {
//     double d;
//     int operation(int a){
//         return (a*2);
//     }
//     //Erreur 4 : méthode abstraite ne peut pas avoir de corps
//     abstract int calcul(int b){
//     }
// }

/*
 * CORRECTION
 */
package com.runtrack.jour03;

public class AbstractFinal {
    public static void main(String[] args){
        A[] tab = new A[3];
        tab[0] = new B();
        tab[1] = new C();
        ((B)tab[1]).b = 2;   //Pour accéder à b il faut un cast
        //((C)tab[2]).c + 3;  CETTE LIGNE DOIT ETRE SUPPRIMEE 
                                //- la variable c étant final, on ne peut pas la modifier
        tab[2] = new C();    //tab[2] doit être initialisé avant usage
    }
}

abstract class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    final double c = 1;
}

abstract class D extends A {
    double d;
    int operation(int a){
        return (a*2);
    }
    //La méthode abstraite calcul ne peut pas avoir de corps
    //abstract int calcul(int b){}
    abstract int calcul(int b);
}