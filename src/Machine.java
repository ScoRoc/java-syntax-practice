public class Machine {

    public void start() {
        System.out.println("Machine started.");
    }

    public void start(String type) {
        System.out.println(type + " started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }

    public void stop(String type) {
        System.out.println(type + " stopped.");
    }
}
