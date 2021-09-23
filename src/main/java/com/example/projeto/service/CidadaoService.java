package com.example.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.model.Cidadao;
import com.example.projeto.repository.CidadaoRepository;

@Service
public class CidadaoService {    
    @Autowired
    private CidadaoRepository repository;
    
   public Cidadao create(Cidadao obj) {        
        repository.save(obj);
        return obj;
    }

    public Cidadao findById(Long id) {
        Optional<Cidadao> _obj = repository.findById(id);
        return _obj.orElse(null);
    }

    public List<Cidadao> findAll() {        
        return repository.findByDataNascimento();
    }
    
    public List<Cidadao> findByVacina(Long vacinaId) {        
        return repository.findByVacina(vacinaId);
    }
}