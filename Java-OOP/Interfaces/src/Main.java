//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * An interface in Java is a blueprint of a class that contains only
         * abstract methods. It's used to achieve abstraction and multiple
         * inheritance in Java.
         */

        // Creating objects of classes implementing the interface
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
    }
}