//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * It involves bundling the data and methods that operate on the
         * data into a single unit (class), and controlling access to
         * the data through access modifiers.
         */

        // Creating object of Person class
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}