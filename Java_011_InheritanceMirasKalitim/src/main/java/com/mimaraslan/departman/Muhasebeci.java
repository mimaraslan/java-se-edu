package com.mimaraslan.departman;

import com.mimaraslan.base.Personel;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Muhasebeci extends Personel {
    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;
    */
    private String unvani;
    private long sertifikaNo;
}
