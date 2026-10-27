public class Main {
    public static void main(String[] args) {
        // Polymorphism & Array of Objects
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", 120);
        vehicles[1] = new ElectricCar("Tesla", 150);

        for (Vehicle v : vehicles) {
            v.displayInfo(); // Inheritance
            v.start();       // Polymorphism (كل مركب تبدأ بطريقتها)

            // Checking interface implementation
            if (v instanceof Electricable) {
                ((Electricable) v).chargeBattery();
            }
            System.out.println("--------------------");
        }
    }
}
