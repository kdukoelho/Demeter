package demeter.classes.prototype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cadu
 */
public class OrderTest {
    Order order;
    
    Vegetable[] vegetableArray = {new Vegetable("Cenoura", "Legume", 5.2f, 4.50f), 
                               new Vegetable("Alface", "Verdura", 3.5f, 3f),
                               new Vegetable("Morango", "Fruta", 5f, 22.5f)};
    
    Vegetable[] vegetableArrayClone = vegetableArray.clone();

    
    @Before
    public void setUp() {
        System.out.println("setUp");
        this.order = new Order(0, new Addres(0, "DF", "Brasilia", "Asa Norte", "SQN 415", "402"));
        this.vegetableArray = vegetableArrayClone;
                               
        for (Vegetable veg : vegetableArray){
            order.addProduct(veg, veg.getAmountInKg());
        }
    }
    
    @Test
    public void addProduct_Should_add_product_at_order_list(){
        Vegetable newVegetable = new Vegetable("Kiwi", "Fruta", 3, 15.4f);
        
        order.addProduct(newVegetable, 5);
        
        Vegetable[] expectedArray = {vegetableArray[0], vegetableArray[1], vegetableArray[2], newVegetable};
        Vegetable[] actualArray = (Vegetable[]) order.getVegetableList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void removeProduct_Should_remove_product_from_order_list(){
        order.removeProduct(1, 0);
        
        Vegetable[] expectedArray = {vegetableArray[0], vegetableArray[2]};
        Vegetable[] actualArray = (Vegetable[]) order.getVegetableList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
   
    @Test
    public void removeProduct_Should_remove_an_especific_ammount_of_product_from_order_list(){
        order.removeProduct(1, 2);
        
        vegetableArray[1].setAmountInKg(1.5f);
        Vegetable[] expectedArray = {vegetableArray[0], vegetableArray[1], vegetableArray[2]};
        Vegetable[] actualArray = (Vegetable[]) order.getVegetableList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void calculateTotal_Should_return_total_order_value(){
        float expectedValue = vegetableArray[0].getTotalValue() + vegetableArray[1].getTotalValue() + vegetableArray[2].getTotalValue(); 
        float actualValue = order.calculateTotal();
        
        assertEquals(expectedValue, actualValue, 146.4f);
    }
    
    @Test
    public void getVegetable_Should_return_the_correct_vegetable(){
        Vegetable expectedVegetable = vegetableArray[2];
        Vegetable actualVegetable = order.getVegetable(3);
        
        assertEquals(expectedVegetable, actualVegetable);
    }
    
    @Test
    public void getVegetableList_Should_return_vegetable_list(){
        Vegetable[] expectedArray = vegetableArray;
        Vegetable[] actualArray = (Vegetable[]) order.getVegetableList().toArray(expectedArray);
        
        assertArrayEquals(expectedArray, actualArray);
    }
}
