/**
 * @author kdukoelho
 */
package demeter.classes.prototype;


public class Costumer extends IdObject{
    private String name;
    private String email;
    private String phoneNumber;
    private Addres addres;
    Costumer(String name, String email, String phoneNumber, String state, String city, String neighborhood, String street, String houseNum){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addres = new Addres(this.id, state, city, neighborhood, street,houseNum);
    }
    
    // Getters.
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Addres getAddres(){
        return addres;
    }
}
