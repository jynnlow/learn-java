import java.util.Random;

public class RandomValue {
    public static void main(String[] args){
        Random random = new Random();

        System.out.println("----------Random Int----------");
        int randomInt = random.nextInt();
        System.out.println("Random Int: " + randomInt);

        //pass the limit of random number into the parenthesis as parameter
        // 6 means from 0 to 5
        int randomIntLimit = random.nextInt(6);
        System.out.println("Random Int with Limit: " + randomIntLimit);

        //if we wants the number between 1 to 6
        int randomIntRange = random.nextInt(6) + 1;
        System.out.println("Random Int with Starting Number: " + randomIntRange + "\n");

        System.out.println("----------Random Double----------");
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble + "\n");

        System.out.println("----------Random Boolean----------");
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}
