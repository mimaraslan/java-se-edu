package com.mimaraslan.service;

import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.dto.response.DoRegisterResponseDto;
import com.mimaraslan.exception.AuthServiceException;
import com.mimaraslan.exception.ErrorType;
import com.mimaraslan.manager.IUserProfileManager;
import com.mimaraslan.mapper.IAuthMapper;
import com.mimaraslan.model.Auth;
import com.mimaraslan.repository.IAuthRepository;
import com.mimaraslan.utils.JwtTokenManager;
import com.mimaraslan.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class AuthService extends ServiceManager<Auth, Long> {

    // @Autowired
    private final IAuthRepository repository;

    private final JwtTokenManager jwtTokenManager;


    private final IUserProfileManager userProfileManager;


    public AuthService(IAuthRepository repository,
                       JwtTokenManager jwtTokenManager,
                       IUserProfileManager userProfileManager) {
        super(repository);
        this.repository = repository;
        this.jwtTokenManager = jwtTokenManager;
        this.userProfileManager = userProfileManager;
    }


    public Auth doRegister1(DoRegisterRequestDto dto) {

        System.out.println("DoRegisterRequestDto: " +  dto);

        // TODO  Exception
        //if (repository.existsByUsername(dto.getUsername()))
        //    throw new Exception()

        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());

        // TODO password rePassword
        auth.setPassword(dto.getPassword());
        auth.setEmail(dto.getEmail());
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);

        save(auth);
        System.out.println("auth: " +  auth);

        return auth;
    }


    public DoRegisterResponseDto doRegister(DoRegisterRequestDto dto) {

        System.out.println("DoRegisterRequestDto: " +  dto);


        // parola kontrolleri yapiliyor
        if (!dto.getPassword().equals(dto.getRePassword()))
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMATCH);


        /*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setPassword(dto.getPassword());
        auth.setEmail(dto.getEmail());
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);
        save(auth); // KAYIT
        */

       /*
        // builder ile nesne - lombok ile nesne
        Auth auth = save(Auth.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .createAt(System.currentTimeMillis())
                .state(true)
                .build());
        */

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);

       // auth.setCreateAt(System.currentTimeMillis());
       // auth.setState(true);
        auth.setAddress("Dünya");
        save(auth); // KAYIT


/*        // Baska bir servisi cagiriyoruz
        userProfileManager.save(UserProfileSaveRequestDto.builder()
                .authId(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build());
*/
        // Baska bir servisi mapper ile cagiriyoruz.
        userProfileManager.save(IAuthMapper.INSTANCE.toDto(auth));

        System.out.println("auth: " +  auth);

        DoRegisterResponseDto responseDto = new DoRegisterResponseDto();
        responseDto.setUsername(dto.getUsername());
        responseDto.setEmail(dto.getEmail());
        return responseDto;
    }


    // JWTsiz sıradan düz bir login
    public String doLoginOld(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        if (auth.isEmpty())
            throw new AuthServiceException(ErrorType.DOLOGIN_USERNAMEORPASSWORD_NOTEXISTS);

        return auth.get().getId().toString();
    }

    /**
     * Kullanıcıyı doğrulayacak ve kullanıcının sistem içinde hareket edebilmesi için ona özel bir kimlik verecek.
     * Token -> JWT token
     */
    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        if (auth.isEmpty())
          throw new AuthServiceException(ErrorType.DOLOGIN_USERNAMEORPASSWORD_NOTEXISTS);

        return jwtTokenManager.createToken(auth.get().getId()).get();
    }

/*
    public Auth doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        return auth.get();
    }
    */


    public List<Auth> findAll(String token) {

        Optional<Long> id = null;

        try{
            id = jwtTokenManager.getIdInfoFromToken(token);
        }catch (Exception e) {
            throw  new AuthServiceException(ErrorType.INVALID_TOKEN);
        }

        if(findById(id.get()).isEmpty())
            throw  new AuthServiceException(ErrorType.INVALID_TOKEN);

        return repository.findAll();
    }



}
