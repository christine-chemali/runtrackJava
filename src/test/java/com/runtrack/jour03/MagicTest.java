package com.runtrack.jour03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MagicTest {
    private Jeu jeu;

    @DisplayName("Magic Tests")
    @BeforeEach
    public void setUp() {
        jeu = new Jeu();
    }

    @DisplayName("Test piocher ajouter carte")
    @Test
    public void testPiocherAjouteCarte() {
        // Création d'une carte de terrain
        Terrain terrain = new Terrain('B');
        
        // Ajout de la carte au jeu
        jeu.piocher(terrain);
        
        // Vérification que la carte a bien été ajoutée
        assertEquals(1, jeu.getNbCartes()); 
        assertNotNull(jeu.getCarte(0)); 
    }

    @DisplayName("Test piocher jeux plein")
    @Test
    public void testPiocherJeuPlein() {
        // Ajout de 10 cartes pour remplir le jeu
        for (int i = 0; i < 10; i++) {
            jeu.piocher(new Terrain('B'));
        }
        
        // Tentative d'ajout d'une 11ème carte
        Terrain terrain = new Terrain('R');
        jeu.piocher(terrain);
        
        // Vérification que le nombre de cartes reste 10
        assertEquals(10, jeu.getNbCartes()); 
    }
}