package com.mimaraslan;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuFlag = true;

        do {
            try {
                System.out.print("1. sayiyi giriniz: ");
                sayi1 = scanner.nextInt();

                System.out.print("2. sayiyi giriniz: ");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam: " + toplam);

                bolme = sayi1 / sayi2;
                System.out.println("Bölme: " + bolme);

                hataDurumuFlag = false;

            } catch (InputMismatchException e) {
                System.out.println("Hata : " + e);
                hataDurumuFlag = false;
            } catch (ArithmeticException e) {
                System.out.println("Hata : " + e);
                hataDurumuFlag = false;
            } catch (NoSuchElementException e) {
                System.out.println("Hata : " + e);
                hataDurumuFlag = false;
            } catch (Exception e) {
                System.out.println("Hata : " + e);
                hataDurumuFlag = false;
            } finally {
                System.out.println("----------------------------");
            }
        } while (hataDurumuFlag);

    }
}

