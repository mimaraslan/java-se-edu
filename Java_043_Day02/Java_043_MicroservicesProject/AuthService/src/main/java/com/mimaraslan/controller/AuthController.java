package com.mimaraslan.controller;

import com.mimaraslan.constant.EndPoint;
import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.response.DoRegisterResponseDto;
import com.mimaraslan.dto.response.DoRegisterResponseIdDto;
import com.mimaraslan.model.Auth;
import com.mimaraslan.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mimaraslan.constant.EndPoint.AUTH;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//    http://localhost:9090/auth

@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    /*  // eskide kalan enjekte edilme durumu
    @Autowired
    private final AuthService authService;
    */



  /*  // 2. durum tavsiye edilen
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
*/


    // 3. durum lombok ile yapılan - sinifin üstüne ekle bunu @RequiredArgsConstructor
    private final AuthService authService;


  //  @PostMapping(EndPoint.REGISTER)
  /* public ResponseEntity<Auth> doRegister1(@RequestBody DoRegisterRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(authService.doRegister(dto));
   }
   */


    //    http://localhost:9090/auth/register
    @PostMapping(EndPoint.REGISTER)
    public ResponseEntity<DoRegisterResponseDto> doRegister(@RequestBody DoRegisterRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(authService.doRegister(dto));
    }


    //    http://localhost:9090/auth/login
    @PostMapping(EndPoint.LOGIN)
    public ResponseEntity<Auth> doLogin(@RequestBody DoLoginRequestDto dto){
        System.out.println("DTO: " +  dto);

        String className = this.getClass().getSimpleName();
       // logger.trace("A TRACE Message: " + className);
       // logger.debug("A DEBUG Message: " + className);
       // logger.info("An INFO Message: " + className);
        logger.warn("A WARN Message: " + className);
       // logger.error("An ERROR Message: " + className);

        return ResponseEntity.ok(authService.doLogin(dto));
    }

    public ResponseEntity<  List <Auth>  > findAll()   {
        return ResponseEntity.ok(authService.findAll());
    }


    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("AuthServis mesaji");
    }

}
