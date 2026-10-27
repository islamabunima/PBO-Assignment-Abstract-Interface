# PBO Assignment - Abstract Class & Interface

**Name:** Islam Ahmed Fouad Abunima
**NIM:** F1D02411003
**Class:** PBO 5A

## Topic Explanations

1. **Abstract Class (`Vehicle`)**:
   - Cannot be instantiated directly.
   - Serves as a base for all vehicles with common properties (`brand`, `speed`) and concrete method `displayInfo()`.

2. **Abstract Method (`start()`)**:
   - Declared in `Vehicle` without body, forcing child classes (`Car`, `ElectricCar`) to provide their own implementation.

3. **Interface (`Electricable`)**:
   - Defines a contract for electric vehicles by specifying the `chargeBattery()` method.

4. **Inheritance**:
   - `Car` and `ElectricCar` inherit attributes and methods from `Vehicle` using `extends`.

5. **Polymorphism**:
   - Demonstrated in `Main.java` using an array of `Vehicle[]` where calling `v.start()` executes different behaviors depending on the actual object type at runtime.
