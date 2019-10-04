import exercicio8.Desconto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author burca
 */
@RunWith(MockitoJUnitRunner.class)
public class VerificadorDeDesconto {

    public VerificadorDeDesconto() {
    }

    Desconto desconto = new Desconto();

    @Test
    public void testNovoComFidelidadeComCupom() {
        assertEquals(desconto.checkDesconto(true, true, true), -1);
    }

    @Test
    public void testAntigoComFidelidadeComCupom() {
        assertEquals(desconto.checkDesconto(false, true, true), 30);
    }

    @Test
    public void testNovoSemFidelidadeComCupom() {
        assertEquals(desconto.checkDesconto(true, false, true), 35);
    }

    @Test
    public void testAntigoSemFidelidadeComCupom() {
        assertEquals(desconto.checkDesconto(false, false, true), 20);
    }

    @Test
    public void testAntigoComFidelidadeSemCupom() {
        assertEquals(desconto.checkDesconto(false, true, false), 10);
    }

    @Test
    public void testNovoSemFidelidadeSemCupom() {
        assertEquals(desconto.checkDesconto(true, false, false), 15);
    }

    @Test
    public void testAntigoSemFidelidadeSemCupom() {
        assertEquals(desconto.checkDesconto(false, false, false), 0);
    }
}
