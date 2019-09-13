/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jogo.Arma;
import jogo.Armadura;
import jogo.Personagem;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Aluno
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonagemTest {
    @Mock
    Arma arma;
    
    @Mock
    Armadura armadura;
    
    @InjectMocks
    Personagem personagem;
    
    public PersonagemTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void atacarTest() {
         //Mokando as chamadas
         //(as dependencias)
         when(arma.getAtaque()).thenReturn(10);
         when(arma.getNivelBase()).thenReturn(1);
         when(armadura.getDefesa()).thenReturn(9);
         
         assertTrue(personagem.atacar(armadura));
     }
     
     @Test
     public void errrouAtaqueTest()
     {
         when(arma.getAtaque()).thenReturn(1);
         when(arma.getNivelBase()).thenReturn(0);
         when(armadura.getDefesa()).thenReturn(100);
         
         assertFalse(personagem.atacar(armadura));
     }
}
