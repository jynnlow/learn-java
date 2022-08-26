public class Car {
    String make = "Proton";
    String model = "Saga";
    String color = "silver";
    int year = 1999;

    //overriding toString function
    public String toString(){
        return make + model + color + year;
    }
}
