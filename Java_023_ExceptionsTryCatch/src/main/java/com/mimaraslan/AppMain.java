package com.mimaraslan;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;

        Scanner scanner  = new Scanner(System.in);

        boolean hataDurumuFlag = false;

        do {
                try {
                    System.out.print("1. sayiyi giriniz: ");
                    sayi1 = scanner.nextInt();

                    System.out.print("2. sayiyi giriniz: ");
                    sayi2 = scanner.nextInt();

                    toplam = sayi1 + sayi2;
                    System.out.println("Toplam: "+ toplam);

                    //TODO buna dikkat et
                    bolme = sayi1 / sayi2;
                    System.out.println("Bölme: "+  bolme);

                    hataDurumuFlag = false;

                } catch (Exception e) {
                    System.out.println("Hata : " + e);
                    hataDurumuFlag = true;
                } finally {
                    System.out.println("----------------------------");
                }
        } while (hataDurumuFlag);

    }
}

