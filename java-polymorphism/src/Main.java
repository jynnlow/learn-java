/*POLYMORPHISM
* poly-many, morphy-form
* the ability of an object to identify as more than one type
*  */
public class Main {
    public static void main (String[] args){
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boot boot = new Boot();

        //all these objects are also identifies as Vehicle
        //storing different objects using polymorphism
        Vehicle[] racers = {car, bicycle, boot};

        car.go();
        bicycle.go();
        boot.go();

        //here is a better way of doing so
        //becasue all these objects are also Vehicle
        //we can access the same methods (go()) through the Vehicle class
        for (Vehicle x : racers){
            //Vehicle class must have go() method
            x.go();
        }
    }
}
