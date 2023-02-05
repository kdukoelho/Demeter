/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.util.List;


public class Order extends IdObject{
    private final int id;
    private final int idCostumer;
    private List<Vegetable> vegetableList;    
    private String[] addres = new String[4];
    private float totalValue;
    
    Order(int lastId, int idCostumer, String[] addres){
        this.id = Id.generateNextId(lastId);
        this.idCostumer = idCostumer;
        this.addres = addres;
        this.totalValue = calculateTotal();
    }
    
    // Functions.
    
    public void clearOrder(){
        vegetableList.clear();
    }
    
    public void addProduct(Vegetable vegetable, float resquetedAmmount){
        vegetable.setAmmountInKg(resquetedAmmount);
        vegetableList.add(vegetable);
    }
    
    public void removeProduct(Vegetable vegetable){
        vegetableList.remove(vegetable.getId());
    }
    
    private float calculateTotal(){
        float tot = 0;
        for (Vegetable veg : vegetableList){
            tot += veg.getTotalValue();
        }
        return tot;
    }
    
    public List<Vegetable> finalizeOrder(){   
        return vegetableList;
    }
    
    // Getters.
    
    public float getTotal(){
        return totalValue;
    }
}
