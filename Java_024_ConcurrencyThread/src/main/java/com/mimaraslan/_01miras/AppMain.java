package com.mimaraslan._01miras;

class BasitSinif extends Thread {

    @Override
    public void run(){
        System.out.println("Thread çalışıyor." + Thread.currentThread().getName() );
    }


}



public class AppMain {

    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread başlıyor.");
        basitSinif.start();

    }

}