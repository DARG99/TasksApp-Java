/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import javax.swing.JOptionPane;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.*;

/**
 *
 * @author Diogo
 */
public class Sistema {
    private ListaUtilizador ListaU;
    private ListaProjetos ListaProjetos;
    private Utilizador utlizadorNow;
    
    public Sistema(){
        this.ListaU = new ListaUtilizador();
        this.ListaProjetos = new ListaProjetos();
    }
    
    //Seletores
    public ListaUtilizador getListaUtilizador() {
        return ListaU;
    }

    public ListaProjetos getListaProjetos() {
        return ListaProjetos;
    }
    
    public Utilizador getUtilizadorNow() {
        return utlizadorNow;
    }
    
    //Modificadores
    public void setListaProjetos(ListaProjetos ListaProjetos) {
        this.ListaProjetos = ListaProjetos;
    }

    public void setListaUtilizador(ListaUtilizador ListaUtilizadores) {
        this.ListaU = ListaUtilizadores;
    }
    
    public void setUtlizadorNow(Utilizador utlizadorNow) {
        this.utlizadorNow = utlizadorNow;
    }
    
}

