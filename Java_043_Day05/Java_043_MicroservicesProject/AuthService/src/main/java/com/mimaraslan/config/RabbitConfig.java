package com.mimaraslan.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    String directExchangeAuth = "direct-exchange-auth";
    String bindingKeyAuthSave = "binding-key-auth-save";
    String queueAuth = "queue-auth";

    @Bean
    DirectExchange directExchangeAuth(){
        return new DirectExchange(directExchangeAuth);
    }

    @Bean
    Queue queueAuth(){
        return new Queue(queueAuth);
    }

    @Bean
    Binding bindingDirectExchangeQueueAuth(final Queue queueAuth,
                                           final  DirectExchange directExchangeAuth){
        return BindingBuilder.bind(queueAuth).to(directExchangeAuth).with(bindingKeyAuthSave);
    }

}
