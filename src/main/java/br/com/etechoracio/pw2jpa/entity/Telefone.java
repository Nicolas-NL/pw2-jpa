package br.com.etechoracio.pw2jpa.entity;

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
@Table(name="TBL_TELEFONE")
public class Telefone {
	@Id
    @Column(name = "ID_TELEFONE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
    @Column(name = "TX_AREA")
    private String area;
    
    @Column(name = "TX_NUMERO")
    private String numero;
}
