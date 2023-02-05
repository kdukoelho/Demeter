package demeter.classes.prototype;
/**
 * @author kdukoelho
 */

public class Id {
    
    public static int generateNextId(int biggerId){
        /**
         * generates a new ID by increasing +1 from an informed ID.
         * @param lastId Last informed ID.
         * @return new ID.
         * 
         * @author kdukoelho
         */
        biggerId = biggerId >= 0 ? biggerId: 0;
        return biggerId + 1;
    }
    
    public static int getBiggerIdFromArray(IdObject[] objectArray){
        /**
         * Gets the bigger id from an array of IdsObject.
         * @params Array with the objects.
         * @return If array > 0: return bigger id. Else: return -1;
         * @author kdukoelho
         */
        
        if (objectArray.length > 0){
            int[] idsArray = new int[objectArray.length];
        int count = 0;
        for (IdObject object : objectArray){
            idsArray[count] = object.getId();
            count++;
        }
        
        int biggerId = 0;
        for (int i = 0; idsArray.length > 0; i++){
            if (i == 0){
                biggerId = idsArray[i];
            }
            else {
                biggerId = biggerId > idsArray[i] ? biggerId : idsArray[i];
            }
        }
        return biggerId;
        }
        else{
            return -1;
        }
    }
}
