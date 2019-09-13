/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomock;

import java.util.ArrayList;

/**
 *
 * @author PauloAugusto
 */
public class Personagem {
    
    private Arma arma;
    
    
    public Personagem(Arma a){
        arma=a;
    
    }
    
    public boolean atacar(Armadura a){
        if(arma.getAtaque() + arma.getNivelBase()>a.getDefesa())
            return true;
        else
            return false;
    }
    
   
  
    
}
