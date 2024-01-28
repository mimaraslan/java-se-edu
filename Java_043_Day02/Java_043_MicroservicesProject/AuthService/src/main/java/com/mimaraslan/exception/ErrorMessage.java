package com.mimaraslan.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ErrorMessage {

     Integer code;
     String message;
     private List<String> fields;

     @Builder.Default
     private LocalDateTime date = LocalDateTime.now();
     HttpStatus status;
}
