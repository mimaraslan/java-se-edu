package com.mimaraslan;

public class Insan { // scope kapsam
    /*
    String bas;
    String govde;
    String ayak;
    */

    public static void main(String[] args) {

        String firstName = "Berkay";
        String lastName = "Kaya";
        Integer kilo = 65;
        double boy = 1.77abc;

        System.out.println("Adı: " + firstName);
        System.out.println("Soyadı: "+ lastName);
        System.out.println("Kilo: " + kilo);
        System.out.println("Boy: " + boy);

        firstName = "Abdurrahman";
        lastName = "Bıldırcın";
        kilo = 88;
        boy = 1.82;

        System.out.println("\n\nBOY: "+ boy + " - KİLO "+ kilo +  "\n" +   firstName + " " + lastName);


    }

}
