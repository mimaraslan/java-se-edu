package com.mimaraslan.controller;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.model.UserProfile;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mimaraslan.constant.EndPoint.*;

//    http://localhost:9091/user

@RequiredArgsConstructor
@RestController
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    //    http://localhost:9091/user/hello
    @GetMapping("/hello")
    public String hello (){
        return "UserProfile Hi" ;
    }

    //    http://localhost:9091/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save (@RequestBody UserProfileSaveRequestDto dto){
        return ResponseEntity.ok(userProfileService.save(dto));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> findAll()   {
        return ResponseEntity.ok(userProfileService.findAll());
    }


}
