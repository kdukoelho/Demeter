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
public class InstallmentTest {
    Installment installment;
    
    @Before
    public void setUp() {
        boolean isPaid = false;
        int billId = 0;
        float value = 100;
        installment = new Installment(isPaid, billId, value);
    }
    
    @Test
    public void setStatus_Should_set_status_equals_true(){
        installment.setStatus(true);
        
        boolean expectedStatus = true;
        boolean actualStatus = installment.getStatus();
        
        assertEquals(expectedStatus, actualStatus);
    }
    
    @Test
    public void setPaymentDate_Should_set_TODAY_as_payment_date_(){
        installment.setPaymentDate("");
        
        String expectedDate = DateManipulator.dateTime_Now();
        String actualDate = installment.getPaymentDate();
        
        assertEquals(expectedDate, actualDate);
    }
    
    @Test
    public void setPaymentDate_Should_set_SPECIFIC_DAY_as_payment_date(){
        String specificDay = "2004-08-04 15:00:00";
        installment.setPaymentDate(specificDay);
        
        String expectedDate = specificDay;
        String actualDate = installment.getPaymentDate();
        
        assertEquals(expectedDate, actualDate);
    }
}
