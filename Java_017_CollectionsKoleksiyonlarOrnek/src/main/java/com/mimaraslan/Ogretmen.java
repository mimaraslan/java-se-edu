package com.mimaraslan;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    private String adi;
    private String soyadi;
    private String telefon;
    private String adres;
    private Brans brans;
}
