/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Permissions {
    private final static String[] permissions = new String[]{"1d0258c2440a8d19e716292b231e3190", "64c9ac2bb5fe46c3ac32844bb97be6bc", "63bdb343c52fd14927dce4946fe6b086", "54b53072540eeeb8f8e9343e71f28176"};
    
    // Functions.
    
    public static String manager(){
        return permissions[0];
    }
    
    public static String seller(){
        return permissions[1];
    }
    
    public static String stockist(){
        return permissions[2];
    }
    
    public static String system(){
        return permissions[3];
    }
}
