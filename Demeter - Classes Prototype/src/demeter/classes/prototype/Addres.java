/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Addres extends IdObject {
    final int costumerId;
    String[] addres = new String[5];
    
    Addres (int costumerId, String city, String state, String neighborhood, String street, String number){
        this.costumerId = costumerId;
        addres[0] = city;
        addres[1] = state;
        addres[2] = neighborhood;
        addres[3] = street;
        addres[4] = number;
    }
    
    // Getters.
    
    public int getCostumerId(){
        return this.costumerId;
}
    
    public String getState(){
        return addres[0];
    }
    
    public String getCity(){
        return addres[1];
    }
    
    public String getNeighborhood(){
        return addres[2];
    }
    
    public String getStreet(){
        return addres[3];
    }
    
    public String getNumber(){
        return addres[4];
    }
    
    public String getBuildedAddres(){
        String buildedString = String.format("%s - %s, %s, %s, N° %s", addres[0], addres[1], addres[2], addres[3], addres[4]);
        return buildedString;
    }
}
