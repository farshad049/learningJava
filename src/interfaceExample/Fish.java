package interfaceExample;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("fish is fleeing");

    }
}
