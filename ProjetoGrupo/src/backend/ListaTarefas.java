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
import java.util.*;
public class ListaTarefas {
    
    //declaração das variaveis
    private final ArrayList<Tarefa> ListaTarefas;
    
    //construtor
    public ListaTarefas(){
        ListaTarefas=new ArrayList<Tarefa>();
    }
    
    //Inserir uma nova tarefa
    public void inserirTarefa(Tarefa t){
        ListaTarefas.add(t);
    }
    
    //Remover uma tarefa
    public void removerTarefa(Tarefa t){
        ListaTarefas.remove(t);
    }
}
