
import mocklegal.Cliente;
import mocklegal.ControleCliente;
import mocklegal.DAOCliente;
import mocklegal.VisaoCliente;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PauloAugusto
 */
@RunWith(MockitoJUnitRunner.class)
public class ControleClienteTest {
    /*
    @Mock
    Cliente cliente;
    */
    
    @Mock
    DAOCliente dao;
    
    
    @Mock
    VisaoCliente visao;
    
    @InjectMocks
    ControleCliente controle;
    
    private Cliente getCliente(){
        Cliente c=new Cliente();
        c.setCod(1);
        c.setNome("Paulo");
        return c;
    }
    
    @Test
    public void controleTest(){
        
        when(dao.buscar(1)).thenReturn(getCliente());
        when(visao.menu()).thenAnswer(new Answer(){
            private int count=0;
            public Object answer(InvocationOnMock invocation){
                if (count++==0)
                    return 1;
                else
                    return 0;
                    
            }
        });
        
        
        when(visao.buscarCliente()).thenReturn(1);
        controle.controlar();
        InOrder ordem = inOrder(dao,visao);
        ordem.verify(visao).menu();
        ordem.verify(visao).buscarCliente();
        ordem.verify(dao).buscar(1);
        
        
        
        
    }
            
    
    
}
