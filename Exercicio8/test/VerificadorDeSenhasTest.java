/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercicio8.Dicionario;
import exercicio8.VerificadorDeSenhas;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Aluno
 */
@RunWith(MockitoJUnitRunner.class)
public class VerificadorDeSenhasTest {

    public VerificadorDeSenhasTest() {
    }

    //classes validas
    @Test//1, 2, 5, 8
    public void testNoIntervalo() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("abcdef"));
    }
    
    @Test//1, 2, 5, 8
    public void testComecarComLetra() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("abcdef"));
    }

    @Test
    public void testComecarComNumero() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("1bcdef"));
    }

    @Test
    public void testComecarcomUnderline() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("_bcdef"));
    }

    @Test
    public void testUnderlineNoMeio() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("bcd_ef"));
    }

    @Test
    public void testForaDoDicionario() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertTrue(verificador.validarNovaSenha("bcdsdef"));
    }

    //classes invalidas
    @Test
    public void testForaDoIntervaloLimiteInferior() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertFalse(verificador.validarNovaSenha("ab"));
    }

    @Test
    public void testForaDoIntervaloLimiteSuperior() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertFalse(verificador.validarNovaSenha("abcdefasdasdasdasdasd"));
    }
    
    @Test
    public void testComecarComEspeciaisForaUnderline() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertFalse(verificador.validarNovaSenha("!asdasd"));
    }
    
    @Test
    public void testCaracteresEspeciaisNoMeio() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador = new VerificadorDeSenhas(dicMock);

        assertFalse(verificador.validarNovaSenha("asd!asd"));
    }
    
    @Test
    public void testSenhaEstaNoDicionario() {
        Dicionario dicMock = mock(Dicionario.class);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("senha");
        lista.add("12345");
        when(dicMock.getListaDeSenhasInvalidas())
                .thenReturn(lista);

        VerificadorDeSenhas verificador
                = new VerificadorDeSenhas(dicMock);

        assertFalse(verificador.validarNovaSenha("senha"));
    }

}
