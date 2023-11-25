package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;
        System.out.println(sayi1 + " " +  sayi2  +  " " +  sayi3 + " " + sayi4 + " " + sayi5) ;

        int [] sayilar = new int [5];
        sayilar[0] =  100;
        sayilar[1] =  200;
        sayilar[2] =  300;
        sayilar[3] =  400;
        sayilar[4] =  500;
        System.out.println(sayilar[0] + " " +sayilar[1] + " " +  sayilar[2]  +  " " +  sayilar[3] + " " + sayilar[4] ) ;

     //   sayilar[5] = 123; // ArrayIndexOutOfBoundsException
     //   System.out.println(sayilar[5]);


        short myArray[] = new short[4];
        myArray[0] = 1000;
     //   myArray[1] = 0;
     //   myArray[2] = 0;
     //   myArray[3] = 0;
        System.out.println(myArray[0]); // 1000
        System.out.println(myArray[1]); // 0
        System.out.println(myArray[2]); // 0
        System.out.println(myArray[3]); // 0


        System.out.println("--------------------------");


        /*
        byte myArrayByte[] = new byte[4];
        myArrayByte[0] = 14;
        myArrayByte[1] = 53;
        myArrayByte[2] = 19;
        myArrayByte[3] = 23;
        */              //    0    1   2   3
        byte myArrayByte[] = {14, 53, 19, 23};
        System.out.println(myArrayByte[0]); // 14
        System.out.println(myArrayByte[1]); // 53
        System.out.println(myArrayByte[2]); // 19
        System.out.println(myArrayByte[3]); // 23

        System.out.println("--------------------------");

        for (int i = 0; i < myArrayByte.length; i++) {
            System.out.println(myArrayByte[i]);
        }

    }
}
