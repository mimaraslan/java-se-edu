package com.mimaraslan.service;


import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.model.UserProfile;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }


    public Boolean save(UserProfileSaveRequestDto dto) {
    /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAuthId(dto.getAuthId());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        save(userProfile);
         */

/*
        UserProfile userProfile =  UserProfile.builder()
                .authId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();

        save(userProfile);
        */

/*
        save(UserProfile.builder()
                .authId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;
    }



}
