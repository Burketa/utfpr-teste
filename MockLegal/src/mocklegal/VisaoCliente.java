/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocklegal;

import java.util.Scanner;

/**
 *
 * @author PauloAugusto
 */
public class VisaoCliente {
    private Cliente cliente;
    
    public int menu(){
        System.out.println("1-Buscar Cliente");
        System.out.println("2-Mostrar Cliente");
        System.out.println("0-Sair");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    
    public void mostrarCliente(Cliente c){
        cliente = c;
        if(cliente==null)
            System.out.println("Cliente não existe");
        else{
            System.out.println("Cod: " + cliente.getCod());
            System.out.println("Nome: " + cliente.getNome());
        }
    }
    
    public void mostrarCod(){
        if(cliente==null)
            System.out.println("Cliente inexistente");
        else{
            System.out.println("O código do cliente é: " + cliente.getCod());
        } 
    }
    
    public void mostrarNome(){
        if(cliente==null)
            System.out.println("Cliente inexistente");
        else{
            System.out.println("O nome do cliente é: " + cliente.getNome());
        } 
    }
    
    public int buscarCliente(){
        System.out.println("Digite o código do cliente a ser buscado");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}
