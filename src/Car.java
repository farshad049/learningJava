public class Car {
    String make= "Chevrolet";
    String model= "Corvette";
    int year= 2020;
    String color = "blue";
    double price= 5000.0;
    void drive(){
        System.out.println("you drive the car");
    }

    void brake(){
        System.out.println("you break the car");
    }

    public String toString(){
        return make+ "\n" + model + "\n" + color + "\n" + year;
    }


}
