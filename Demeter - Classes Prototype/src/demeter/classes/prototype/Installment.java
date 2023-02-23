/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Installment extends IdObject{
    private boolean status;
    private int billId;
    private int id;
    private float value;
    private String paymentDate;
    
    Installment(boolean isPaid, int billId, float value){
        this.status = isPaid;
        this.value = value;
    }
    
    // Setters.
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void setPaymentDate(String date){
        this.paymentDate = date.isEmpty() ? DateManipulator.dateTime_Now() : date;
    }
    
    // Getters.
    
    public boolean getStatus(){
        return status;
    }
    
    public String getPaymentDate(){
        return paymentDate;
    }
    
    
}
