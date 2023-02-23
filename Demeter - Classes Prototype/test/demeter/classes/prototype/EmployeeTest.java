package demeter.classes.prototype;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Cadu
 */
public class EmployeeTest {
    Employee employee = new Employee("Carlos Coelho", Permissions.manager());
    
    @Test
    public void setLastLogin_Should_set_today_as_last_login() {
        employee.setLastLogin();
        
        String expectedDate = DateManipulator.dateTime_Now();
        String actualDate = employee.getLastLogin();
        
        assertEquals(expectedDate, actualDate);
    }
    
}
