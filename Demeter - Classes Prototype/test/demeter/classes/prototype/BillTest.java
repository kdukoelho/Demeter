/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package demeter.classes.prototype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cadu
 */
public class BillTest {
    static Bill bill;
    
    public BillTest() {
    }
    
    
    @Before
    public void setUp() {
        boolean isPaid = false;
        int orderId = 0;
        float billValue = 255f;
        int installments = 3;
        bill = new Bill(isPaid, orderId, billValue, installments);
        System.out.println("setUp");
    }
    
    @Test
    public void generateInstallments_Should_generate_a_list_of_installments(){
        
        int installmentsTotal = 5;
        bill.setIntallmensArray(new Installment[installmentsTotal]);
        bill.generateInstallments(installmentsTotal);
        
        int expectedArrayLenght = installmentsTotal;
        int actualArrayLenght = bill.getInstallmentsArray().length;
        
        assertEquals(expectedArrayLenght, actualArrayLenght);
    }
    
    @Test
    public void payInstallment_Should_pay_one_installment() {
        
        bill.payInstallment();
        
        int expectedRemainingInstallments = 2;
        int actualRemainingInstallments = bill.getRemainingInstallments();
        
        assertEquals(expectedRemainingInstallments, actualRemainingInstallments);
    }
    
    @Test
    public void payInstallment_Should_set_off_the_debt(){
        
        bill.payInstallment();
        bill.payInstallment();
        bill.payInstallment();
        System.out.println(bill.getRemainingInstallments());
        boolean expectedBillStatus = true;
        boolean actualBillStatus = bill.getStatus();
        
        assertEquals(expectedBillStatus, actualBillStatus);
    }
    
    @Test
    public void getStatus_Should_return_actual_status(){
        
        boolean expectedBillStatus = false;
        boolean actualBillStatus = bill.getStatus();
        
        assertEquals(expectedBillStatus, actualBillStatus);
    }
    
    @Test public void getRemainingInstallments_Should_return_acutal_remaining_installments(){
        
        int expectedRemainingInstallments = 3;
        int actualRemainingInstallments = bill.getRemainingInstallments();
        
        assertEquals(expectedRemainingInstallments, actualRemainingInstallments);
    }
}
