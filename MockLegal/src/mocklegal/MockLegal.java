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
public class MockLegal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAOCliente dao = new DAOCliente();
        VisaoCliente v = new VisaoCliente();
        ControleCliente control = new ControleCliente(v,dao);
    }
    
}
