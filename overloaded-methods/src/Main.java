/*OVERLOADED METHOD
* methods that share the same name but different parameters
* method signature = method name + parameter
* whats make every methods unique : number and sequence of parameter, datatype
* */

public class Main {
    public static void main (String[] args){
        System.out.println(add(3,3,3));
    }

    static int add (int a, int b) {
        System.out.println("This is overloaded method number 1");
        return a + b;
    }
    static int add (int a, int b, int c) {
        System.out.println("This is overloaded method number 2");
        return a + b + c;
    }
    static int add (int a, int b, int c, int d) {
        System.out.println("This is overloaded method number 3");
        return a + b + c + d;
    }
}
