package br.com.etechoracio.pw2jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw2jpa.entity.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario , Long> {

}
