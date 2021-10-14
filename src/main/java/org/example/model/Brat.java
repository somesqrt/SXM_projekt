package org.example.model;

public class Brat {
    private String hodnota;

    private int rok;

    public Brat(String hodnota, int rok) {
        this.hodnota = hodnota;
        this.rok = rok;
    }

    public String getHodnota() {
        return hodnota;
    }

    public int getRok() {
        return rok;
    }

    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}
