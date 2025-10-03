package com.tonpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChaineCrypteeTest {

    @Test
    public void testCryptageEtDecryptage() {
        ChaineCryptee cc = new ChaineCryptee("bonjour", 3);
        assertNotEquals("bonjour", cc.getChaineCryptee());
        assertEquals("bonjour", cc.decrypte());
    }

    @Test
    public void testChaineVide() {
        ChaineCryptee cc = new ChaineCryptee("", 5);
        assertEquals("", cc.getChaineCryptee());
        assertEquals("", cc.decrypte());
    }

    @Test
    public void testNullDoitLancerException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ChaineCryptee(null, 2);
        });
    }
}
