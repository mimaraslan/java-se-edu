package com.mimaraslan;



public class HataFirlatmak {

    //TODO Bu kısımda çalışılacak.
    public static void main(String[] args)  {

        try {
            short sonuc = yumurlariSayisiniOgrenUnchecked(-1000);
            System.out.println("Yumurta sayısı: " + sonuc);
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        }


/*
        short sonuc = 0;
        try {
            sonuc = yumurlariSayisiniOgrenChecked(-1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Yumurta sayısı: " + sonuc);
*/
    }

    private static short yumurlariSayisiniOgrenUnchecked(int kumesNo) {
        if(kumesNo<0 || kumesNo>500){
            throw new ArithmeticException("Kümes sayısını lütfen doğru giriniz!");
        } else {
            return 1500;
        }
    }


    private static short yumurlariSayisiniOgrenChecked(int kumesNo) throws Exception {
        if((kumesNo>0 && kumesNo<501) || kumesNo<0){
            throw new ArithmeticException("Kümes sayısını lütfen doğru giriniz!");
        } else {
            return 1500;
        }
    }


}
