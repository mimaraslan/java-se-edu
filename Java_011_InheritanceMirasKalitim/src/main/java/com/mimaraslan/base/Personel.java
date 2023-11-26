package com.mimaraslan.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
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

  /*  @Override
    public String toString() {
        return new StringJoiner(", ", Personel.class.getSimpleName() + "[", "]")
                .add("adi='" + adi + "'")
                .add("soyadi='" + soyadi + "'")
                .add("telefonNo='" + telefonNo + "'")
                .add("kimlikNo='" + kimlikNo + "'")
                .add("hesapNo='" + hesapNo + "'")
                .add("personelNo=" + personelNo)
                .add("departmani='" + departmani + "'")
                .toString();
    }*/
}
