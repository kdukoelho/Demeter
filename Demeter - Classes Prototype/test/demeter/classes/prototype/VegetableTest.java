/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package demeter.classes.prototype;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kdukoelho
 */
public class VegetableTest {
    Vegetable veg;
    
    @Before
    public void setUp() {
        veg = new Vegetable("Cenoura", "Legume", 5.2f, 4.50f);
    }
    
    @Test
    public void getName_Should_return_vegetable_name(){
        String expected = "Cenoura";
        String actual = veg.getName();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void getGroup_Should_return_group(){
        String expected = "Legume";
        String actual = veg.getGroup();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void getAmountInKg_Should_return_amount_in_kg(){
        float expected = 5.2f;
        float actual = veg.getAmountInKg();
        
        assertEquals(expected, actual, 5.2f);
    }
    
    @Test
    public void getValuePerKg_Should_return_value_per_kg(){
        float expected = 4.50f;
        float actual = veg.getValuePerKg();
        
        assertEquals(expected, actual, 4.50f);
    }
    
   @Test
   public void setAmountInKg_Should_set_new_amount(){
       veg.setAmountInKg(2.2f);
       
       float expected = 2.2f;
       float actual = veg.getAmountInKg();
       
       assertEquals(expected, actual, 2.2f);
   }
   
   @Test
   public void calculateTotalValue_Should_return_total_value_of_vegetable_object(){
       float expected = 23.4f;
       float actual = veg.calculateTotalValue();
       
       assertEquals(expected, actual, 23.4f);
   }
   
   @Test
   public void calculateTotalValue_Should_return_zero(){
       veg.setAmountInKg(0);
       
       float expected = 0;
       float actual = veg.calculateTotalValue();
       
       assertEquals(expected, actual, 0);
   }
}
