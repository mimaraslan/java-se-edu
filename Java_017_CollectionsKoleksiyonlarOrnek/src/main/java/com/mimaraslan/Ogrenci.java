package com.mimaraslan;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    private String adi;
    private String soyadi;
    private String okulNumarasi;
    private List<Ders> ders;

}
