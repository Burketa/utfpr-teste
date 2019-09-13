
import java.sql.ResultSet;
import mocklegal.Cliente;
import mocklegal.DAOCliente;
import mocklegal.Transaction;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

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
public class DAOClienteTest {
    
    @Mock
    Transaction transaction;
    
    @Spy
    Dummy dummySet;
    
    @InjectMocks
    DAOCliente dao;
    
 
    public abstract class Dummy implements ResultSet{
        
    }
    
     
    
    @Test
    public void transactionTest(){
        try{
            doReturn(1).when(dummySet).getInt(anyInt());
            doReturn("Paulo").when(dummySet).getString(anyString());
            doNothing().when(transaction).execute(anyString());
            when(transaction.exists()).thenReturn(true);
            when(transaction.getResult()).thenReturn(dummySet);
            
            Cliente c = dao.buscar(1);
            
           assertEquals("Paulo",c.getNome());
           
            
        }catch(Exception e){
            System.out.println("transactionTest falhou: ");
            e.printStackTrace();
        }
    }
}
