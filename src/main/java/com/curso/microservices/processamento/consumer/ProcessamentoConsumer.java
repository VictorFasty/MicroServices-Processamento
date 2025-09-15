package com.curso.microservices.processamento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listenerProcessamentoQueu(@Payload String descricao) {
        System.out.print(descricao);
    }
}
