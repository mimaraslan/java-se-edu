package com.mimaraslan.v2;

public class Personel {
/*
   public void ekranaYaz(){
       System.out.println("Ekrana Yaz Mesajı");
    }
    */
/*
    public void ekranaYaz(Integer numarasi, String adi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }

    public void ekranaYaz(String numarasi, String adi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }

    public void ekranaYaz(Double numarasi, String adi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }

    public void ekranaYaz(Float numarasi, String adi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }
*/


    public <GelenTip1, GelenTip2> void ekranaYaz(GelenTip1 numarasi, GelenTip2 adi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }


    public <GelenTip1, GelenTip2, GelenTip3> void ekranaYaz(GelenTip1 numarasi, GelenTip2 adi, GelenTip3 soyadi) {

        System.out.println("No: " + numarasi + " Adı: "+ adi );
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------");
    }
}
