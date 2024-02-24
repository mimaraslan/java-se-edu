package com.mimaraslan.rabbitmq.consumer;

import com.mimaraslan.model.UserProfile;
import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = "queue-auth")
    public void createUserFromQueue(AuthSaveModel model){

        System.out.println("===============================");
        System.out.println("MODEL: "+ model);
        System.out.println("MODEL: "+ model.getAuthId());
        System.out.println("MODEL: "+ model.getUsername());
        System.out.println("MODEL: "+ model.getEmail());
        System.out.println("===============================");

        userProfileService.save(UserProfile.builder()
                .authId(model.getAuthId())
                .username(model.getUsername())
                .email(model.getEmail())
                .build());

    }

}
