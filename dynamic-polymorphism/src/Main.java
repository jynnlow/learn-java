/* POLYMORPHISM - many forms
* dynamic = after compilation (during runtime)
* ex. Axia
* - a car
* - a vehicle
* - a  Perodua
* - an object
* */
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //declare an object and make a space for it in the memory
        //even though we do not really know what type of object quite yet
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=Dog) or (2=Cat)");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        }else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            animal.speak();
        }
    }
}
