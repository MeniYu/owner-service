package io.incondensable.config.jms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author abbas
 */
@Component
@EnableRabbit
public class OtpListener {

    @RabbitListener(queues = {"notification_fanout_queue"})
    public OtpGeneratedPayload receive(String otpGeneratedPayload) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode payloadNode = mapper.readTree(otpGeneratedPayload);
        OtpGeneratedPayload res = mapper.convertValue(payloadNode, new TypeReference<>() {
        });
        System.out.println(res.getUserId());
        System.out.println(res.getOtpCode());
        System.out.println(res.getEmailAddress());
        return res;
    }

}
