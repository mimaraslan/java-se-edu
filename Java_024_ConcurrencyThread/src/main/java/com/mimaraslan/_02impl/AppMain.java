package com.mimaraslan._02impl;

class BasitSinif implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread çalışıyor." + Thread.currentThread().getName() );
    }
}



public class AppMain {

    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread başlıyor.");

        Thread thread =new Thread(basitSinif);
        thread.start();

    }

}