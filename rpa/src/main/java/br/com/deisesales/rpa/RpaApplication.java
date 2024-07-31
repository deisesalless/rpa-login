package br.com.deisesales.rpa;

import br.com.deisesales.rpa.service.Automatizacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpaApplication.class, args);

		Automatizacao aut = new Automatizacao();
		aut.executar();
	}

}
