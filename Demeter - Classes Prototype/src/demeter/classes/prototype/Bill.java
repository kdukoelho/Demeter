 /**
  * @author kdukoelho
  */
package demeter.classes.prototype;

public class Bill extends IdObject{
    private boolean isPaid;
    private int orderId;
    private float billValue;
    private int installmentsTotal;
    private int paidInstallments = 0; // Total number of paid installments.
    private Installment[] installmentsArray;
    
    Bill(boolean isPaid, int orderId, float billValue, int installmentsTotal){
        this.isPaid = isPaid; 
        this.orderId = orderId;
        this.billValue = billValue;
        this.installmentsTotal = installmentsTotal;
        this.installmentsArray = new Installment[installmentsTotal];
        generateInstallments(installmentsTotal);
    }
    
    // Functions.
    
    public void generateInstallments(int installmentsTotal){
        float installmentValue = billValue / installmentsTotal;

        for (int i = 0; i < installmentsTotal; i++){
            Installment installment = new Installment(false, this.id, installmentValue);
            installmentsArray[i] = installment;
        }
    }
    
    public void payInstallment(){
        if(!isPaid){
            for (Installment installment : installmentsArray){
                if(installment.getId()  == paidInstallments + 1){
                    installment.setIsPaid(true);
                    installment.setPaymentDate("");
                    this.paidInstallments++;
                    break;
                }
            }
            if (this.paidInstallments == this.installmentsTotal){
                this.isPaid = true;
            }
        }
    }
    
    // Getters
    
    public boolean getStatus(){
        return isPaid;
    }
    
    public int getRemainingInstallments(){
        return installmentsTotal - paidInstallments;
    }
    
    public Installment[] getInstallmentsArray(){
        return installmentsArray;
    }
    
    // Setters
    
    public void setIntallmensArray(Installment[] installmentsArray){
        this.installmentsArray = installmentsArray;
    }
}
