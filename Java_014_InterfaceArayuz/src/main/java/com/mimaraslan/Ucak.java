package com.mimaraslan;

public class Ucak extends Arac implements Guzergah{
    @Override
    public boolean biletDurumu() {
        return true;
    }

    @Override
    public boolean vizeDurumu() {
        return true;
    }
}
