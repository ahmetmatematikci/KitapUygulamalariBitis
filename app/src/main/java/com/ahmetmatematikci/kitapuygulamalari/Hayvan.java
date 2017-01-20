package com.ahmetmatematikci.kitapuygulamalari;

/**
 * Created by a on 1/19/17.
 */
public class Hayvan {
    String isim;
    int resim;


    public Hayvan(int resim , String isim){


        this.isim = isim;
        this.resim = resim;


    }

    public String getIsim() {
        return isim;
    }

    public int getResim() { return resim;}
}
