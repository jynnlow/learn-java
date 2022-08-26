import java.util.*;

public class Main {
    public static void main (String[] args){
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("cake");

        ArrayList<String> dairyList = new ArrayList<String>();
        dairyList.add("milk");
        dairyList.add("yogurt");
        dairyList.add("cheese");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coke");
        drinkList.add("soya");

        groceryList.add(bakeryList);
        groceryList.add(dairyList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
    }
}
