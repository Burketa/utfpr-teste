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
public class ControleCliente {
   //MODELO
   private Cliente cliente;
   private DAOCliente daoCliente;
   
   
   //VISAO
   private VisaoCliente visaoCliente;
   
   
    public ControleCliente(VisaoCliente v, DAOCliente dao){
        visaoCliente = v;
        daoCliente = dao;
    }
    
    public ControleCliente(){
        
    }
    
    public void buscarCliente(){
        int cod = visaoCliente.buscarCliente();
        cliente = daoCliente.buscar(cod);
    }
    
    public void apresentar(){
        visaoCliente.mostrarCliente(cliente);
    }
    
    public void controlar(){
        
        int opt;
        
        do{
            opt=visaoCliente.menu();
            switch(opt){
                case 1:
                    buscarCliente();
                    
                    break;
                case 2:
                    apresentar();
                    break;
            }
            
        }while(opt!=0);
        
    }
    
    
}
