package com.tonpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChaineCrypteeTest {

    // Test constructeur avec décalage, cryptage et décryptage
    @Test
    public void testCryptageEtDecryptage() {
        ChaineCryptee cc = new ChaineCryptee("bonjour", 3);
        assertNotEquals("bonjour", cc.getChaineCryptee(), "La chaîne cryptée ne doit pas être égale à la chaîne claire");
        assertEquals("bonjour", cc.decrypte(), "Le décryptage doit retrouver la chaîne originale");
    }

    // Test avec chaîne vide
    @Test
    public void testChaineVide() {
        ChaineCryptee cc = new ChaineCryptee("", 5);
        assertEquals("", cc.getChaineCryptee(), "La chaîne cryptée d'une chaîne vide doit être vide");
        assertEquals("", cc.decrypte(), "Le décryptage d'une chaîne vide doit être vide");
    }

    // Test que constructeur avec chaîne null lance exception
    @Test
    public void testNullDoitLancerException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ChaineCryptee(null, 2);
        }, "Le constructeur doit lancer IllegalArgumentException si la chaîne est null");
    }

    // Test constructeur sans décalage (ou avec valeur par défaut) - ici, on suppose cryptage sans décalage (juste chaîne brute)
    @Test
    public void testCrypterChaineSimple() {
        ChaineCryptee cc = new ChaineCryptee("abc");
        // D'après ta classe, crypte() renvoie la chaîne brute sans modification
        assertEquals("abc", cc.crypte(), "La méthode crypte doit renvoyer la chaîne brute dans ce cas");
    }

    // Test constructeur sans décalage avec chaîne null
    @Test
    public void testCrypterChaineNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ChaineCryptee(null);
        }, "Le constructeur doit lancer IllegalArgumentException si la chaîne est null");
    }
}

