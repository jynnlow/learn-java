public class Main {
    public static void main (String[] args){
        Car car = new Car();

        //call toString method explicitly
        System.out.println(car.toString());

        //call toString method implicitly
        System.out.println(car);

        //if the class does not override toString() method
        //the memory address will be printed out
        //System.out.println(car); //Car@2f92e0f4
    }
}
