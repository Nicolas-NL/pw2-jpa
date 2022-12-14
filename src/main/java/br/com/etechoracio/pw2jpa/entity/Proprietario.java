package br.com.etechoracio.pw2jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.etechoracio.pw2jpa.enums.TipoPessoaEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter	
@Getter
@Table(name="TBL_PROPRIETARIO")
public class Proprietario {
	@Id
    @Column(name = "ID_PROPRIETARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    @Column(name = "TX_NOME")
	private String nome;
    
    @Column(name = "TP_PROPRIETARIO")
	private TipoPessoaEnum tipo;
    
    @Column(name = "TX_DOCUMENTO")
	private String documento;
    
    @JoinColumn(name="ID_TELEFONE")
    @OneToOne
	private Telefone telefone;

}
