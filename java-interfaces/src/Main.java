/* INTERFACE
* template that applied to a class
* specifies what a class has to do
* a class can apply more than one interface - inheritance is only limited to one parent class
*  */
public class Main {
    public static void main (String[] args){
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();;
        fish.hunt();
    }
}
