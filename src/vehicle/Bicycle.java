package vehicle;

public class Bicycle extends Vehicle{

    public int numberOfWheels= 2;

    @Override
    void drive() {
        System.out.println("the driver is driving");
    }
}
