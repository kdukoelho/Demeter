/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Vegetable extends IdObject{
    private final int id;
    private String name;
    private String group;
    private float amountInKg;
    private float valuePerKg;
    private float totalValue; // R$
    
    Vegetable(int lastId, String name, String group, float amountInKg, float valuePerKg) {
        this.id = Id.generateNextId(lastId);
        this.name = name;
        this.group = group;
        this.amountInKg = amountInKg;
        this.valuePerKg = valuePerKg;
        this.totalValue = calculateTotal();
    }
    
    // Functions.
    
    private float calculateTotal(){
        /**
         * Calculates the vegetable value based on value in cash and the amount in kilogram.
         * valuePerKg * ammountInKg
         * 
         * @return Total value in cash of the vegetable. (return 0 if amountInKg or valuePerKg be 0).
         */
        if (amountInKg > 0 && valuePerKg > 0){
            return amountInKg * valuePerKg;
        }
        else{
            return 0;
        }
    }
    
    // Getters.
    
    public String getName(){
        return name;
    }
    
    public String getGroup(){
        return group;
    }
    
    public float getAmountInKg(){
        return amountInKg;
    }
    
    public float getValuerPerKg(){
        return valuePerKg;
    }
    
    public float getTotalValue(){
        return totalValue;
    }
    
    // Setters.
    
    public void setAmmountInKg(float newAmmount){
        this.amountInKg = newAmmount;
    }
}
