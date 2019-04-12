public class Car extends Machine {

    @Override
    public void start() {
        super.start("Car");
    }

    public void stop() {
        super.stop("Car");
    }

    public void wipeWindshield() {
        System.out.println("Wiping windshield.");
    }
}
