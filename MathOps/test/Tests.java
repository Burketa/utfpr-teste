import mathops.MathOps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Tests {
    MathOps math = new MathOps();
    
    @Test
    public void testaFatorialZero()
    {
        int result = 0;
        
        result = math.fatorial(0);
        assertEquals(result, 1);
    }
    
    @Test
    public void testaFatorialComNumerosNaturaisMaioresQueZero()
    {
        int result = 0;
        
        result = math.fatorial(10);
        assertEquals(result, 3628800);
        
        result = math.fatorial(4);
        assertEquals(result, 24);
    }
    
    @Test
    public void testaFatorialComNumerosInteirosNegativos()
    {
        int result = 0;
        
        result = math.fatorial(-10);
        assertEquals(result, 1);
        
        result = math.fatorial(-4);
        assertEquals(result, 1);
    }
   @Test
    public void testaPrimoComNumerosZero()
    {
        boolean result = true;
        
        result = math.ehPrimo(0);
        assertFalse(result);
    }
    @Test
    public void testaPrimoUm()
    {
        boolean result = true;
        
        result = math.ehPrimo(1);
        assertFalse(result);
    }
    
    @Test
    public void testaPrimoComNumerosNaturais()
    {
        boolean result = false;
        
        result = math.ehPrimo(7);
        assertTrue(result);
        
        result = math.ehPrimo(36);
        assertFalse(result);
        
        result = math.ehPrimo(37);
        assertTrue(result);
        
        result = math.ehPrimo(12);
        assertFalse(result);
    }
    
    
    @Test
    public void testaPrimoComNumerosNegativos()
    {
        boolean result = true;
        
        result = math.ehPrimo(-55);
        assertFalse(result);
        
        result = math.ehPrimo(-1);
        assertFalse(result);
    }
}
