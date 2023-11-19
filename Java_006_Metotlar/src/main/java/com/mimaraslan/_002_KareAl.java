package com.mimaraslan;

public class _002_KareAl {

    public static void main(String[] args) {
        System.out.println("Karesi: " + kareAl(5, 2));
        System.out.println("TOPLAMA:" + topla(5, 2, 4));
    }

    public static float topla(int sayi1, int sayi2, int sayi3) {
        return sayi1+ sayi2 + sayi3;
    }

    private static double kareAl(double taban, double üs) {
       return Math.pow(taban, üs);
    }
}
