package com.mimaraslan._03coklu;

class BasitSinif extends Thread {

    @Override
    public void run(){
        System.out.println("Thread çalışıyor." + Thread.currentThread().getName() );
    }


}



public class AppMain {

    public static void main(String[] args) {

        BasitSinif basitSinif1 = new BasitSinif();
        BasitSinif basitSinif2 = new BasitSinif();
        BasitSinif basitSinif3 = new BasitSinif();
        BasitSinif basitSinif4 = new BasitSinif();

        System.out.println("Thread başlıyor.");

        basitSinif1.setName("GS");
        basitSinif2.setName("BJK");
        basitSinif3.setName("FB");
        basitSinif4.setName("TS");

      //  basitSinif2.setPriority(Thread.MAX_PRIORITY);
      //  basitSinif3.setPriority(1);

        basitSinif1.start();
        basitSinif2.start();
        basitSinif3.start();
        basitSinif4.start();

    }

}