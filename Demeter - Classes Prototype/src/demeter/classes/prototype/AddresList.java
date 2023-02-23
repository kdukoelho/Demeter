/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demeter.classes.prototype;

import java.util.ArrayList;
import java.util.List;

public class AddresList {
    List<Addres> addresList = new ArrayList();
    
    public void clear(){
        if(addresList != null){
            addresList.clear();
        }
    }
    
    public List<Addres> getAddresList(){
        return addresList;
    }
    
    public void add(Addres addres){
        addresList.add(addres);
    }
    
    public void removeByAddresId(int addresId){
        Addres toRemove = null;
        for (Addres addres : addresList){
            if (addres.getId() == addresId){
                toRemove = addres;
            }
        }
        if (toRemove != null){
            addresList.remove(toRemove);
        }
    }
    
    public void removeByCostumerId(int costumerId){
        Addres toRemove = null;
        for (Addres addres : addresList){
            if (addres.getCostumerId() == costumerId){
                toRemove = addres;
            }
        }
        if (toRemove != null){
            addresList.remove(toRemove);
        }
    }
}
