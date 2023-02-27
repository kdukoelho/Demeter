package demeter.classes.prototype;

import java.io.InvalidObjectException;
/**
 *
 * @author github.com/kdukoelho
 */
public class NoPermissionException extends InvalidObjectException {
    
    public NoPermissionException(Employee employee) {
        super(String.format("User has $s no permission to do this.", employee.getName()));
    }
}
