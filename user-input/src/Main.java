import java.util.Scanner;

public class Main {
    public static void main (String []args){
        //instantiation
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine(); //user input

        /* PROBLEM HERE:
        *nextLine method will read the input until user click enter to submit (\n is included)
        *then the input will be cleared, and move to next question
        *nextInt method is only to read the numerical input
        *when we insert 23 and click enter to submit --> 23 \n
        *nextInt method will only read until 23 and \n still left in the scanner object
        *the next nextLine method will think than the left over \n is inserted by the user
        *then it ends the questions
        */
        System.out.println("How old are you?");
        int age = scanner.nextInt();//user input
        scanner.nextLine();
        /* SOLUTION:
        * add scanner.nextLine() to clear the input (left over \n)
        * */

        System.out.println("What is your zodiac?");
        String zodiac = scanner.nextLine();//user input

        System.out.println("Hello!" + name);
        System.out.println("Your are " + age + " years old!");
        System.out.println("Your are born in year of " + zodiac + "!");
    }
}
