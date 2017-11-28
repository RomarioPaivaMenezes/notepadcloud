package br.com.fiap.romario.notepadcloud.repository;

import br.com.fiap.romario.notepadcloud.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota, String> {

    Nota findByTitulo(String titulo);
    

}

