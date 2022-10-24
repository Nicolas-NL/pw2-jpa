package br.com.etechoracio.pw2jpa.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.pw2jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.pw2jpa.enums.TipoAgenteEnum;


@Entity
@Table(name = "TBL_AGENTE_AUTUADOR")
public class AgenteAutuador {
	@Id
	@Column(name="ID_AGENTE_AUTUADOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_AGENTE")
	private TipoAgenteEnum Tipo;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="ST_AGENTE")
	private StatusAgenteEnum status; 
	
	@Column(name="TX_FONE")
	private String fone;
}
