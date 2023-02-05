/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {
    public static String Now(){
        /**
         * Return the system date and time and formats on a string.
         * @return Date-time string.
         * 
         * @author kdukoelho
         */
        Date dateTime = new Date();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(dateTime);
        String hour = new SimpleDateFormat("HH:mm:ss").format(dateTime);
        return String.format("%s %s", date, hour);
    }
}
