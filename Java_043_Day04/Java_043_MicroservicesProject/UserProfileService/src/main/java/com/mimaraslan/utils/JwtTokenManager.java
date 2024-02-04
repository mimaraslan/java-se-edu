package com.mimaraslan.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JwtTokenManager {
    /*
    String secretKey = "123";
    String issuer = "abc";
    Long exDate = 1000L*60 * 5; // 5 dakika
    */

       // "123"
    @Value("${auth-service.secret.key}")
    String secretKey;

    // "abc"
    @Value("${auth-service.issuer}")
    String issuer;

    // 1000L*60 * 5; // 5 dakika
    @Value("${auth-service.expire.date}")
    Long expireDate;


   // 1. adım: token üret
    public Optional<String> createToken(Long id){
        String token = "";
        try {
          token = JWT.create().withAudience()
                  .withClaim("id", id)
                  .withClaim("serviceName", "AuthService")
                  .withClaim("lastJoin", System.currentTimeMillis())
                  .withIssuer(issuer) // jwt tokeni olusturan yapi
                  .withIssuedAt(new Date() ) // jwt olusturulma zamani
                  .withExpiresAt(new Date(System.currentTimeMillis() + expireDate ))
                  .sign(Algorithm.HMAC512(secretKey));
          return  Optional.of(token);
        } catch (Exception e){
            return Optional.empty();
        }
    }

   // 2. adım: token doğrulama yap
   public Boolean verifyToken(String token){
        try {
            Algorithm  algorithm =  Algorithm.HMAC512(secretKey);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
            DecodedJWT decodedJWT = verifier.verify(token);

            if(decodedJWT == null)
                return false;

        } catch (Exception e){
            return false;
        }
       return true;
   }

   // 3. token içinden bilgiyi çöz ve çıkar.
   public Optional<Long> getIdInfoFromToken(String token){

       try {
           Algorithm  algorithm =  Algorithm.HMAC512(secretKey);
           JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
           DecodedJWT decodedJWT = verifier.verify(token);

           if(decodedJWT == null)
               return Optional.empty();

           Long id = decodedJWT.getClaim("id").asLong();
           System.out.println("Tokendaki id değeri: "  +  id);

           String serviceName = decodedJWT.getClaim("serviceName").asString();
           System.out.println("Tokendaki serviceName : "  +  serviceName);

           return Optional.of(id);

       } catch (Exception e){
           return Optional.empty();
       }
   }

}
