package com.mimaraslan.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Mutlaka modeller serileştirilmelidir.
 * Paket ismi de dahil bu sınıfın aynısı iletilen serviste de olmalıdır.
 */
@Builder // bir siniftan nesne turetmek icin
@Data // set get metotlarini otomatik tanimlar
@NoArgsConstructor // bos paramereli hazirlayici yapici metodu olusturur
@AllArgsConstructor // dolu paramereli hazirlayici yapici metodu olusturur
public class AuthSaveModel implements Serializable {

        private Long authId;
        private String username;
        private  String email;
}
