package com.mimaraslan.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "COUNTRY", length = 100)
    private String ulke;

    @Column(name = "CITY")
    private String sehir;

    @Column(name = "ILCE")
    private String ilce;

    @Column(name = "MAHALLE")
    private String mahalle;

    public Address() {
    }

    public Address(String sehir, String ilce, String mahalle) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
}
