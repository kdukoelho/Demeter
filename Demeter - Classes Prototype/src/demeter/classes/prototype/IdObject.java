/**
 * @author kdukoelho
 */
package demeter.classes.prototype;


public class IdObject {
    private static int nextId = 0;
    protected int id;
    
    IdObject(){
        this.id = nextId++;
    }
    
    public int getId(){
        return id;
    }
    
}
