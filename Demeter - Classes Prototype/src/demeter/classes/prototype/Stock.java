/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.util.List;

public class Stock {
    private List<Vegetable> stockList;
    private Employee lastHandler;
    private String lastModification;
    
    
    // Stockist functions.
    
    public void addProduct(Vegetable vegetable, Employee handler){
        /**
         * Add the product in the stock list if the handler is a stockist or manager.
         * 
         * @param vegetable     Product to be removed.
         * @param handler       Employee that are executing the operation.
         * 
         * @author kdukoelho
         */
        
        if (handler.getPermission().equals(Permissions.stockist()) || handler.getPermission().equals(Permissions.manager())){
            stockList.add(vegetable);
            this.lastHandler = handler;
            this.lastModification = String.format("Product: %s:%s added by %s:%s at %s", vegetable.getId(), vegetable.getName(), handler.getId(), handler.getName(), DateManipulator.Now());
        }
        else {
            System.out.println("You have no permission to execute this operation.");
        }
    }
    
    public void removeProduct(Vegetable vegetable, Employee handler){
        /**
         * Removes the product from the stock list if the handler is a stockist or manager.
         * 
         * @param vegetable     Product to be removed.
         * @param handler       Employee that are executing the operation.
         * 
         * @author kdukoelho
         */
        
        if (handler.getPermission().equals(Permissions.stockist()) || handler.getPermission().equals(Permissions.manager())){
            stockList.remove(vegetable);
            this.lastHandler = handler;
            this.lastModification = String.format("Product: %s:%s removed by %s:%s at %s", vegetable.getId(), vegetable.getName(), handler.getId(), handler.getName(), DateManipulator.Now());
        }
        else {
            System.out.println("You have no permission to execute this operation.");
        }
        
    }
    
    public void editProduct(int vegetableIndex, Vegetable vegetable, Employee handler){
        /**
         * Replaces the product with a new object if the handler is a stockist or manager.
         * 
         * @param vegetableIndex    Index of the vegetable object to be modified.
         * @param vegetable         Product to be removed.
         * @param handler           Employee that are executing the operation.
         * 
         * @author kdukoelho
         */
        
        if (handler.getPermission().equals(Permissions.stockist()) || handler.getPermission().equals(Permissions.manager())){
            stockList.set(vegetableIndex, vegetable);
        }
        else {
            System.out.println("You have no permission to execute this operation.");
        }
    }
    
    // Seller functions.
    
    public void confirmOrder(List<Vegetable> vegetableOrderList, Employee handler){
        /**
         * If the amount of vegetables in stock is less than the amount requested in the order, it removes the vegetable from the stock list.
         * Otherwise, calculates the difference between the amount of vegetables requested in the order and present in the stock list, and defines how the new amount of vegetable in stock.
         * 
         * @param vegetableOrderList    List of requested vegetables.
         * @param handler               Employee that are executing the operation.
         * 
         * @author kdukoelho
         */
        
        if (handler.getPermission().equals(Permissions.seller()) || handler.getPermission().equals(Permissions.manager())){            
            for (Vegetable vegInStockList : stockList){
                Vegetable vegInOrderList = vegetableOrderList.get(vegInStockList.getId());
                float ammountDiff = vegInStockList.getAmountInKg() - vegInOrderList.getAmountInKg();
                if (ammountDiff <= 0){ // Taking the vegetable from stock list.
                     Employee system = new Employee(-419, null, Permissions.system());
                     vegInOrderList.setAmmountInKg(vegInStockList.getAmountInKg());
                     removeProduct(vegInStockList, system);
                }
                else {
                    vegInStockList.setAmmountInKg(ammountDiff);
                }
            }
        }
        else {
            System.out.println("You have no permission to execute this operation.");
        }
    }
    
    // Getters.
    
    public List<Vegetable> getStockList(){
        return stockList;
    }
}
