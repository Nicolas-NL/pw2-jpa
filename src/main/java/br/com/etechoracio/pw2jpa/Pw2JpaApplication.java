package br.com.etechoracio.pw2jpa;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.pw2jpa.entity.GrupoUsuario;
import br.com.etechoracio.pw2jpa.repository.GrupoUsuarioRepository;
//import br.com.etechoracio.pw2jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	/*@Autowired
	private UsuarioRepository usuarioRepository;*/
	@Autowired
	private GrupoUsuarioRepository grupoUsuarioRepository;


	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*Usuario us = Usuario.builder().nome("horacio.augusto").senha("etec123").build();
		usuarioRepository.save(us);*/
	
		GrupoUsuario us = GrupoUsuario.builder().nome("horacio.augusto1").dataInicioVigencia(LocalDateTime.of(2010, 10, 2, 5, 2, 9)).dataFimVigencia(LocalDateTime.of(2013, 11, 3, 6, 8, 7)).build();
		grupoUsuarioRepository.save(us);
		GrupoUsuario us2 = GrupoUsuario.builder().nome("horacio.augusto2").dataInicioVigencia(LocalDateTime.of(2010, 10, 2, 5, 2, 9)).dataFimVigencia(LocalDateTime.of(2013, 11, 3, 6, 8, 7)).build();
		grupoUsuarioRepository.save(us2);
		
		
	}

}
	