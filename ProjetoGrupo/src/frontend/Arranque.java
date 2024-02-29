/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Sistema;

/**
 *
 * @author Diogo
 */
public class Arranque {
    private Sistema s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema s = new Sistema();
        
        Start start= new Start(s);
        start.setVisible(true);
        
    }
    
}
