package br.com.fiap.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Produtor {

	private final RabbitTemplate rabbitTemplate;
	
	public Produtor(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	
	public void enviarMensagem(String... args) throws Exception {
		System.out.println("Enviando mensagem ...");
		
		rabbitTemplate.convertAndSend("fiap.scj.mensagens", 
				null,
				args[0]);
		
	}

}
