/**
 * @author kdukoelho
 */
package demeter.classes.prototype;


public class Costumer {
    private final int id;
    private final String name;
    private String email;
    private String phoneNumber;
    private String[] addres = new String[4];
    Costumer(int lastGeneratedId, String name, String email, String phoneNumber, String city, String district, String street, String houseNum){
        this.id = IdManipulator.generateNextId(lastGeneratedId);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addres[0] = city; this.addres[1] = district; this.addres[2] = street; this.addres[3] = houseNum;
    }
    
    // Getters.
    public int getId(){
        return id;      
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String[] getAddres(){
        return addres;
    }
}
