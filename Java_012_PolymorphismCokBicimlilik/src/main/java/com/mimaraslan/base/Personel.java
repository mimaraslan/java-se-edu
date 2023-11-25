package com.mimaraslan.base;

import lombok.*;

@Setter
@Getter
@ToString
public class Personel {

    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;


    public Personel() {
    }

    public Personel(String adi, String soyadi, String telefonNo, String kimlikNo,
                    String hesapNo, int personelNo, String departmani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNo = telefonNo;
        this.kimlikNo = kimlikNo;
        this.hesapNo = hesapNo;
        this.personelNo = personelNo;
        this.departmani = departmani;
    }



    public  void bilgiPersonelYaz(Personel personel) {

        System.out.println("--------------------------");

        if(personel.getAdi()==null)
            personel.setAdi("###");

        if(personel.getSoyadi()==null)
            personel.setSoyadi("###");

        System.out.println("ADI SOYADI: " + personel.getAdi()+ " " + personel.getSoyadi());

        if(personel.getDepartmani()==null)
            personel.setDepartmani("Henüz belirtilmemiştir.");

            System.out.println("DEPARTMAN: " + personel.getDepartmani());
    }


    public void hesapla(){
        System.out.println("Personel hesapla metodu.");
    }

    public void hesapla(int yil, int tutar, int sonuc) {  // int  int  int
    }

}
