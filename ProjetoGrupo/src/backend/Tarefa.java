/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Diogo
 */
import java.util.Calendar;
public class Tarefa implements java.io.Serializable{
    //declaraçao de variaveis
    private String titulo, descricao, estado, prioridade;
    private Utilizador owner;
    private Utilizador pessoaTarefa;
    private Calendar dataFim;
    
    //Construtor
    public Tarefa (String titulo, String descricao, String estado, String prioridade, Utilizador owner, Utilizador pessoaTarefa, Calendar dataFim){
     this.titulo = titulo;
     this.descricao = descricao;
     this.estado = estado;
     this.prioridade = prioridade;
     this.owner = owner;
     this.pessoaTarefa = pessoaTarefa;
     this.dataFim = dataFim;
    }
    
    //seletores
    public String getTitulo(){
        return titulo; 
    }
    public String getDescricao(){
        return descricao;
    }
    public String getEstado(){
        return estado;
    }
    public String getPrioridade(){
        return prioridade;
    }
    public Utilizador getOwner(){
        return owner;
    }
    public Utilizador getPessoaTarefa(){
        return pessoaTarefa;
    }
    public Calendar getDataFim(){
        return dataFim;
    }
    
    //modificadores
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }
    public void setDescricao(String novaDescricao){
        descricao = novaDescricao; 
    }
    public void setEstado(String novoEstado){
        estado = novoEstado;
    }
    public void setPrioridade(String novaPrioridade){
        prioridade = novaPrioridade;
    }
    public void setPessoaTarefa(Utilizador novaPessoa){
        pessoaTarefa = novaPessoa;
    }
    public void setDataFim (Calendar novaData){
        dataFim = novaData;
    }
    //toString
    public String toString(){
        return "Tarefa:"+ "\n Titulo -> " + titulo + "\n Descrição -> " + descricao + "\n Estado -> " + estado + "\n Prioridade -> " + prioridade + "\n Owner -> " + owner
                + "\n Pessoa responsavel pela tarefa -> " + pessoaTarefa + "\n Data fim da tarefa -> " + dataFim ;
    }
}

