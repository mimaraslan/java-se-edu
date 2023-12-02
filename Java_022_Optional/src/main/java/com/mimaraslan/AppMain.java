package com.mimaraslan;

import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        System.out.println("id: " + ogrenci.getId());
        System.out.println("adi: " + ogrenci.getAdi());
        System.out.println("soyadi: " + ogrenci.getSoyadi());

        System.out.println("--------------------");
        ogrenci = new Ogrenci("Salih");
        System.out.println("id: " + ogrenci.getId());
        System.out.println("adi: " + ogrenci.getAdi());
        System.out.println("soyadi: " + ogrenci.getSoyadi());

        System.out.println("--------------------");
        ogrenci = null;
      //  System.out.println(ogrenci);
        try {
            System.out.println("id: " + ogrenci.getId());
            System.out.println("adi: " + ogrenci.getAdi());
            System.out.println("soyadi: " + ogrenci.getSoyadi());
        } catch (Exception e){
            System.out.println("Hata: "+ e);
        }


        Optional <Double> ortalama = ortalamaHesapla ( ); //50, 77, 33, 55, 66, 8.8, 55.2, 12.2, 10

        if(ortalama.isPresent()){
            System.out.println("Sınavların ortalaması: " + ortalama.get());
        } else {
            System.out.println("Henüz sınav yapılmadı");
        }


    }

    private static Optional<Double> ortalamaHesapla(double... notlar) {

        if (notlar.length == 0)
            return Optional.empty();


        double toplamDegeri = 0.0;
        for (double not : notlar) {
           // toplamDegeri = toplamDegeri + not;
            toplamDegeri +=  not;
           // System.out.println(not);
        }

        double sonucOrtalama = toplamDegeri/notlar.length;

        return Optional.of(sonucOrtalama);
    }


}