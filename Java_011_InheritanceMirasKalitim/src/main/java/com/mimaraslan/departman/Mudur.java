package com.mimaraslan.departman;

import com.mimaraslan.base.Personel;

public class Mudur extends Personel {

    /*
  private String adi;
  private String soyadi;
  private String telefonNo;
  private String kimlikNo;
  private String hesapNo;
  private int personelNo;
  private String departmani;
  */

    private String tahsilDurumu;
    private byte tercubeYili;


    public Mudur() {
    }

    public Mudur(String adi, String soyadi, String telefonNo, String kimlikNo,
                 String hesapNo, int personelNo, String departmani,
                 String tahsilDurumu, byte tercubeYili) {
        super(adi, soyadi, telefonNo, kimlikNo, hesapNo, personelNo, departmani);
        this.tahsilDurumu = tahsilDurumu;
        this.tercubeYili = tercubeYili;
    }


    public String getTahsilDurumu() {
        return tahsilDurumu;
    }

    public void setTahsilDurumu(String tahsilDurumu) {
        this.tahsilDurumu = tahsilDurumu;
    }

    public byte getTercubeYili() {
        return tercubeYili;
    }

    public void setTercubeYili(byte tercubeYili) {
        this.tercubeYili = tercubeYili;
    }




    public  void mudurBilgisiniYaz(Mudur mudur) {;

        System.out.println("ADI SOYADI: " + mudur.getAdi()+ " " + mudur.getSoyadi());
        System.out.println("TAHSİL: " +  mudur.tahsilDurumu);
        System.out.println("DEPARTMAN: " + mudur.getDepartmani());

    }
}
