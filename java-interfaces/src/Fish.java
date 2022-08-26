public class Fish implements Predator, Prey{
    @Override
    public void hunt() {
        System.out.println("The fish is hunting smaller fishes.");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing by a larger fish.");
    }
}
