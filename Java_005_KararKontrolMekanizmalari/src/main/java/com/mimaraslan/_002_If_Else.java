package com.mimaraslan;

import java.util.Scanner;

public class _002_If_Else {

    public static void main(String[] args) {
        System.out.println("IF ELSE");

        if (11<50){
            System.out.println("EVET UYGUNDUR.");
        }else {
            System.out.println("HAYIR OLMAZ!");
        }


/*
        System.out.println("--------OY KULLANMA-----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz. : ");
        int yas = sc.nextInt();

        int secmenYasi = 18;

        if (secmenYasi < yas ){
            System.out.println("EVET OY KULLANABİLİRSİNİZ.");
        }else {
            System.out.println("HAYIR HENÜZ OY KULLANAMAZSINIZ.");
        }
*/

/*
        System.out.println("--------EHLIYET KULLANMA 1. DURUM-----------");
        int adayYasi = 16;

        if (adayYasi == 16 ){
            System.out.println("Aday stajyer olabilir.");
        } else if (adayYasi > 17 ) {
            System.out.println("Reşit ehliyet alabilir.");
        } else  {
            System.out.println("Üzgünüm ehliyet için uygun değilsiniz.");
        }
*/


        System.out.println("--------EHLIYET KULLANMA 1. DURUM-----------");
        int adayKisininYasi = 25;
        String saglikDurumu = "HAYIR";

        if (adayKisininYasi == 16 ){

            if (saglikDurumu == "EVET"){
                System.out.println("Aday stajyer olabilir.");
                System.out.println("Sağlıklı");
            } else {
                System.out.println("Sağlıklı değil.");
            }

        } else if (adayKisininYasi > 17 ) {

            if (saglikDurumu == "EVET"){
                System.out.println("Reşit ehliyet alabilir.");
                System.out.println("Sağlıklı");

            } else {
                System.out.println("Sağlıklı değil.");
            }

        } else  {
            System.out.println("Üzgünüm ehliyet için uygun değilsiniz.");
        }


    }
}
