/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Permissions {
    private final static String[] permissions = new String[]{"gerente", "vendedor", "estoquista", "system"};
    
    // Functions.
    
    public static String manager(){
        return permissions[0];
    }
    
    public static String seller(){
        return permissions[1];
    }
    
    public static String stockist(){
        return permissions[3];
    }
    
    public static String system(){
        return permissions[4];
    }
}
