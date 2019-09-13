/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocklegal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PauloAugusto
 */
public class Transaction {
    private Connection con;
    private Statement ps;
    private ResultSet rs;
    
    
    public Transaction(){
        
    }
    
    public void execute(String string){
        try{
            createConnection();
            rs = ps.executeQuery(string);
        }catch(Exception e){
            System.out.println("Ops! A execução da query não rolou");
            e.printStackTrace();
        }
    }
    
    public boolean exists(){
        try{
            if(rs.next())
                return true;
        }catch(Exception e){
            System.out.println("Erro em exists.");
            e.printStackTrace();
        }
        return false;
    }
    
    public ResultSet getResult(){
        return rs;
    }
    
    private void createConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("minhaURL","usuario","senha");
        }catch(Exception e){
            System.out.println("Deu zica!");
            e.printStackTrace();
        }   
    }
    
    
}
