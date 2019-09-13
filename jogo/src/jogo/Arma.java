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
public class Arma {
    private String nome;
    private int ataque;
    private int nivelBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getNivelBase() {
        return nivelBase;
    }

    public void setNivelBase(int nivelBase) {
        this.nivelBase = nivelBase;
    }
}
