/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {
    
    static Date dateTime = new Date();
    
    public static String dateTime_Now(){
        /**
         * Return the system date and time and formats on a string.
         * @return Date-time string.
         * 
         * @author kdukoelho
         */
        return String.format("%s %s", date_Now(), time_Now());
    }
    
    public static String date_Now(){
        return new SimpleDateFormat("yyyy-MM-dd").format(dateTime);
    }
    
    public static String time_Now(){
        return new SimpleDateFormat("HH:mm:ss").format(dateTime);
    }
}
