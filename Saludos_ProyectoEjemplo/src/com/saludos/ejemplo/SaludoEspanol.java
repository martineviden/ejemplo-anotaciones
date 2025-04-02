package com.saludos.ejemplo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class SaludoEspanol implements Saludos {

	@Override
	@PostConstruct
	public void inicializar() {
		System.out.println("Saludo en español iniciado");
	}
	
	@Override
	@PreDestroy
	public void destruir() {
		System.out.println("Saludo en español destruido");
	}
	
	@Override
	public void saludar() {
		System.out.println("¡Hola, mundo!");
	}

}
