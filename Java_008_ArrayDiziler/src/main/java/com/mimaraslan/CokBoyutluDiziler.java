package com.mimaraslan;

public class CokBoyutluDiziler {

    public static void main(String[] args) {

        int [][]  sayilar = new  int[3][5];
        //sayilar [0][0] = 23;

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5; j++) {
                sayilar [i][j] = i*j;
            }
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sayilar [i][j] + " ");
            }
            System.out.println();
        }


    }
}
