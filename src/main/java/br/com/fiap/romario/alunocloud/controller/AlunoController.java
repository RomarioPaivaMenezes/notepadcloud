package br.com.fiap.romario.alunocloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.romario.alunocloud.component.AlunoComponent;
import br.com.fiap.romario.alunocloud.model.Aluno;

@Controller
@CrossOrigin
@RequestMapping(value = "/nota")
public class AlunoController {

    @Autowired
    AlunoComponent alunoService;


    @GetMapping(value = "/titulo/{titulo}")
    Aluno buscar(@PathVariable(value = "titulo") String titulo){
        return alunoService.buscarAluno(titulo);
    }

    @PostMapping
    public void salvar(Aluno nota){
        alunoService.salvar(nota);
    }
    
    
	@GetMapping()
	public List<Aluno> buscarTodos(){
		return alunoService.buscarTodos();
	}
	
	@DeleteMapping("/aluno/{titulo}")
	public void apagar(@PathVariable(value = "titulo") String titulo) {
		alunoService.apagar(titulo);
	}
	
	@DeleteMapping()
	public void apagarTodos() {
		alunoService.apagarTodos();
	}
	
}
