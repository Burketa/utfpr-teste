/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocklegal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PauloAugusto
 */
public class DAOCliente {
    
    Transaction transaction;
   
    public DAOCliente(){
        transaction = new Transaction();
    }
    
    
    public Cliente buscar(int cod){
        
        Cliente c=new Cliente();
        try{
            String query = "select * from cliente where cod="+cod;
            transaction.execute(query); 
            if(transaction.exists()){
                c.setCod(transaction.getResult().getInt("cod"));
                c.setNome(transaction.getResult().getString("nome"));
            }else{
                c.setCod(0);
                c.setNome("Usuário Inexistente");
            }
            
            
        }catch(Exception e){
            System.out.println("Deu zica!");
        }
            
        return c;
    }
    
    
    
    
    
    
}
