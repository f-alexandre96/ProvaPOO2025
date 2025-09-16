package com.prova.poo.controller;

import com.prova.poo.model.Estudante;
import com.prova.poo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping(path = "/estudantes")
    public Estudante criarEstudante(@RequestBody Estudante novoEstudante){
        return estudanteService.criarEstudante(novoEstudante);
    }

    @GetMapping(path = "/estudantes")
    public List<Estudante> listarEstudantes(){
        return estudanteService.listarEstudante();
    }

    @GetMapping(path = "/estudantes/{id}")
    public Optional<Estudante> buscarEstudante(@PathVariable Long id){
        return estudanteService.buscarEstudante(id);
    }

    @DeleteMapping(path = "/estudantes/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }
}