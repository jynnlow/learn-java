import java.util.ArrayList;

//for each loop - less step, more readable, but less flexible
public class Main {
    public static void main (String[] args){
        String[] animals = {"cat", "bird", "dog"};
        for (String i : animals){
            System.out.println(i);
        }

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("bird");
        animals2.add("dog");
        for (String i : animals2){
            System.out.println(i);
        }
    }
}
