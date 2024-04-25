//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void useRectangle(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        // Assume the height has been changed, but width remains unchanged
        System.out.println("Expected area = " + (width * 10));
        System.out.println("Actual area = " + r.getArea());
    }

    public static void main(String[] args) {
        /**
         * Subtypes must be substitutable for their base types.
         *
         * In simpler terms, this means that objects of a superclass
         * should be replaceable with objects of its subclass without
         * affecting the correctness of the program. In other words, a
         * subclass should extend the functionality of its superclass
         * without altering its behavior in a way that violates the expectations
         * of the code using the superclass.
         */

        Rectangle rectangle = new Rectangle(5, 5);
        Square square = new Square(5);

        // Using a Rectangle
        useRectangle(rectangle); // Expected area = 50, Actual area = 50

        // Using a Square
        useRectangle(square); // Expected area = 50, Actual area = 100
    }
}