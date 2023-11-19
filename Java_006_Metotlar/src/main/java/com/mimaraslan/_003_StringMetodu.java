package com.mimaraslan;

public class _003_StringMetodu {

    private static void cizgiCek() {
        System.out.println("----------------------");
    }

    private String hesabiKapat(int uyeNo, String adi, String soyadi, boolean uyeDurumu) {

        if( (uyeBul(uyeNo) == true) && (uyeDurumu == true)  ){

            return "TAMAM HESAP BORCU "+ adi + " "+  soyadi + " İÇİN ÖDENMİŞTİR.";

        }

        return "OLMADI";

    }

    private static boolean uyeBul(int uyeNo) {

        if(uyeNo > 0)
        {
            return true;
        }
        return false;
    }

    private void selamVer(String isim) {
        System.out.println("SELAMLAR SAYIN " + isim + " HOŞGELDİZ.");
    }
    public static void main(String[] args) {

        String  firsName = new String();
        _003_StringMetodu obj = new _003_StringMetodu();


        String adi = "Şadiye";

        System.out.println(adi.length());

        if (adi.length() > 5) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }

        cizgiCek();

        String adi2 = "Mustafa";
        String adi3 = "Mehmet";

        if (adi2 == adi3) {
            System.out.println("EŞİT");
        } else {
            System.out.println("Değil");
        }

        cizgiCek();

        if (adi2.equals(adi3)) {
            System.out.println("EŞİT");
        } else {
            System.out.println("Değil");
        }

        cizgiCek();

        obj.selamVer("Mert Kaynak");
        obj.selamVer("Mustafa Yıldız");

        cizgiCek();

        String sonuc = obj.hesabiKapat(1, "Merve",  "Türk", true);
        System.out.println("GELEN CEVAP: " + sonuc);

        /*
        f(x) = y
        g(a) = b
       f(g(a)) = z
         */


    }




}
