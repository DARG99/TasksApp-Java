/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Utilizador
 */
import java.util.Calendar;
public class Projeto {
    //declaracao de variaveis
    private Utilizador owner;
    private String titulo;
    private String descricao;
    private Calendar dataInicio;
    private Calendar dataFim;
    private ListaUtilizador pessoasProjeto;
    private ListaTarefas tarefas;
    

    
//construtor
public Projeto (Utilizador owner, String titulo, String descricao, Calendar datainicio, Calendar datafim){
        this.owner=owner;
        this.descricao=descricao;
        this.dataInicio=datainicio;
        this.dataFim=datafim;
        this.titulo = titulo;
        this.tarefas = new ListaTarefas();
        
}

//modificadores 
public void setdescricao(String descriçao){
    this.descricao= descricao;
}

public void setinicio(Calendar novaDataInicio){
    this.dataInicio=novaDataInicio;
}

public void setFim(Calendar novaDataFim){
    this.dataFim=novaDataFim;
}

 public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
//seletores
public Utilizador getowner(){
    return owner;
}
 public String getTitulo() {
    return titulo;
}
 
public String getdescricao(){
    return descricao;
}

public Calendar getinicio(){
    return dataInicio;
}
public Calendar getfim(){
    return dataFim;
}
    @Override
    public String toString(){
    return ("Dados: " + "Descricao: " + descricao + "Data inicio: " + dataInicio + "Data fim: " + dataFim);
}
}



