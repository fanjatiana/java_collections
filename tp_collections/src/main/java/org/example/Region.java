package org.example;

public enum Region {

    FRANCE("+33"),
    SUISSE("+41"),
    POLYNESIE("+689"),
    MARTINIQUE("+596"),
    INDONESIE("+62");

    private final String indicatif;

    Region(String indicatif) {
        this.indicatif = indicatif;
    }

    public String getIndicatif() {
        return indicatif;
    }
}
