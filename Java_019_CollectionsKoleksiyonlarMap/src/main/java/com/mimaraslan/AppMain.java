package com.mimaraslan;

import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class AppMain {
    public static void main(String[] args) {

        System.out.println("--------TreeMap-----------------------------");

        Map <String, Integer> plakaListe = new TreeMap();
        plakaListe.put("Konya", 42);
        plakaListe.put("Adana", 01);
        plakaListe.put("Eskişehir", 26);
        plakaListe.put("Gaziantep", 27);
        plakaListe.put("İzmir", 35);
        plakaListe.put("Ağrı", 04);
        // plakaListe.put(null, null); // HATA
        plakaListe.put("Kars", null);
        plakaListe.put("Yalova",77);
        plakaListe.put("İstanbul", 34);
        System.out.println(plakaListe);

        for ( String anahtarKey : plakaListe.keySet()) {
            System.out.println("Plaka bilgisi: " + anahtarKey +  " " + plakaListe.get(anahtarKey));
        }

        System.out.println("--------LinkedHashMap-----------------------------");

        Map <String, Integer> plakaListe2 = new LinkedHashMap<>();
        plakaListe2.put("Konya", 42);
        plakaListe2.put("Adana", 01);
        plakaListe2.put("Eskişehir", 26);
        plakaListe2.put("Gaziantep", 27);
        plakaListe2.put("İzmir", 35);
        plakaListe2.put("Ağrı", 04);
        plakaListe2.put(null, null);
        plakaListe2.put("Kars", null);
        plakaListe2.put("Yalova",77);
        plakaListe2.put("İstanbul", 34);
        System.out.println(plakaListe2);

        for ( String anahtarKey : plakaListe2.keySet()) {
            System.out.println("Plaka bilgisi: " + anahtarKey +  " " + plakaListe2.get(anahtarKey));
        }


        System.out.println("--------HashMap-----------------------------");

        Map <String, String> plakaListe3 = new HashMap<>();
        plakaListe3.put("Konya", "42");
        plakaListe3.put("Adana", "01");
        plakaListe3.put("Eskişehir", "26");
        plakaListe3.put("Gaziantep", "27");
        plakaListe3.put("İzmir", "35");
        plakaListe3.put("Ağrı", "04");
        plakaListe3.put(null, null);
        plakaListe3.put("Kars", null);
        plakaListe3.put("Yalova","77");
        plakaListe3.put("İstanbul", "34");
        System.out.println(plakaListe3);

        for ( String anahtarKey : plakaListe3.keySet()) {
            System.out.println("Plaka bilgisi: " + anahtarKey +  " " + plakaListe3.get(anahtarKey));
        }


    }
}