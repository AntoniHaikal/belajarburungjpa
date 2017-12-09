package com.burungjpa.belajarburungjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Burung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String namaburung, jenisburung;

    private int harga;

    public Burung() {

    }

    public Burung(String namaburung, String jenisburung, int harga) {
        this.namaburung = namaburung;
        this.jenisburung = jenisburung;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaburung() {
        return namaburung;
    }

    public void setNamaburung(String namaburung) {
        this.namaburung = namaburung;
    }

    public String getJenisburung() {
        return jenisburung;
    }

    public void setJenisburung(String jenisburung) {
        this.jenisburung = jenisburung;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
