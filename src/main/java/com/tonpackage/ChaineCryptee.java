package com.tonpackage;

public class ChaineCryptee {
    private String chaineCryptee;
    private int decalage;

    public ChaineCryptee(String texte, int decalage) {
        if (texte == null) {
            throw new IllegalArgumentException("La chaîne ne peut pas être null");
        }
        this.decalage = decalage;
        this.chaineCryptee = crypte(texte);
    }

    private String crypte(String texte) {
        StringBuilder result = new StringBuilder();
        for (char c : texte.toCharArray()) {
            result.append((char) (c + decalage));
        }
        return result.toString();
    }

    public String getChaineCryptee() {
        return chaineCryptee;
    }

    public String decrypte() {
        StringBuilder result = new StringBuilder();
        for (char c : chaineCryptee.toCharArray()) {
            result.append((char) (c - decalage));
        }
        return result.toString();
    }
}
