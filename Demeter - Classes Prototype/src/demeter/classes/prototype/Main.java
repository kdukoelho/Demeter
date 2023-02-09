/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Main {

    public static void main(String[] args) {
        Bill bill = setUpClass();
       
        boolean actualBillStatus = bill.getStatus();
    
        System.out.println(actualBillStatus);
    }
    
    public static Bill setUpClass() {
        boolean isPaid = false;
        int orderId = 0;
        float billValue = 255f;
        int installments = 3;
        return new Bill(isPaid, orderId, billValue, installments);
    }
}
