package com.mimaraslan;

public class Kamyon extends Arac implements Kanun, DernekUyeSartlari {

    @Override
    public String aracKontrolu() {
        return "Kasım ayında kontroller yapılır.";
    }

    @Override
    public short hizSiniriAl() {
        return 100;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 10;
    }

    @Override
    public byte ehliyetTecrubeYili() {
        return 5;
    }

    @Override
    public String dernekUyeOnayDurumu() {
        return null;
    }


}
