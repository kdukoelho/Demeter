package demeter.classes.prototype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author github.com/kdukoelho
 */
public class IdObjectTest {
    IdObject[] idObjectsArray = new IdObject[5];
    
    @Before
    public void setUp() {
        for (int i = 0; i < 5; i++){
            idObjectsArray[i] = new IdObject();
        }
    }
    
    @Test
    public void getId_Should_return_the_id_of_actual_object() {
        int expectedId = 3;
        int actualId = idObjectsArray[2].getId();
        
        assertEquals(expectedId, actualId);
    }
    
}
