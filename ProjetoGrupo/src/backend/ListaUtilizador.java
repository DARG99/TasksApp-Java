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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ListaUtilizador implements Serializable{
        
        //Instancia
	private ArrayList<Utilizador> ListaU;	
	 
	//Construtor
	public ListaUtilizador(){
		ListaU = new ArrayList <Utilizador>(); 
	}
	
        //Seletor
        public ArrayList<Utilizador> getListaUtilizador(){
             return ListaU;
        }
        //Modificador 
       public void setListaUtilizador (ArrayList<Utilizador> ListaU ){
           this.ListaU = ListaU;
       } 
       
        //Adicionar Utilizador
	public void adicionarUtilizador(Utilizador ListaUtilizador){
		ListaU.add(ListaUtilizador);
	}
	
        //Remover utilizador
	public void removerUtilizador (Utilizador ListaUtilizador){
		ListaU.remove(ListaUtilizador);
	}
        

      
        
            
}
       

        
	
	
