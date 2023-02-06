/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Installment extends IdObject{
    private boolean isPaid;
    private int billId;
    private int installmentEnum;
    private float value;
    private String paymentDate;
    
    Installment(boolean isPaid, int billId, int intallmentEnum, float value){
        this.isPaid = isPaid;
        this.installmentEnum = installmentEnum;
        this.value = value;
    }
    
    // Getters.
    
    public int getInstallmentEnum(){
        return installmentEnum;
    }
    
    // Setters.
    
    public void setIsPaid(boolean isPaid){
        this.isPaid = isPaid;
    }
    
    public void setPaymentDate(String date){
        this.paymentDate = date.isEmpty() ? DateManipulator.Now() : date;
    }
}
