package com.mimaraslan;

import java.util.List;
import java.util.stream.Stream;

public class AppMain {

    public static void main(String[] args) {

        Stream <String> bosKayit = Stream.empty();
        System.out.println("Bos kayıt: "+ bosKayit);

        Stream <String> tekKayit = Stream.of("Yakup");
        System.out.println("Kayıt bilgisi: " + tekKayit);

        Stream <String> cokluKayit = Stream.of("Ali", "Mahir", "Yalçın", "Yunus", "Senem");
        System.out.println("Kayıt bilgileri: " + cokluKayit);

        System.out.println("---------------------------------------------");

        List<String> ogrenciListesi = List.of("Ali", "Mahir", "Yalçın", "Yunus", "Senem");

        System.out.println("Ogrenci bilgileri: " + ogrenciListesi);
        Stream <String> ogencilerStream     =    ogrenciListesi.stream();
                             // parametre     return    cevap
        ogencilerStream.forEach(ogenci        ->        System.out.println(ogenci));
      //  ogencilerStream.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        var kelimeDizisi = new String[] { "Salih", "Ali", "Mahir", "Yalçın", "Yunus", "Senem" };

        for (String kelime: kelimeDizisi) {
            System.out.println(kelime);
        }


    }
}