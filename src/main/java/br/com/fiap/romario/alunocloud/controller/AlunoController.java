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
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    AlunoComponent alunoService;


    @GetMapping(value = "/rg/{rg}")
    public Aluno buscar(@PathVariable(value = "rg") String rg){
        return alunoService.buscarAluno(rg);
    }

    @PostMapping
    public void salvar(Aluno aluno){
        alunoService.salvar(aluno);
    }
    
    
	@GetMapping()
	public List<Aluno> buscarTodos(){
		return alunoService.buscarTodos();
	}
	
	@DeleteMapping("/aluno/{rg}")
	public void apagar(@PathVariable(value = "rg") String rg) {
		alunoService.apagar(rg);
	}
	
	@DeleteMapping()
	public void apagarTodos() {
		alunoService.apagarTodos();
	}
	
}
