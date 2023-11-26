package com.mimaraslan;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {
    private Dersler adi;
    private String kodu;
    private Ogretmen ogretmen;

    public float ortalamaAl(byte sinav1, byte sinav2 ){
        return ((float) sinav1+sinav2)/2;
    }

}
