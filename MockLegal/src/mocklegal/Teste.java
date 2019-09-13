/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocklegal;

/**
 *
 * @author PauloAugusto
 */
public class Teste {
    private DAOCliente dao;
    public Teste(DAOCliente d){
        dao = d;
        
    }
    
    public Cliente fazAlgo(){
       
        Cliente c = dao.buscar(1);
        return c;
    }
    
}
