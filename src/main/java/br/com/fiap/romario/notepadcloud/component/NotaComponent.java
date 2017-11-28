package br.com.fiap.romario.notepadcloud.component;

import br.com.fiap.romario.notepadcloud.model.Nota;
import br.com.fiap.romario.notepadcloud.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotaComponent {

    @Autowired
    NotaRepository notaRepository;

    public void salvar( Nota nota){
        Nota notas = notaRepository.findByTitulo(nota.getTitulo());

        if(notas!=null){
            nota.setId(notas.getId());
        }

        notaRepository.save(nota);

    }


    public Nota buscarNota(String titulo){
        Nota nota;
        List<Nota> notas = notaRepository.findByTitulo(titulo);
        if(notas.isEmpty()){
            return new Nota();
        }else {
            return notas.get(0);
        }
    }

}
