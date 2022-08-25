import java.util.ArrayList;

/* ARRAYLIST = a resizable array
* elements can be added and removed after compilation phase
* stores only reference data
* */
public class Main {
    public static void main (String[] args){
        // have to be reference data - wrapper class
        // integer: ArrayList<Integer> price = new ArrayList<Integer>();
        // double: ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> food = new ArrayList<String>();

        //add element
        food.add("pizza");
        food.add("hotdog");
        food.add("nugget");

        //size of arraylist
        System.out.println(food.size());

        //change element at a specific index
        food.set(0, "spaghetti");

        //remove element at a specific index
        food.remove(2);

        //clear all elements
        food.clear();
    }
}
