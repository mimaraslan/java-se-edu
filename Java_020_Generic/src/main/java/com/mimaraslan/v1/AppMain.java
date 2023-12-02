package com.mimaraslan.v1;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        ArrayList           myArrayList1 = new ArrayList();
        ArrayList <String> myArrayList2 = new ArrayList();
        myArrayList2.add("Ali");

        PersonelList <String> myListManager = new PersonelList();
        myListManager.liseyeEkle("Ali");


    }
}