/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import jogomock.Personagem;
import jogomock.Arma;
import jogomock.Armadura;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author PauloAugusto
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
    
    @Test
    public void pokedexTest(){
        when(arma.getAtaque()).thenReturn(10);
        when(arma.getNivelBase()).thenReturn(1);
        when(armadura.getDefesa()).thenReturn(10);
        assertTrue(personagem.atacar(armadura));
        verify(arma,times(1)).getNivelBase();
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
