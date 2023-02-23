/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package demeter.classes.prototype;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;

/**
 *
 * @author Cadu
 */
public class AddresListTest {
    AddresList addresList = new AddresList();
    
    Addres[] addresArray = {new Addres(0, "DF", "Brasilia", "Asa Sul", "SQS 415", "402"), 
                            new Addres(1, "GO", "Goiania", "Alpha Ville", "Rua Dom Corleone", "82"), 
                            new Addres(3, "DF", "Samambaia", "Samambaia Sul", "QE 202", "504")};
    
    @Before
    public void setUp() {
        System.out.println("startup");        
        for (Addres addres : addresArray){
            addresList.add(addres);
        }
    }
    
    @After
    public void teardown(){
        System.out.println("teardown");
        addresList.clear();
    }
     
    @Test
    public void removeByAddresId_Should_remove_addres_from_addresList_using_addresId_as_index(){
        addresList.removeByAddresId(2);
        
        AddresList expectedList = new AddresList();
        for (int i = 0; i < 2; i++){
            expectedList.add(addresArray[i]);
        }

        assertArrayEquals(expectedList.getAddresList().toArray(), addresList.getAddresList().toArray());
    }
    
    @Test
    public void removeByCostumerId_Should_remove_addresFromList_using_costumerId_as_index(){
        addresList.removeByCostumerId(3);
        
        AddresList expectedList = new AddresList();
        for (int i = 0; i < 2; i++){
            expectedList.add(addresArray[i]);
        }
        
        assertArrayEquals(expectedList.getAddresList().toArray(), addresList.getAddresList().toArray());
    }
}