package com.mimaraslan;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        int sayi1 = 1;
        int sayi2 = 2;

        int[] sayilar = new int[10];

        List           myListe1 = new ArrayList();
        myListe1.add("Mehmet"); // index 0
        myListe1.add(10); //index 1

        List<Long> myListe2 = new LinkedList<>();
        myListe2.add(100L);
        myListe2.add(200L);

        System.out.println("Liste1 : " + myListe1);
        System.out.println("Liste2 : " + myListe2);

        System.out.println("Liste1 isEmpty : " + !myListe1.isEmpty());
        System.out.println("Liste1 contains : " + myListe1.contains("Mehmet"));


        myListe1.add("Ali"); // index 2
        System.out.println("Liste1 : " + myListe1);


        myListe1.remove(0);
        System.out.println("Liste1 : " + myListe1);


        List <Integer> myList3 = new LinkedList();
        myList3.add(100);
        myList3.add(10);
        myList3.add(3);
        myList3.add(25);
        myList3.add(124);
        System.out.println(myList3);

        Collections.sort(myList3);
        System.out.println(myList3);






    }
}
