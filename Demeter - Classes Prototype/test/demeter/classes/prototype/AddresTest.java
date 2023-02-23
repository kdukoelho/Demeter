package demeter.classes.prototype;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cadu
 */
public class AddresTest {
    Addres addres;
    
    String state = "DF";
    String city = "Brasilia";
    String neighborhood = "Asa Norte";
    String street = "SQN 415";
    String number = "402";
    
    public AddresTest(){
        this.addres = new Addres(0, city, state, neighborhood, street, number);
    }
    
    @Test
    public void getBuildedAddres_Should_return_builded_addres() {
        String expectedString = String.format("%s - %s, %s, %s, N° %s", city, state, neighborhood, street, number);
        String actualString = addres.getBuildedAddres();
        
        assertEquals(expectedString, actualString);
    }
    
}
