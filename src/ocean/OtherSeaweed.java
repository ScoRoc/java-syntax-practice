package ocean;

public class OtherSeaweed extends Seaweed {

    public OtherSeaweed() {
        // wont work bc type is private in Seaweed
        // type = "other plant";

        // this works bc size is protected from Seaweed and OtherSeaweed is subclass of Seaweed
        size = "large";
        System.out.println("Size is: " + size);

        // works bc this is in same package as Seaweed and height has no access
        height = 12;
        System.out.println("Height is: " + height);
    }
}
