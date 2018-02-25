package com.example.namasa.aprianil__1202150082_modul3;

/**
 * Created by arya on 24/02/18.
 */

public class MenuList {
    //deklarasi variable
    int gambar;
    String nama;
    String desc;


    public MenuList(int gambar, String nama, String desc){
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }

    //method getter untuk gambar
    public int getGambar() {
        return gambar;
    }

    //method getter untuk nama
    public String getNama() {
        return nama;
    }

    //method getter untuk detail
    public String getDesc() {
        return desc;
    }

}


