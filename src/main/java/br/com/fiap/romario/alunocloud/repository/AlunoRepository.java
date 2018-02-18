package br.com.fiap.romario.alunocloud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.romario.alunocloud.model.Aluno;

import java.util.List;

public interface AlunoRepository extends MongoRepository<Aluno, String> {

    Aluno findByTitulo(String titulo);
    

}

