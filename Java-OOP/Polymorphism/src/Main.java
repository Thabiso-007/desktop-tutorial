//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // It allows objects of different classes to be treated as objects of a common superclass.

        // Polymorphic behavior
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle
    }
}