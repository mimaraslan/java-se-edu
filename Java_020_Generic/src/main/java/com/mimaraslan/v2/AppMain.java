package com.mimaraslan.v2;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {

    public static void main(String[] args) {

        Personel obj = new Personel();
      //  obj.ekranaYaz();

        obj.ekranaYaz(10, "Mert");
        obj.ekranaYaz(10, "Mert", "Kaynak");

        obj.ekranaYaz(15, "Ali");
        obj.ekranaYaz(12, "Ecem");
        obj.ekranaYaz(11, "Helen");

        obj.ekranaYaz("11", "Şadiye");

        obj.ekranaYaz(16f, "Kenan");
        obj.ekranaYaz(103f, "Yağız");

        obj.ekranaYaz(13.6, "Mehmet");
        obj.ekranaYaz(55.2, "Mahir");
        obj.ekranaYaz(18.7, "Senem");


        LinkedList <Integer> ogrenciNo = new LinkedList();
        ogrenciNo.add(1453);
        ogrenciNo.add(1923);

        ArrayList <String> ogrenciList = new ArrayList();
        ogrenciList.add("Yalçın");
        ogrenciList.add("Yakup");
        obj.ekranaYaz(ogrenciNo, ogrenciList);




    }
}
