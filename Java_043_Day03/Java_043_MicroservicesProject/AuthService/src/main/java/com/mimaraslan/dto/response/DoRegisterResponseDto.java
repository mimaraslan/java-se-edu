package com.mimaraslan.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // bir sinifin kolayca nesne oluşturmasını sağlar.
@Data // set get metotlarini otomatik tanimlar
@NoArgsConstructor // bos paramereli hazirlayici yapici metodu olusturur
@AllArgsConstructor // dolu paramereli hazirlayici yapici metodu olusturur
public class DoRegisterResponseDto {

    private String username;
    private String email;
}
