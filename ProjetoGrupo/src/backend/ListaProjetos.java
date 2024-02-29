/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Rita Miranda
 */
import java.util.*;
public class ListaProjetos {
    
    //Instancia
    private  ArrayList<Projeto> projeto;
    
    //Construtor
    public ListaProjetos(){
    projeto = new ArrayList<Projeto>();
}
    //seletor
    public ArrayList<Projeto> getListaProjetos() {
        return projeto;
    }
    
    //modificador 
    public void setListaProjetos (ArrayList<Projeto> projeto ){
           this.projeto = projeto;
    }
    //Inserir um projeto 
    public void inserirProjeto (Projeto p){
        projeto.add(p);
    }
   
   //Remover um projeto
   public void removerProjeto (Projeto p){
       projeto.remove(p);
   }
}
