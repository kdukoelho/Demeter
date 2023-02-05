/**
 * @author kdukoelho
 */

package demeter.classes.prototype;

public class Employee {
    private final int id;
    private String name;
    private String permission;
    private String lastLogin;
    Employee(int lastId, String name, String permission){
        this.id = Id.generateNextId(lastId);
        this.name = name;
        this.permission = permission;
    }
    
    // Functions.
    
    public void setLastLogin(){
        this.lastLogin = DateManipulator.Now();
    }
    
    // Getters.
    
    public int getId(){
        return id;
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
}
