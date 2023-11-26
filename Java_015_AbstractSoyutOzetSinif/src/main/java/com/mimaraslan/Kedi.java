package com.mimaraslan;

public class Kedi extends Hayvan implements Kural{
    public Kedi() {
        System.out.println("Kedi sinifi");
    }

    @Override
    public void sesVer() {
        System.out.println("Kedi miyav.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi geziyor.");
    }

    @Override
    public boolean saglikDurumu() {
        return false;
    }
}
