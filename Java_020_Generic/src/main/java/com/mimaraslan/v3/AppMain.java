package com.mimaraslan.v3;

public class AppMain {

    public static void main(String[] args ) {

        Personel <Integer, String> personel1 = new Personel(100, "ABC");
        Personel <Float, String> personel2 = new Personel(3.14F, "DEF");
        Personel <Double, String> personel3 = new Personel(34.1, "XYZ");

        personel1.yazdir();
        personel2.yazdir();
        personel3.yazdir();
    }
}
