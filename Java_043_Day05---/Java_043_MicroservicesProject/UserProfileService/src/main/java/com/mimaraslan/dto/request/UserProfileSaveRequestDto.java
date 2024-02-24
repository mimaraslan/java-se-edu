package com.mimaraslan.dto.request;

import lombok.*;

@Builder // bir siniftan nesne turetmek icin
@Data // set get metotlarini otomatik tanimlar
@NoArgsConstructor // bos paramereli hazirlayici yapici metodu olusturur
@AllArgsConstructor // dolu paramereli hazirlayici yapici metodu olusturur
public class UserProfileSaveRequestDto {

   Long authId;
   String username;
   String email;

}
