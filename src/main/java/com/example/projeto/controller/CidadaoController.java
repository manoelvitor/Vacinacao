package com.example.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.model.Cidadao;
import com.example.projeto.service.CidadaoService;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

	@Autowired
	private CidadaoService service;

	@GetMapping("/{id}")
	public ResponseEntity<Cidadao> getById(@PathVariable Long id) {
		Cidadao obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Cidadao>> getAll() {
		List<Cidadao> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping("/{vacinaId}")
	public ResponseEntity<List<Cidadao>> getByVacina(@PathVariable Long vacinaId) {
		List<Cidadao> obj = service.findByVacina(vacinaId);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Cidadao> post(@RequestBody Cidadao obj) {
		service.create(obj);
		return ResponseEntity.ok().body(obj);
	}

}

