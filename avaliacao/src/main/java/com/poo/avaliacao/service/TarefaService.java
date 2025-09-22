package com.poo.avaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.avaliacao.dto.TarefaDTO;
import com.poo.avaliacao.model.Tarefa;
import com.poo.avaliacao.repository.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository repository;

    public void adicionar(TarefaDTO dto){
        Tarefa tarefa  = new Tarefa(dto.nome(), dto.descricao(), dto.dataEntrega(), dto.importante());
        repository.save(tarefa);
    }

    public List<Tarefa> listarTodos(){
        return repository.findAll();
    }

    public Tarefa listarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }
}
