public class Car extends Vehicle{
    /* every child class is forced to implement or override
    * the abstract method that has declared in the parent abstract class
    * */
    @Override
    void go() {
        System.out.println("Car");
    }
}
