package com.mimaraslan;

public class _003_Switch {

    public static void main(String[] args) {
        /*
        if (SART1){

        } else if (SART2){

        } else if (SART3){

        } else {

        }
        */

        char harf = 'A';
        switch (harf){
            case 'A':
                System.out.println("Girilen harf :" + harf);
                break;
            case 'B':
                System.out.println("Girilen harf " + harf);
                break;
            case 'C':
                System.out.println("Girilen harf " + harf);
                break;
            default:
                System.out.println("Girdiğin şey bulunamadı." +  harf);
                break;
        }

        System.out.println("------------------------");

        int gunSirasi = 5;
        switch (gunSirasi){
            case 1:
                System.out.println("Pts");
                break;
            case 2:
                System.out.println("Sa");
                break;
            case 3:
                System.out.println("Crş");
                break;
            case 4:
                System.out.println("Per");
                break;
            case 5:
                System.out.println("Cum");
                break;
            case 6:
                System.out.println("Ct");
                break;
            case 7:
                System.out.println("Pz");
                break;
            default:
                System.out.println("Bulunamadı.");
                break;
        }


        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                System.out.println("BULUNDU : " + i);
                break;
               // continue;
            } else {
                System.out.println(i);
            }

        }

    }
}
