import java.util.HashMap;
import java.util.Map;

public class ClassAndMethodExamples {

    public static void main(String[] args) {

        Person chad = new Person("Chad", 30);
        System.out.println(chad);
        chad.setAddress(133, "Broadway", "Seattle", "WA");
        chad.getAddress();

        System.out.println("\n");

        Person isabelle = new Person("Isabelle", 28);
        isabelle.setAddress(45, "Main", "Seattle", "WA");
        System.out.println(isabelle);
        isabelle.getAddress();

        System.out.println("\n");

        chad.setName("blarf");
        chad.speak();
        chad.setName("Chad");
        chad.speak();

        System.out.println("\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println("map.one: " + map.get("one"));

        chad.test1();
        chad.test1("yooo");

        System.out.println("\n");

        System.out.println(chad.description);
        System.out.println(isabelle.description);
        isabelle.description = "Haha changed it for Chad too....";
        System.out.println(chad.description);
        System.out.println(Person.description);

    }
}

class Person {
    private String name;
    private int age;
    private Address address;

    public static String description;

    public void test1() {
        System.out.println("In test1 with no params");
        description = "I am a person class.";
    }

    public void test1(String word) {
        System.out.println("In test1 with param ~ " + word + " ~ !");
    }

    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    public String toString() {
        return name + " is " + age + " years old.";
    }

    public void speak() {
        System.out.println("My name is " + name + ".");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(int num, String name, String city, String state) {
        address = new Address(num, name, city, state);
    }

    public void getAddress() {
        System.out.printf("%d %s%n%s, %s", address.streetNumber, address.streetName, address.city, address.state);
    }
}

class Address {
    int streetNumber;
    String streetName;
    String city;
    String state;

    public Address() {
        System.out.println("In Address constructor.");
    }

    public Address(int num) {
        this();
        streetNumber = num;
    }

    public Address(int num, String name) {
        this(num);
        streetName = name;
    }

    public Address(int num, String name, String city) {
        this(num, name);
        this.city = city;
    }

    public Address(int num, String name, String city, String state) {
        this(num, name, city);
        this.state = state;
    }
}