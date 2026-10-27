// Abstract Class: فئة أساسية لا يمكن إنشاء كائن منها مباشرة
public abstract class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract Method: يجب على جميع الفئات الابنة تطبيقها (Polymorphism)
    public abstract void start();

    // Concrete Method: دالة عادية تتوارثها الفئات الابنة (Inheritance)
    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }

    public String getBrand() {
        return brand;
    }
}
