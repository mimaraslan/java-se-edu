package com.mimaraslan;

public class AppMain {
    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        kedi.sesVer();
        kedi.hareketEt();
        kedi.gidaAl();
        System.out.println("-------------------");
        Hayvan hayvan = new Kedi();
        hayvan.sesVer();
        hayvan.hareketEt();
        hayvan.gidaAl();

    }
}
