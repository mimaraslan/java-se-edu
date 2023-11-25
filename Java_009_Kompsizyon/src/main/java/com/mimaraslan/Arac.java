package com.mimaraslan;

public class Arac {

    public Arac() {
        System.out.println("Arac");
    }

    private Yakit yakit = new Yakit();
    private Depo depo = new Depo();
    private Ayna ayna = new Ayna();
    private Direksiyon direksiyon = new Direksiyon();
    private Koltuk koltuk = new Koltuk();

  public void hareketEt(){

      if(yakit.yakitDurumuKontrol()) {
          System.out.println("Harekete geçildi.");
      } else {
          System.out.println("Yakıt yok.");
      }

      }

}
