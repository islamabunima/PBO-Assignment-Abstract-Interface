// Inheritance: تتوارث من Vehicle
public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " car is starting with key ignition.");
    }
}
