package com.mimaraslan.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    ABC_BULUNAMADI(1003,"Aradığınız ABC sistemde kayıtlı değil", NOT_FOUND),
    ABC_EKLEME_HATASI(2001,"ABC ekleme başarısız oldu", INTERNAL_SERVER_ERROR),
    INVALID_PARAMETER(3001,"Geçersiz parametre girişi yaptınız", HttpStatus.BAD_REQUEST),

    INVALID_TOKEN(4000,"Geçersiz token.",HttpStatus.BAD_REQUEST),

    BAD_REQUEST(5001,"Geçersiz istek" ,HttpStatus.BAD_REQUEST ),
    INTERNAL_ERROR_SERVER(5100,"Sunucu Hatası",INTERNAL_SERVER_ERROR);

    private int code;
    private String message;
    private HttpStatus status;
}
