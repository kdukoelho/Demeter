/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
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
public class PermissionsTest {

    @Test
    public void manager_Should_return_manager_md5_hash() {
        String expectedCode = "1d0258c2440a8d19e716292b231e3190";
        String actualCode = Permissions.manager();
        
        assertEquals(expectedCode, actualCode);
    }

    @Test
    public void seller_Should_return_seller_md5_hash() {
        String expectedCode = "64c9ac2bb5fe46c3ac32844bb97be6bc";
        String actualCode = Permissions.seller();
        
        assertEquals(expectedCode, actualCode);
    }
    
    @Test
    public void stockist_Should_return_stockist_md5_hash() {
        String expectedCode = "63bdb343c52fd14927dce4946fe6b086";
        String actualCode = Permissions.stockist();
        
        assertEquals(expectedCode, actualCode);
    }
    
    @Test
    public void system_Should_return_system_md5_hash() {
        String expectedCode = "54b53072540eeeb8f8e9343e71f28176";
        String actualCode = Permissions.system();
        
        assertEquals(expectedCode, actualCode);
    }
    
}
