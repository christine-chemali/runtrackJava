/*
 * JOUR 02 JOB 05 RUNTRACK JAVA
 * 
 * JOB 5.0
 * Le programme ABCDEF ci-dessous implémente la hierachie
 * de 6 classes
 * Affectations entre les classes
 * Dans la méthode main du programme ABCDEF, pour chaque affectation 
 * à des variables représentant des objets des classes A, b, C, D, E, et f
 * indiquez si elle est correcte.
 * Si ce n'est pas le cas, expliquez pourquoi.
 * 
 * JOB 5.1
 * Dans la deuxième partie de la méthode main,
 * le tableau as (de type A[]) est rempli d'objets des classes
 * A, B, C, D, E et F.
 * Ecrivez le code de la méthode rechercher pour qu'elle affiche
 * le nombre d'objets de type B qui se trouvent 
 * dans le tableau
 * Exemple d'exécution :
 * il y a 4 instances de la classe B
 * 
 * JOB 5.2
 * Ecrire la méthode additonner pour qu'elle affiche
 * la somme des variables d'instance d des objets qui 
 * se trouvent dans le tableau as
 * exemple d'execution :
 * Somme des variables d : 9
 */

package com.runtrack.jour02;

public class ABCDEF {
    public static void main(String[] args){
        //indiquez si les affectations suivantes sont correctes:
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;        //Correct - une réf de sous-classe (B) peut être assignée à sa super-classe (A)
        //b = a;       //Incorrect - une réf de super-classe (A) ne peut pas être dirctement assigée à sa sous-classe (B)
        a = (A) b;   //Correct - Cast explicite de B vers A (mais redondant car déja possible implicitement)
        a = null;    //Correct - toute réf peut être null
        //null = a;    //Incorrect - null est une valeur littérale, pas une variable
        a = d;       //Correct - D hérite de A
        //b = d;       //Incorrect - D n'hérite pas de B (D hérite directement de A)  
        a = e;       //Correct - E hérite de A (via D)
        d = e;       //Correct - E hérite de D

        //Remplissage d'un tableau
        A[] as = new A[10];
        as[0] = new A();    //Correct
        as[1] = new B();    //Correct - B hérite de A
        as[2] = new D(2); //Correct - D hérite de A
        as[3] = new E();    //Correct - E hérite de A 
        as[4] = new C();    //Correct - C hérite de A (via B)
        as[5] = new D(4); //Correct - D hérite de A
        as[6] = new B();    //Correct - B hérite de A

        //Ajouter le code des deux méthodes ci dessous
        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        //remplir
        int count = 0;
        for(A a : as){
            if(a instanceof B && !(a instanceof C)) count++;
        }
        System.out.println("Il y a " + count + " instances de la classe B");
    }

    private static void additionner(A[] as){
        //remplir
        int sum = 0;
        for(A a : as){
            if(a instanceof D d) sum += d.d;
        }
        System.out.println("Somme des variables d : " + sum);
    }
}

class A{
    public A() {}
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C(){
        super();
    }
}

class D extends A {
    protected int d = 1;

    public D (int x) {
        super();
        d = x;
    }
    public D() {}
}

class E extends D {
    public E() {
        super();
    }
}

class F extends D {
    public F() {
        super();
    }
}
