package demeter.classes.prototype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kdukoelho
 */
public class CostumerTest {
    Costumer costumer;
   
    @Before
    public void setUp() {
        costumer = new Costumer("Cadu", "cadu@gmail.com", "21 981141198", "RJ", "Rio de Janeiro", "Lapa", "Rua dos Gnomos", "420");
    }
   
    @Test
    public void getName_Should_return_costumer_name() {
        String expected = "Cadu";
        String actual = costumer.getName();
        
        assertEquals(expected, actual);
    }

    @Test
    public void getEmail_Should_return_costumer_email() {
        String expected = "cadu@gmail.com";
        String actual = costumer.getEmail();
        
        assertEquals(expected, actual);
    }

    @Test
    public void getPhoneNumber_Should_return_costumer_phone_number() {
        String expected = "21 981141198";
        String actual = costumer.getPhoneNumber();
        
        assertEquals(expected, actual);
    }

    @Test
    public void getAddres_Should_return_costumer_addres_object() {
        Object actual = costumer.getAddres();
        
        assertTrue(actual instanceof Addres);
    }
    
}
