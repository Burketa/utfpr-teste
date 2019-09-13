/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import mocklegal.Cliente;
import mocklegal.VisaoCliente;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author PauloAugusto
 */
@RunWith(MockitoJUnitRunner.class)
public class VisaoTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out; 
    
    @Mock
    private Cliente cliente;
    
    @InjectMocks
    VisaoCliente visao;
    
    
    public VisaoTest() {
    }
    
    @Before
    public void inicializar() {
        MockitoAnnotations.initMocks(this);
    }
    
    
   
    //Objetivo: testar a visualização do nome do cliente
    @Test
    public void visaoTest(){
        when(cliente.getNome()).thenReturn("Paulo");
        visao.mostrarNome();
    }

    @Test
    public void visaoTest2(){
        //Aqui estamos testando um System.out.println!!!
        //Em um caso de teste de visão de JFrame, se você quiser analisar o resultado de um campo,
        //basta pegar o text do campo e usar no assertEquals
        //Seria algo como: assertEquals("texto",txtNome.getText());
        //O problema de uma visão com System.out.println, é que ela não vai retornar nada. Ela simplesmente apresenta na tela
        //Mas a string apresentada no prompt pode ser recuperada!
        System.setOut(new PrintStream(outContent));
        
        when(cliente.getNome()).thenReturn("Paulo");
        
        visao.mostrarNome();
       
        assertEquals("O nome do cliente é: Paulo",outContent.toString().subSequence(0, outContent.size()-2));
        
    }
    
    
  
}
