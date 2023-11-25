package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {

        Musteri musteri = new Musteri(
                "Ali",
                "Yağız",
                "12345",
                123456789L,
                30000.15);
        System.out.println(musteri);

        musteri.setAdi("Ecem");
        musteri.setSoyadi("Koro");

        System.out.println(musteri.getAdi());
        System.out.println(musteri.getSoyadi());
        System.out.println(musteri.getIban());
        System.out.println(musteri.getHesapCuzdani());
        System.out.println(musteri.getHesapNo());

        musteri.setHesapNo(9999L);
        System.out.println(musteri.getHesapNo());


    }
}
