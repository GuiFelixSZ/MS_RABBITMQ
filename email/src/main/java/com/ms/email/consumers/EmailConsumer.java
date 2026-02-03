package com.ms.email.consumers;

import com.ms.email.dtos.EmailRecordDTo;
import jakarta.validation.constraints.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDTo EmailRecordDTo) {
        System.out.println(EmailRecordDTo.emailTo());
    }
}

