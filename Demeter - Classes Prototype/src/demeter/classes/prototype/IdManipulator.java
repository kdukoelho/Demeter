package demeter.classes.prototype;
/**
 * @author kdukoelho
 */

public class IdManipulator {
    
    public static int generateNextId(int lastId){
        /**
         * generates a new ID by increasing +1 from an informed ID.
         * @param lastId Last informed ID.
         * @return new ID.
         * 
         * @author kdukoelho
         */
        lastId = lastId >= 0 ? lastId: 0;
        return lastId + 1;
    }
}
