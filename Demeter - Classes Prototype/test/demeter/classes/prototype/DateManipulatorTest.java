package demeter.classes.prototype;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author github.com/kdukoelho
 */
public class DateManipulatorTest {
    static Date dateTime;
    
    @Before
    public void setup(){
        dateTime = new Date();
    }
    
    @Test
    public void dateNow_Should_return_the_actual_date() {
        String expectedDate = new SimpleDateFormat("yyyy-MM-dd").format(dateTime);
        String actualDate = DateManipulator.date_Now();
        
        assertEquals(expectedDate, actualDate);
    }
    
    @Test
    public void timeNow_Should_return_the_actual_hour(){
        String expectedHour = new SimpleDateFormat("HH:mm:ss").format(dateTime);
        String actualHour = DateManipulator.time_Now();
        
        assertEquals(expectedHour, actualHour);
    }
    
}
