package com.mimaraslan;

public class Musteri {
   private String adi = "İsim Belirtilmemiştir.";
   private String soyadi;
   private String iban;
   private Long hesapNo;
   private Double hesapCuzdani;

    public Musteri() {
        System.out.println("Boş parametreli");
    }

    public Musteri(String adi, String soyadi, String iban,
                   Long hesapNo, Double hesapCuzdani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.iban = iban;
        this.hesapNo = hesapNo;
        this.hesapCuzdani = hesapCuzdani;
    }

    public Musteri( String soyadi, String iban,
                   Long hesapNo, Double hesapCuzdani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.iban = iban;
        this.hesapNo = hesapNo;
        this.hesapCuzdani = hesapCuzdani;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Double getHesapCuzdani() {
        return hesapCuzdani;
    }

    public void setHesapCuzdani(Double hesapCuzdani) {
        this.hesapCuzdani = hesapCuzdani;
    }

   public String hesalariVer(){
        return "Hesaplandı.";
    }
}
