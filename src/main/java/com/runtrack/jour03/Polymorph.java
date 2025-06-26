/* JOUR 03 JOB 03 RUNTRACK JAVA
 * Un programmeur amateur produit le code suivant pour tester
 * ses connaissances en POO
 * Il s'attend à ce que son programme produise l'affichage suivant:
 * 
 * une forme rouge 
 * toute ronde
 * une forme jaune 
 * toute pointue
 * 
 * Questions :
 * 1. Expliquer pourquoi ce programme principal ne fait pas 
 * réellement ce qu'il veux.
 * 2 . Qu'affiche t'il ?
 * 3 . Corriger ce programme de sorte qu'il fasse ce que le programmeur
 * voulait à l'origine. Donner le code Java de tout élément ajouté 
 * en précisant à quells classe il appartient et indiquerez les 
 * éventuelles modifications à apporter à la méthode main.
 * 
 * lES CONTRAINTES A RESPECTER SONT LES SUIVANTES
 * Déclaration de tabFormes doit rester inchangée;
 * il ne doit pas y avoir de test de types dans la boucle qui copie
 * les données de tabFormes dans la collection.
 */

package com.runtrack.jour03;

class Polymorph 
{ public static void main(String[] args)
    {
        Forme[] tabFormes = 
        {
            new Cercle("rouge"),
            new Triangle("jaune")
        };

        Collect formes = new Collect(10);

        //Une collection de formes
        //contenant une copie des objets définis
        //dans le tableau tabFormes
        for (int i = 0; i < tabFormes.length; ++i)
        formes.add(new Forme(tabFormes[i]));
        formes.dessine();
    }   
}

class Forme 
{
    private String couleur;

    public Forme(String uneCouleur)
    {
        couleur = uneCouleur;
    }
    public Forme(Forme other)
    {
        this.couleur = other.couleur;
    }
    public void dessine(){
        System.out.println("Une forme " + couleur);
    }
}

class Triangle extends Forme 
{
    public Triangle(String uneCouleur)
    {
        super(uneCouleur);
    }
    public Triangle(Triangle autreTriangle)
    {
        super(autreTriangle);
    }
    public void dessine()
    {
        super.dessine();
        System.out.println("toute pointue");
     }

}

class Cercle extends Forme
{
    public Cercle(String uneCouleur)
    {
        super(uneCouleur);
    }
    public Cercle(Cercle autreCercle)
    {
        super(autreCercle);
    }
    public void dessine()
    {
        super.dessine();
        System.out.println("toute ronde");
    }
}

class Collect
{
    private Forme collect[];
    private int index;

    public Collect(int indexMax)
    {
        collect = new Forme[indexMax];
        index = -1;
    }
    public void add(Forme a)
    {
        if (index < collect.length -1){
            ++ index;
            collect[index] = a;
        }
    }
    public void dessine()
    {
        for (int i = 0; i <= index; ++i)
        collect[i].dessine();
    }
}