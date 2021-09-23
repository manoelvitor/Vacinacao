package com.example.projeto.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_agendamento")
public class Agendamento extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	private Integer dose;
	
	@ManyToOne
	private Vacina vacina;

	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getDose() {
		return dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public Agendamento() {
	}

}
