package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {

        boolean medeniDurumu1 = true;  // 1  yes  YES  TRUE
        boolean medeniDurumu2 = false; // 0  no   NO  FALSE

        int sayi0; // 2,147,483,647

        byte yasi1 = 127;  // 127
        short yasi2 = 32767; // 32767
        int sonuc = yasi1 + yasi2;
        System.out.println(sonuc);
 /*
        byte + byte sonucu int tipindedir.
        short + short sonucu int tipindedir.
        byte + short  sonucu int tipindedir.
*/


        int deneme1 = 2_147_483_647;
        int deneme2 = 10;
        long sonuc2 = deneme1 + (long) deneme2;
        System.out.println(sonuc2);


        float piSayisi =  3.14f; // 3.14F;  (float) 3.14;

        double bankaHesabiBilgisi = 12.3456789;

        long hesapBilgisi = 100_000_000;

        float sayimiz1 =  1.0f;
        double sayimiz2 = 2.0;
        double sonucumuz = sayimiz1 + sayimiz2;
        System.out.println(sonucumuz);
    }
}
