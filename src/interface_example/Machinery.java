package interface_example;

public class Machinery implements Info {

    public Machinery() {
        System.out.println("I am Machinery.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine calling showInfo.");
    }
}
