package interface_example;

public class Person implements Info {

    public Person() {
        System.out.println("I am Person.");
    }

    @Override
    public void showInfo() {
        System.out.println("Person calling showInfo.");
    }
}
