package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {

        int a = 25;
        int b = 10;
        int c = a + b; // + - * /
        System.out.println("Toplama: "  + c );

        float sonuc = (float) a /  b ;
        System.out.println("Bölme: "  + sonuc );

        System.out.println("Mod alma: " + (a % b) );

        System.out.println(a>b);
        System.out.println(a<b);


        // Ternary Operator
        System.out.println(    (a>b)   ?   "EVET"  :  "HAYIR"    );

        int i = 0;
      //  System.out.println(i+1); // 1
      //  System.out.println(i); // 0

        System.out.println("i: " + i); // 0

       //  i =  i+1;
       // System.out.println("i: " + i); // 1

        System.out.println(++i);
        System.out.println(i++);

        System.out.println(--i);
        System.out.println(i--);

    }

}