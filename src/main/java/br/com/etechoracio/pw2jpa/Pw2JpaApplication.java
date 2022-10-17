package br.com.etechoracio.pw2jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.entity.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	private UsuarioRepository repo;
	

	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Usuario us = new Usuario();
		repo.save(us);
	}

}
