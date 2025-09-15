package com.poo.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.avaliacao.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
    
}
