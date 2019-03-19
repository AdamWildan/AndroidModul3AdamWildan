package id.sch.smktelkom_mlg.www.recyclerview3.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Hotel implements Serializable {
    public String judul, deskripsi, detail, lokasi, foto;

    public Hotel(String judul, String deskripsi, String foto, String detail, String lokasi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
