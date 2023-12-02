package com.mimaraslan.v3;

public class Personel
        <GelenTip1 extends Number,
        GelenTip2 extends String> {

    GelenTip1 bilgi1;
    GelenTip2 bilgi2;

    public Personel(GelenTip1 bilgi1, GelenTip2 bilgi2) {
        this.bilgi1 = bilgi1;
        this.bilgi2 = bilgi2;
    }

    void yazdir(){
        System.out.println(bilgi1.getClass().getName());
        System.out.println(bilgi2.getClass().getName());
        System.out.println("-----------------------");
    }
}
