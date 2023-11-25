package com.mimaraslan.departman;

import com.mimaraslan.base.Personel;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Muhasebeci extends Personel {
    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;
    */
    private String unvani;
    private long sertifikaNo;

    @Override
    public void hesapla(){
        System.out.println("Muhasebeci hesapla metodu 1.");
    }


    public void hesapla(int maas){
        System.out.println("Muhasebeci hesapla metodu 2.  :  " + maas);
    }

    public void hesapla(int p1, int p2) { // int int
        System.out.println("Muhasebeci 2 parametereli  :  " + p1  + " " + p2);
    }

    public void hesapla(int yil, int tutar, String sonuc) {  // int int String

    }

    public void hesapla(String p3, int p2, int p1) {  // String int int
    }

    public void hesapla(int ccc, String bbb, int aaa) { //  int String int
    }

    public String hesapla(int yil, int tutar, String sonuc, byte gun) { //  int  int  String byte
       return "Selam";
    }

    @Override
    public void hesapla(int yil, int tutar, int sonuc) {  // int  int  int
    }


}
