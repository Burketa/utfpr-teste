/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomock;

/**
 *
 * @author PauloAugusto
 */
public class Arma {
    private String nome;
    private String tipo;
    private int ataque;
    private int nivelBase=1;
    
    public Arma(String n, String t, int a){
        nome=n;
        tipo=t;
        ataque=a;
    }
    
    public Arma(){
        
    }

    public int getNivelBase() {
        return nivelBase;
    }

    public void setNivelBase(int nivelBase) {
        this.nivelBase = nivelBase;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

   
    
    
}
