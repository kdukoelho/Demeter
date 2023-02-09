/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Installment extends IdObject{
    private boolean isPaid;
    private int billId;
    private int id;
    private float value;
    private String paymentDate;
    
    Installment(boolean isPaid, int billId, float value){
        this.isPaid = isPaid;
        this.value = value;
    }
    
    // Setters.
    
    public void setIsPaid(boolean isPaid){
        this.isPaid = isPaid;
    }
    
    public void setPaymentDate(String date){
        this.paymentDate = date.isEmpty() ? DateManipulator.Now() : date;
    }
}
