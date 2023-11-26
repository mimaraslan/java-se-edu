package com.mimaraslan;

public abstract class Hayvan {

    public Hayvan() {
        System.out.println("Hayvan sinifi");
    }

    public void gidaAl(){
        System.out.println("Hayan yemek yiyecek.");
    }

    public abstract void sesVer();
    public abstract void hareketEt();

}
