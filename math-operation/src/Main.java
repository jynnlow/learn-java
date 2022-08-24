public class Main {
    public static void main (String[] args){
        double x = 3.14;
        double y = 10;

        //1. larger number
        double max = Math.max(x,y);
        //2. smaller number
        double min = Math.min(x,y);
        //3. absolute value - without negative
        double abs = Math.abs(y);
        //4. square root
        double sqrt = Math.sqrt(y);
        //5. round off
        double round = Math.round(x);
        //6. ceiling - round up
        double ceil = Math.ceil(x);
        //7. floor - round down
        double floor = Math.floor(x);

        System.out.println("X: " + x);
        System.out.println("Y: " + y + "\n");

        System.out.println("----------Comparison between X and Y----------");
        System.out.println("larger: " + max);
        System.out.println("smaller: " + min + "\n");

        System.out.println("----------Absolute and Square root of Y----------");
        System.out.println("absolute num: " + abs);
        System.out.println("square root: " + sqrt + "\n");

        System.out.println("----------Round Off of X----------");
        System.out.println("normal round off: " + round);
        System.out.println("round up: " + ceil);
        System.out.println("round down: " + floor);
    }
}
