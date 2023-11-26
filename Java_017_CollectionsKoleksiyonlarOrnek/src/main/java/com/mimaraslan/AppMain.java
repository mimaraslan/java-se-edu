package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.setAdi("Ecem");
        ogretmen1.setSoyadi("Koro");
        ogretmen1.setAdres("Türkiye");
        ogretmen1.setTelefon("111111");
        ogretmen1.setBrans(Brans.Matematik);

        Ogretmen ogretmen2 = new Ogretmen(
                "Merve",
                "Türk",
                "22222",
                "Almanya",
                Brans.Cografya);

        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen1);
        ogretmenList.add(ogretmen2);

        System.out.println(ogretmenList);

        System.out.println("---------------------------");
        List<Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri, "100", ogretmen1)); // 0
        dersList.add(new Ders(Dersler.Matematik, "103", ogretmen1)); // 1
        dersList.add(new Ders(Dersler.Yazilim, "108", ogretmen1)); // 2
        dersList.add(new Ders(Dersler.Cografya, "205", ogretmen2)); // 3

        System.out.println(dersList);

        System.out.println(dersList.get(2).getOgretmen().getAdi());
        System.out.println(dersList.get(2).getOgretmen().getSoyadi());
        System.out.println(dersList.get(2).getOgretmen().getAdres());
        System.out.println(dersList.get(2).getOgretmen().getTelefon());


        for (int i = 0; i < dersList.size() ; i++) {

            if(Brans.Cografya == dersList.get(i).getOgretmen().getBrans()){
                System.out.println("EVET" + i);
            } else {
                System.out.println("HAYIR" + i);
            }

        }

        System.out.println("---FOR---------------------");

        for (int i = 0; i < dersList.size(); i++) {
            System.out.println(dersList.get(i));
        }

        System.out.println("---FOR EACH---------------------");
        for (Ders ders : dersList) {
            System.out.println(ders);
        }

        System.out.println("---FOR---------------------");

        for (int i = 0; i < dersList.size(); i++) {
          //  System.out.println(dersList.get(i));

            if(dersList.get(i).getKodu() == "108"){
                System.out.println("\tÖĞRETMEN BiLGİSİ: " +
                        dersList.get(i).getOgretmen().getAdi() + " "+
                        dersList.get(i).getOgretmen().getSoyadi() + "  " + Dersler.Yazilim);
            }

            if(dersList.get(i).getKodu() == "205"){
                System.out.println("\tÖĞRETMEN BiLGİSİ: " +
                        dersList.get(i).getOgretmen().getAdi() + " "+
                        dersList.get(i).getOgretmen().getSoyadi() + "  " + Dersler.Cografya);
            }
        }

        System.out.println("---FOR EACH---------------------");

              // TEKIL : COGUL
        for (Ders ders : dersList) {

            if(ders.getKodu()=="108") {
                System.out.println(ders.getOgretmen().getAdi() + " " + ders.getOgretmen().getSoyadi());
                break;
            }

         /*   if(ders.getKodu()=="205") {
                System.out.println(ders.getOgretmen().getAdi() + " " + ders.getOgretmen().getSoyadi());
            }*/

        }

    }
}
