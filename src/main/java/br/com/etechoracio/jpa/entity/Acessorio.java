package br.com.etechoracio.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter	
@Getter
@Table(name="TBL_ACESSORIO")
public class Acessorio {

	@Id
	@Column(name = "ID_ACESSORIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name= "TX_DESCRICAO")
	private String Descricao;
	
}
