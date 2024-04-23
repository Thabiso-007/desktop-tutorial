//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         *  Abstraction is the process of hiding the implementation details and
         *  showing only the essential features of the object. In Java, abstraction
         *  is achieved using abstract classes and interfaces.
         */

        // Creating objects of concrete subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle

    }
}