package com.mimaraslan;

public class Taksi extends Arac implements Kanun, BelediyeIstekleri{
    @Override
    public String aracKontrolu() {
        return "2 ayda bir";
    }

    @Override
    public short hizSiniriAl() {
        return 105;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 8;
    }

    @Override
    public String calismaSaatleri() {
        return "Sabah 8 - Akşam 17";
    }

    @Override
    public boolean akilSagligiRaporu() {
        return true;
    }
}
