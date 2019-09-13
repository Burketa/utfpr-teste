/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Aluno
 */
public class Personagem {
    private Arma arma;
    private Armadura armadura;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    public boolean atacar(Armadura ai)
    {
        return arma.getAtaque() + arma.getNivelBase() > ai.getDefesa();
    }
}
