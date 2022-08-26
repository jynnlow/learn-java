/*ABSTRACT
* - abstract class cannot be instantiated, but they can have a subclass
* - abstract method are declared without implementation
*  */
public class Main {
    public static void main (String[] args){

        /* Vehicle vehicle = new Vehicle(); //error
        * not able to instantiate abstract Vehicle class
        * prevent creating a instance that is too vague - the use of abstract class
        * */

        Car car = new Car();
        car.go();
    }
}
