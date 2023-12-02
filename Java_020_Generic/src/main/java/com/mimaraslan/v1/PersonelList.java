package com.mimaraslan.v1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class PersonelList<T> {

    private ArrayList <T> myList = new ArrayList<>();

    public void liseyeEkle (T eklenecekSey){

        System.out.println("EKLENEN: "+ eklenecekSey + " - Eklenme Zamanı: " + LocalDateTime.now());
        // log
        // islemler
        myList.add(eklenecekSey);
    }

    public ArrayList <T> listeyiGetir(){
        return myList;
    }

}
