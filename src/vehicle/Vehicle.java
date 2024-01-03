package vehicle;

public abstract class Vehicle {

    double speed;

    public void go(){
        System.out.println("the car is moving");
    }


    public void stop(){
        System.out.println("the car is stopped");
    }

    abstract void drive() ;

}
