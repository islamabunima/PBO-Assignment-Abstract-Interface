// Inheritance + Interface Implementation
public class ElectricCar extends Vehicle implements Electricable {
    public ElectricCar(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " electric car is starting silently with push button.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(getBrand() + " is charging its battery...");
    }
}
