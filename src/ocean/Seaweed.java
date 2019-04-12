package ocean;

public class Seaweed {
    // bad practice to make public
    public String name;

    // this is ok practice bc its final (constant)
    public final static String COLOR = "green";

    // only accessible within Seaweed (not even classes that extend it)
    private String type;

    // only accessible within Seaweed and its subclasses
    // and anything that calls it IN THE SAME PACKAGE
    protected String size;

    // no access specified
    // becomes pacakge level
    int height;

    public Seaweed() {
        name = "Freddy the Seaweed.";
        System.out.println("I am seaweed.");

        type = "plant";

        size = "medium";
        System.out.println("Size is: " + size);

        height = 8;
        System.out.println("height is: " + height);
    }
}
