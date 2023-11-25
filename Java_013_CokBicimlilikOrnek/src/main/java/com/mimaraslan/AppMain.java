package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        System.out.println("------------------");
        Kopek kopek = new Kopek();
        System.out.println("------------------");
        Kus kus = new Kus();
        System.out.println("------------------");

        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();


        if (kedi instanceof Hayvan ){
            System.out.println("Evet: " + kedi);
        } else {
            System.out.println("Hayır");
        }

        Hayvan hayvan = new Hayvan();
        hayvan.sesVer();
        System.out.println("--------------");


       // Kedi kedi2 = (Kedi) new Hayvan();

        Hayvan hayvan2 = new Kus();
        hayvan2.sesVer();
        System.out.println("--------------");

        Hayvan hayvan3 = new Kedi();
        hayvan3.sesVer();

    }
}
