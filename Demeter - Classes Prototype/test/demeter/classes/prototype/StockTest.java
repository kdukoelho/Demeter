package demeter.classes.prototype;

import java.util.List;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author guthub.com/kdukoelho
 */
public class StockTest {
    Stock stock = new Stock();
    Employee system = new Employee("system", Permissions.system());
    Employee seller = new Employee("seller", Permissions.seller());
    
    Vegetable newVegetable = new Vegetable("Kiwi", "Fruta", 3, 15.4f);
    Vegetable modifiedVegetable = new Vegetable("Alface Crespa", "Verdura", 2.0f, 2.5f);
    
    Order order = new Order(0, new Addres(0, "DF", "Brasilia", "Asa Norte", "SQN 415", "402")); 
    
    Vegetable[] vegetableArray = {new Vegetable("Cenoura", "Legume", 5.2f, 4.50f), 
                               new Vegetable("Alface", "Verdura", 3.5f, 3f),
                               new Vegetable("Morango", "Fruta", 5f, 22.5f)};    
    
    @Before
    public void setUp() throws NoPermissionException {      
        for (Vegetable veg : vegetableArray){
            stock.addProduct(veg, system);
        }
    }
    
    @Test
    public void getStockList_Should_return_stock_list() {
        Vegetable[] expectedArray = { vegetableArray[0], vegetableArray[1], vegetableArray[2] };
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    } 
    
    @Test
    public void addProduct_Should_add_products_at_stock_list() throws NoPermissionException{
        stock.addProduct(newVegetable, system);
        
        Vegetable[] expectedArray = { vegetableArray[0], vegetableArray[1], vegetableArray[2], newVegetable};
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void addProduct_Should_throw_NoPermissionException() throws NoPermissionException{
        boolean asserT = false;
        
        try {
            stock.addProduct(newVegetable, seller);
        }
        catch (NoPermissionException ex) {
            asserT = true;
        }

        assertTrue(asserT);
    }
    
    @Test
    public void removeProduct_Should_remove_product_from_stock_list() throws NoPermissionException{
        stock.removeProduct(vegetableArray[0], system);
        
        Vegetable[] expectedArray = { vegetableArray[0], vegetableArray[1] };
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void removeProduct_Should_throw_NoPermissionException() throws NoPermissionException{
        boolean asserT = false;
        
        try{
            stock.removeProduct(vegetableArray[0], seller);
        }
        catch (NoPermissionException ex){
            asserT = true;
        }
        
        assertTrue(asserT);
    }
    
    @Test
    public void editProduct_Should_edit_product_at_specif_index() throws NoPermissionException{      
        Vegetable[] expectedArray = { vegetableArray[0], modifiedVegetable, vegetableArray[2] };
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void editProduct_Should_throw_NoPermissionException() throws NoPermissionException{
        boolean asserT = false;
        
        try{
            stock.editProduct(1, modifiedVegetable, seller);
        }
        catch (NoPermissionException ex){
            asserT = true;
        }
        
        assertTrue(asserT);
    }
  
    @Test
    public void confirmOrder_Should_remove_vegetable_from_the_stock_list() throws NoPermissionException{
        order.addProduct(vegetableArray[1], 4f);
        List<Vegetable> orderList = order.getVegetableList();        
        stock.confirmOrder(orderList, seller);
        
        Vegetable[] expectedArray = { vegetableArray[0], vegetableArray[2] };
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void confirmOrder_Should_remove_the_amount_diff_from_vegetable_object() throws NoPermissionException{
        order.addProduct(vegetableArray[1], 1f);
        List<Vegetable> orderList = order.getVegetableList();        
        stock.confirmOrder(orderList, seller);
        
        vegetableArray[1].setAmountInKg(2.5f);
        Vegetable[] expectedArray = { vegetableArray[0], vegetableArray[1], vegetableArray[2] };
        Vegetable[] actualArray = stock.getStockList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void confirmOrder_Should_throw_NoPermissionException(){
        boolean asserT = false;
        order.addProduct(vegetableArray[1], 1f);
        List<Vegetable> orderList = order.getVegetableList();
        
        try{
            stock.confirmOrder(orderList, new Employee("stockist", Permissions.stockist()));
        }
        catch(NoPermissionException ex){
            asserT = true;
        }
        
        assertTrue(asserT);
    }
}
