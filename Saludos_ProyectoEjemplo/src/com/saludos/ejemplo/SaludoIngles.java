package com.saludos.ejemplo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class SaludoIngles implements Saludos {

	@Override
	@PostConstruct
	public void inicializar() {
		System.out.println("Saludo en ingles iniciado");
	}
	
	@Override
	@PreDestroy
	public void destruir() {
		System.out.println("Saludo en ingles destruido");
	}
	
	@Override
	public void saludar() {
		System.out.println("Hello, world!");
	}
	
}
