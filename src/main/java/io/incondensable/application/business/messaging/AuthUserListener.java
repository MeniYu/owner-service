package io.incondensable.application.business.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.incondensable.application.business.domain.jms.AuthUserToOwnerServiceDTO;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author abbas
 */
@Component
@EnableRabbit
public class AuthUserListener {

    private final RabbitTemplate rabbitTemplate;

    public AuthUserListener(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

//    @RabbitListener(queues = {"owner_queue"})
//    public AuthUserToOwnerServiceDTO receiveAuthUser(String payload) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        AuthUserToOwnerServiceDTO user = mapper.readValue(payload, new TypeReference<>() {
//        });
//
//    }

}
