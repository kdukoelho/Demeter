/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.util.ArrayList;
import java.util.List;


public class Order extends IdObject{
    private final int idCostumer;
    private List<Vegetable> vegetableList = new ArrayList();
    private Addres addres;
    private float totalValue;
    
    Order(int idCostumer){
        this.idCostumer = idCostumer;
        this.addres = addres;
    }
    
    // Getters.
    
    public List<Vegetable> getVegetableList(){
        return vegetableList;
    }
    
    public Vegetable getVegetable(int vegetableId){
        int index = 0;
        Vegetable vegetable = null;
        for (Vegetable veg : vegetableList){
            if (veg.getId() == vegetableId){
                vegetable = vegetableList.get(index);
                break;
            }
            index++;
        }
       return vegetable;
    }
    
    public float getTotal(){
        return totalValue;
    }
    
    // Functions.
    
    public void clear(){
        vegetableList.clear();
        this.totalValue = calculateTotal();
    }
    
    public void addProduct(Vegetable vegetable, float resquestedAmmount){
        if (vegetable.getAmountInKg() > resquestedAmmount){
            vegetable.setAmmountInKg(resquestedAmmount);
            vegetableList.add(vegetable);
            this.totalValue = calculateTotal();
        }
        else {
            vegetableList.add(vegetable);
        }
    }
    
    public void removeProduct(int vegetableId, float requestedAmmountToExclude){
        Vegetable toExcludeVeg = null;
        float newAmmount = 0;
        for (Vegetable veg : vegetableList){
            if (veg.getId() == vegetableId){
                toExcludeVeg = veg;
                if (requestedAmmountToExclude > 0){
                    newAmmount = veg.getAmountInKg() - requestedAmmountToExclude;
                }
            }
        } 
        
        vegetableList.remove(toExcludeVeg);
        if (requestedAmmountToExclude > 0) {
            toExcludeVeg.setAmmountInKg(newAmmount);
            vegetableList.add(toExcludeVeg);
        }
    }
    
    public float calculateTotal(){
        float tot = 0;
        for (Vegetable veg : vegetableList){
            tot += veg.getTotalValue();
        }
        return tot;
    }
}
