package com.mimaraslan;

import java.util.*;

public class MyList {

    public static void main(String[] args) {

        ArrayList <Integer>  sayiList1 = new ArrayList<Integer>();

        HashSet<Integer>  sayiList2 = new HashSet<>();

        TreeSet<Integer> sayiList3 = new TreeSet();

        LinkedHashSet<Integer> sayiList4 = new LinkedHashSet();

        for (int i = 0; i < 100; i++) {
            sayiList1.add(i);
        }

        System.out.println("Liste1: " + sayiList1);

        for ( Integer sayi :  sayiList1) {

            if (sayi == 4) {
                System.out.println("SAYI DEĞERİ: "+ sayi);
                break;
             }
            System.out.println("SAYI DEĞERİ DEVAM: "+ sayi);
        }

    }
}
