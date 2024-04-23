public class Car {
    private Engine engine; // Car has an Engine

    // Constructor
    public Car() {
        engine = new Engine();
    }

    // Method
    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}
