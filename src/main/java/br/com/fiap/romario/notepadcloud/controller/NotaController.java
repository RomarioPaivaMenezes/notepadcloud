package br.com.fiap.romario.notepadcloud.controller;

import br.com.fiap.romario.notepadcloud.component.NotaComponent;
import br.com.fiap.romario.notepadcloud.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping(value = "/nota")
public class NotaController {

    @Autowired
    NotaComponent notaService;


    @GetMapping(value = "/titulo/{titulo}")
    Nota buscar(@PathVariable(value = "titulo") String titulo){
        return notaService.buscarNota(titulo);
    }

    @PostMapping
    public void salvar(Nota nota){
        notaService.salvar(nota);
    }
}
