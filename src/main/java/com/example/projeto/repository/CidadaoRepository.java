package com.example.projeto.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.projeto.model.Cidadao;


@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

	// Select -> Selecionar o obj
	// c -> como se fosse o indice que ira percorrer a entidade
	// from Cidadao -> do tipo Cidadao c , como se estanciasse a classe
	// order by c.dataNascimento -> ordene por data de nascimento,
	// como o objeto esta estanciado entao = c.dataNascimento ;

	@Query("select c from Cidadao c order by c.dataNascimento")
	public List<Cidadao> findByDataNascimento();

	// Select -> Selecionar o obj
	// c -> como se fosse o indice que ira percorrer a entidade(obj)
	// from Cidadao -> do tipo Cidadao c , como se estanciasse a classe
	//join c.agendamento -> é usado o join por que tera q acessar a tabela agendamento
	// c.agendamento a -> será o indice
	//where a.data-> será o filtro
	//=?1 -> será o parametro que o elemento recebera da query se tiver 2 parametros o proximo será =?2
	@Query("select c from Cidadao c join c.agendamento a where a.data = ?1")
	public List<Cidadao> findByDataAgendamento(Date agendamento);

	
	// essa query diferente da de cima , 
	//percorre pela classe agendamento dps percorre a classe vacina
	@Query("select c from Cidadao c join c.agendamento a where a.vacina.id = ?1")
	public List<Cidadao> findByVacina(Long vacinaId);
}
