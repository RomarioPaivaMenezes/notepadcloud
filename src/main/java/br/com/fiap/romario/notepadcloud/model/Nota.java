package br.com.fiap.romario.notepadcloud.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document
public class Nota {

    @Id
    private String id;
    private String titulo;
    private String descricao;


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id =  id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return  descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
