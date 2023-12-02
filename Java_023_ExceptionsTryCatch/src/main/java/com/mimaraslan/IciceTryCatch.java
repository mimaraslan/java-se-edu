package com.mimaraslan;

public class IciceTryCatch {

    public static void main(String[] args) {

        int sayi1 = 25;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;

        try {

         //   hesapYap();

            try {
                //TODO burada sıfıra bolme sorunu var
                bolme = sayi1 / sayi2;
                System.out.println("Bölme: " + bolme);
            } catch (ArithmeticException e){
                //FIXME bunu hallet.
                System.out.println("İçteki : "+ e );
            }

            toplam = sayi1 + sayi2;
            System.out.println("Toplama: " + toplam);

            bolme = sayi1 / sayi2;
            System.out.println("Bölme: " + bolme);

        } catch (Exception e){
            System.out.println("Dıştaki : "+ e );

        }
    }

    private static void hesapYap() {
        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;
        try {
            bolme = sayi1 / sayi2;
            System.out.println("Bölme: " + bolme);
        } catch (ArithmeticException e){
            System.out.println("İçteki : "+ e );
        }
    }
}
