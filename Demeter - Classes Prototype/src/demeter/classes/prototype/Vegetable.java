/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Vegetable {
    private int id;
    private String name;
    private String group;
    private float ammountInKg;
    private float valuePerKg;
    
    Vegetable(int id, String name, String group, float ammountInKg, float valuePerKg) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.ammountInKg = ammountInKg;
        this.valuePerKg = valuePerKg;
    }
    
    // Getters.
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGroup(){
        return group;
    }
    
    public float getAmmountInKg(){
        return ammountInKg;
    }
    
    public float getValuerPerKg(){
        return valuePerKg;
    }
    
    // Setters.
    
    public void setAmmountInKg(float newAmmount){
        this.ammountInKg = newAmmount;
    }
}
