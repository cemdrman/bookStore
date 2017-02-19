package model;

import java.io.Serializable;

/**
 * Created by cem on 17.02.2017.
 */


public class Kitap implements Serializable {

    private int id;
    private String kitapIsim;
    private String yazarIsim;
    private int sayfaSayisi;
    private String[] kategoriList = new String[3];

    public Kitap(String kitapIsim, String yazarIsim, int sayfaSayisi) {
        this.kitapIsim = kitapIsim;
        this.yazarIsim = yazarIsim;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapIsim() {
        return kitapIsim;
    }

    public void setKitapIsim(String kitapIsim) {
        this.kitapIsim = kitapIsim;
    }

    public String getYazarIsim() {
        return yazarIsim;
    }

    public void setYazarIsim(String yazarIsim) {
        this.yazarIsim = yazarIsim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

}
