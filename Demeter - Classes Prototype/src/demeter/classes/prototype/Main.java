/**
 * @author kdukoelho
 */
package demeter.classes.prototype;

public class Main {

    public static void main(String[] args) {
        Employee[] objts = new Employee[3];
        for (int i = 0; i < objts.length; i++){
            Employee objt = new Employee("Carlos", Permissions.manager());
            objts[i] = objt;
        }
        for (Employee objt : objts){
            System.out.println(objt.getId());
        }
    }
}
