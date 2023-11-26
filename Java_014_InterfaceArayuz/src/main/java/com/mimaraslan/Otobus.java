package com.mimaraslan;

public class Otobus extends Arac implements Kanun, Guzergah   {

    @Override
    public String aracKontrolu() {
        return "Haziran ayında yapılır.";
    }

    @Override
    public short hizSiniriAl() {
        return 150;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 12;
    }

    @Override
    public boolean biletDurumu() {
        return false;
    }

    @Override
    public boolean vizeDurumu() {
        return false;
    }
}
