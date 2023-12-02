package com.mimaraslan;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List<String> ogrenciList = new ArrayList();
        ogrenciList.add("Şadiye");
        ogrenciList.add("Mert");
        ogrenciList.add("Mustafa");
        ogrenciList.add("Fatih");
        ogrenciList.add("Ebru");
        ogrenciList.add("Kenan");
        ogrenciList.add("Mahir");
        ogrenciList.add("Kenan");
        ogrenciList.add("Mert");
        ogrenciList.add("Mert");
        ogrenciList.add(null);
        System.out.println("ArrayList Ogrenciler: " + ogrenciList);

        Set<String> ogrenciList2 = new HashSet();
        ogrenciList2.add("Şadiye");
        ogrenciList2.add("Mert");
        ogrenciList2.add("Mustafa");
        ogrenciList2.add("Fatih");
        ogrenciList2.add("Ebru");
        ogrenciList2.add("Kenan");
        ogrenciList2.add("Mahir");
        ogrenciList2.add("Kenan");
        ogrenciList2.add("Mert");
        ogrenciList2.add("Mert");
        ogrenciList2.add(null);
        System.out.println("HashSet Ogrenciler2: " + ogrenciList2);

        Set<String> ogrenciList3 = new TreeSet<>();
        ogrenciList3.add("Şadiye");
        ogrenciList3.add("Mert");
        ogrenciList3.add("Mustafa");
        ogrenciList3.add("Fatih");
        ogrenciList3.add("Ebru");
        ogrenciList3.add("Kenan");
        ogrenciList3.add("Mahir");
        ogrenciList3.add("Kenan");
        ogrenciList3.add("Mert");
        ogrenciList3.add("Mert");
       // ogrenciList3.add(null);
        System.out.println("TreeSet OgrenciList3: " + ogrenciList3);

        Set<String> ogrenciList4 = new LinkedHashSet<>();
        ogrenciList4.add("Şadiye"); // 0
        ogrenciList4.add("Mert");   // 1
        ogrenciList4.add("Mustafa");  // 2
        ogrenciList4.add("Fatih");  // 3
        ogrenciList4.add(null);
        ogrenciList4.add("Ebru");
        ogrenciList4.add("Kenan");
        ogrenciList4.add("Mahir");
        ogrenciList4.add("Kenan");
        ogrenciList4.add("Mert");
        ogrenciList4.add("Mert");
        System.out.println("LinkedHashSet ogrenciList4: " + ogrenciList4);

        ogrenciList4.remove("Şadiye");
        System.out.println("LinkedHashSet ogrenciList4: " + ogrenciList4);

        ogrenciList4.remove("Ogün");
        System.out.println("LinkedHashSet ogrenciList4: " + ogrenciList4);


        if (ogrenciList4.isEmpty()){
            System.out.println("Bu liste boştur.");
        } else {
            System.out.println("Liste dolu.");
        }

        ogrenciList4.clear();
        System.out.println("LinkedHashSet ogrenciList4: " + ogrenciList4);

        if (ogrenciList4.isEmpty()){
            System.out.println("Bu liste boştur.");
        } else {
            System.out.println("Liste dolu.");
        }

    }
}
