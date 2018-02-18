package br.com.fiap.romario.alunocloud.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.romario.alunocloud.model.Aluno;
import br.com.fiap.romario.alunocloud.repository.AlunoRepository;

@Component
public class AlunoComponent {

    @Autowired
    AlunoRepository alunoRepository;

    public void salvar( Aluno aluno){
        Aluno alunos = alunoRepository.findByTitulo(aluno.getTitulo());

        if(alunos!=null){
            aluno.setId(alunos.getId());
        }

        alunoRepository.save(aluno);

    }


    public Aluno buscarAluno(String titulo){
        Aluno aluno = alunoRepository.findByTitulo(titulo);
        if(aluno!=null){
            return new Aluno();
        }else {
            return aluno;
        }
    }
    
    
	
	public List<Aluno> buscarTodos(){
		return alunoRepository.findAll();
	}
	
	public void apagar(String titulo) {
		Aluno aluno = alunoRepository.findByTitulo(titulo);
			alunoRepository.delete(aluno);

	}
	
	public void apagarTodos() {
		alunoRepository.deleteAll();
	}
	

}
