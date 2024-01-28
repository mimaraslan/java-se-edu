package com.mimaraslan.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // bir sinifin kolayca nesne oluşturmasını sağlar.
@Data // set get metotlarini otomatik tanimlar
@NoArgsConstructor // bos paramereli hazirlayici yapici metodu olusturur
@AllArgsConstructor // dolu paramereli hazirlayici yapici metodu olusturur
public class DoRegisterRequestDto {

  //  @Size (min = 3, max = 50)
    private String username;

//   @Email (message = "Lütfen geçerli mail girin.")
    private String email;

   // private static final String PASSWORD_PATTERN =
    //        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    //  @NotBlank (message = "Şifre boş geçilemez.")
    //@Pattern(regexp = PASSWORD_PATTERN)
    private String password;
    private String rePassword;

}
