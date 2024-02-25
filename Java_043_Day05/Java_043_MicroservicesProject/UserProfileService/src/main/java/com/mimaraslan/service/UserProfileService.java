package com.mimaraslan.service;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.model.UserProfile;
import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.utils.ServiceManager;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
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



/*
    @RabbitListener(queues = {"queue-auth"})
    public void createUserFromQueue(AuthSaveModel model){

        UserProfile dtoObj = UserProfile.builder()
                .authId(model.getAuthId())
                .username(model.getUsername())
                .email(model.getEmail())
                .build();

        System.out.println(model.getAuthId());
        //userProfileService.save();

        save(dtoObj);
    }
*/

    public void saveRabbit(AuthSaveModel model) {
        UserProfile userProfile = IUserProfileMapper.INSTANCE.toUserProfile(model);
        save(userProfile);
    }

}
