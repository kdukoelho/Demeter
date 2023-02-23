/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package demeter.classes.prototype;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author guthub.com/kdukoelho
 */
public class StockTest {
    Stock stock;
    Employee system = new Employee("system", Permissions.system());
    
    Vegetable[] vegetableArray = {new Vegetable("Cenoura", "Legume", 5.2f, 4.50f), 
                               new Vegetable("Alface", "Verdura", 3.5f, 3f),
                               new Vegetable("Morango", "Fruta", 5f, 22.5f)};
    
    Vegetable[] vegetableArrayClone = vegetableArray.clone();
    
    @Before
    public void setUp() {
        this.stock = new Stock();
        
        for (Vegetable veg : vegetableArray){
            stock.addProduct(veg, system);
        }
    }
    
    @Test
    public void addProduct_Should_add_products_at_stock_list(){
        stock.addProduct(new Vegetable("Kiwi", "Fruta", 3, 15.4f), system);
        
        
    }

    @Test
    public void getStockList_Should_return_stock_list() {
        
    }   
}
