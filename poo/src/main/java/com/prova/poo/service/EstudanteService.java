package com.prova.poo.service;

import com.prova.poo.model.Estudante;
import com.prova.poo.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante criarEstudante(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarEstudante() {
        return estudanteRepository.findAll();

    }

    public Optional<Estudante> buscarEstudante(Long id){
        return estudanteRepository.findById(id);
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }
}