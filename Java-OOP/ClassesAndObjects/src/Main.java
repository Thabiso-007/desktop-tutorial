//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // A class is a blueprint for creating objects, and an object is an instance of a class

        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);

        // Calling method on objects
        car1.displayInfo();
        car2.displayInfo();
    }
}