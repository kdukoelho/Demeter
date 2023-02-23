/**
 * @author kdukoelho
 */

package demeter.classes.prototype;

public class Employee extends IdObject{
    private String name;
    private String permission;
    private String lastLogin;
    Employee(String name, String permission){
        this.name = name;
        this.permission = permission;
    }
        
    // Getters.
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPermission(){
        return permission;
    }
    
    public String getLastLogin(){
        return lastLogin;
    }
    
    // Setters.
    
    public void setLastLogin(){
        this.lastLogin = DateManipulator.dateTime_Now();
    }
}
