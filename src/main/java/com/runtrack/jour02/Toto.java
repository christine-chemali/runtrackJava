/*
 * Ce code fonctionne t'il et sinon quelle(s) erreur(s)
 * l'interpréteur va t'il indiquer ?
 */
// package com.runtrack.jour02;

// class Toto {
//     int toto = 0;
//     Toto() {
//         toto = toto + 1;
//     }
//     public static void main(String[] tutu){
//         Toto t1 = new Toto();
//         Toto t2 = new Toto();
//         System.out.println("Toto : " + toto);
//     }
// }

/*
 * L'erreur que l'interpreteur va indiquer sera
 * non static variable toto cannot be referenced from a static context
 * le code corrigé pourrait être :
 * System.out.println("Toto: " + t1.toto);
 * ou
 * static int toto = 0;
 */
