/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.util.List;


public class Order {
    private final int id;
    private final int idCostumer;
    private List<Vegetable> vegetableList;
    private float totalValue;
    private String[] addres = new String[4];
    
    Order(int lastGeneratedId, int idCostumer, String[] addres){
        this.id = IdManipulator.generateNextId(lastGeneratedId);
        this.idCostumer = idCostumer;
        this.addres = addres;
    }
    
    // Functions.
    
    public void clearOrder(){
        vegetableList.clear();
    }
    
    public void addProductAtOrder(Vegetable vegetable, float resquetedAmmount){
        vegetable.setAmmountInKg(resquetedAmmount);
        vegetableList.add(vegetable);
    }
    
    public void removeProductFromOrder(Vegetable vegetable){
        vegetableList.remove(vegetable.getId());
    }
    
    public List<Vegetable> finalizeOrder(){
        return vegetableList;
    }
}
