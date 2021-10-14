package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Znacky {

    private List<JednaZnacka> zariadenias = new ArrayList<>();

    private List<JednaZnacka> cigareties = new ArrayList<>();

    private List<JednaZnacka> vapes = new ArrayList<>();

    private List<JednaZnacka> ostatne_tabakove_vyrobkies = new ArrayList<>();

    public Znacky(List<JednaZnacka> zariadenias, List<JednaZnacka> cigareties, List<JednaZnacka> vapes, List<JednaZnacka> ostatne_tabakove_vyrobkies) {
        this.zariadenias = zariadenias;
        this.cigareties = cigareties;
        this.vapes = vapes;
        this.ostatne_tabakove_vyrobkies = ostatne_tabakove_vyrobkies;
    }

    public List<JednaZnacka> getZariadenias() {
        return zariadenias;
    }

    public List<JednaZnacka> getCigareties() {
        return cigareties;
    }

    public List<JednaZnacka> getVapes() {
        return vapes;
    }

    public List<JednaZnacka> getOstatne_tabakove_vyrobkies() {
        return ostatne_tabakove_vyrobkies;
    }

    public void setZariadenias(List<JednaZnacka> zariadenias) {
        this.zariadenias = zariadenias;
    }

    public void setCigareties(List<JednaZnacka> cigareties) {
        this.cigareties = cigareties;
    }

    public void setVapes(List<JednaZnacka> vapes) {
        this.vapes = vapes;
    }

    public void setOstatne_tabakove_vyrobkies(List<JednaZnacka> ostatne_tabakove_vyrobkies) {
        this.ostatne_tabakove_vyrobkies = ostatne_tabakove_vyrobkies;
    }
}
