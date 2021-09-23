package com.example.projeto.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_vacina")
public class Vacina extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private Integer numDoses;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumDoses() {
		return numDoses;
	}

	public void setNumDoses(Integer numDoses) {
		this.numDoses = numDoses;
	}

	public Vacina() {
	}
}
