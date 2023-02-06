 /**
  * @author kdukoelho
  */
package demeter.classes.prototype;

public class Bill extends IdObject{
    private boolean isPaid;
    private int orderId;
    private float billValue;
    private int installmentsTotal;
    private int paidInstallments; // Total number of paid installments.
    private Installment[] installmentsArray;
    
    Bill(boolean isPaid, int orderId, float billValue, int installmentsTotal){
        this.isPaid = isPaid; 
        this.orderId = orderId;
        this.billValue = billValue;
        this.installmentsTotal = installmentsTotal;
        generateInstallments();
    }
    
    // Functions.
    
    private void generateInstallments(){
        float installmentValue = billValue / installmentsTotal;

        for (int installmentEnum = 0; installmentEnum < installmentsTotal; installmentEnum++){
            Installment installment = new Installment(false, this.id, installmentEnum, installmentValue);
            installmentsArray[installmentEnum] = installment;
        }
    }
    
    public void payInstallment(int installmentEnum){
        for (Installment installment : installmentsArray){
            if(installment.getInstallmentEnum() == installmentEnum){
                installment.setIsPaid(true);
                installment.setPaymentDate("");
                this.paidInstallments++;
            }
        }
        if (this.paidInstallments == this.installmentsTotal){
            this.isPaid = true;
        }
    }
    
    // Getters
    
    public int getRemainingInstallments(){
        return this.installmentsTotal - this.paidInstallments;
    }
}
