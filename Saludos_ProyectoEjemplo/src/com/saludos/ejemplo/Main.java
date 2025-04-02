package com.saludos.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Leer XML de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir los Bean al contenedor
		
		Saludos saludoEsp = contexto.getBean("saludoEspanol", Saludos.class);
		Saludos saludoEng = contexto.getBean("saludoIngles", Saludos.class);
		
		// Uso del Bean
		
		saludoEsp.saludar();
		saludoEng.saludar();
		
		// Cerrar contexto
		
		contexto.close();

	}

}
