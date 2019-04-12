import java.lang.reflect.Array;
import java.util.ArrayList;

import ocean.Fish;
import ocean.Seaweed;
import ocean.OtherSeaweed;
import ocean.plants.Algae;
import interface_example.Info;
import interface_example.Machinery;
import interface_example.Person;

import polymorphism.*;
// could also do this
//import ocean.*;
//import ocean.plants.*;

  //////////////////////////
 // info about variables //
//////////////////////////

/*
 * public  ----------  from anywhere
 * private  ---------  only within same class
 * protected  -------  subclass, and same package
 * not specified  ---  same pacakge only
 */

public class App {

    public static void main(String[] args) {

        // From other file
        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.wipeWindshield();

        System.out.println("");

        // From other package
        Fish fish1 = new Fish();
        Seaweed seaweed1 = new Seaweed();
        Algae algae1 = new Algae();

        System.out.println("");

        Machinery mach1 = new Machinery();
        Info info1 = new Machinery();
        info1.showInfo();
        Person person1 = new Person();

        Info info2 = person1;
        info2.showInfo();

        System.out.println("");

        outputInfo(person1);
        outputInfo(mach1);

        System.out.println("");

        Seaweed seaweed2 = new Seaweed();
        System.out.println(seaweed2.name);
        System.out.println(seaweed2.COLOR);

        OtherSeaweed otherSeaweed1 = new OtherSeaweed();

        // wont work bc type is private in Seaweed
        // System.out.println(seaweed2.type);

        // wont work bc size is protected in Seaweed, which can only be used by Seaweed and its subclasses
        // also Seaweed is in a different package
        // System.out.println(seaweed2.size);

        // wont work bc App and Seaweed are in dif packages
        // and height has package level access
        // System.out.println(seaweed2.height);

        System.out.println("");

        Plant plant1 = new Plant();
        Tree tree1 = new Tree();
        Plant plant2 = tree1;

        plant2.grow();
        tree1.leavesFalling();

        doGrow(tree1);

        System.out.println("");

        // Upcasting
        // variable type (ie, Tree, Plant, String, int, etc.) determines what methods you can call
        // but object (new Tree(), new Plant, etc) determines what those methods are/do
        Tree tree2 = new Tree();
        Plant plant3 = tree2;

        // Downcasting
        Plant plant4 = new Tree();
        Tree tree3 = (Tree)plant4;

        System.out.println("");

        // Generics
        // in <> is type of thing in the Generic
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("fish");
        animals.add("bird");

        System.out.println("animals[1]: " + animals.get(1));

        System.out.println("");

        // Generics and Wildcards
        ArrayList<String> list = new ArrayList<>();
        list.add("thing 1");
        list.add("thing 2");
        showStringList(list);

        System.out.println("");

        ArrayList<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture());
        furnitureList.add(new Furniture());
        showFurnitureList(furnitureList);

        System.out.println("");

        ArrayList<Table> tableList = new ArrayList<>();
        tableList.add(new Table());
        tableList.add(new Table());
        showList(tableList);

        System.out.println("");

        showAnyFurnitureList(tableList);

        System.out.println("");

        Furniture furnitureAnon = new Furniture() {
            @Override public void greet() {
                System.out.println("I am an anon class of Furniture.");
            }
        };

        furnitureAnon.greet();

    } // end of main()
    //////////////////

    private static void outputInfo(Info info) {
        info.showInfo();
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }

    public static void showStringList(ArrayList<String> list) {
        System.out.println("Showing list...");
        for(String word: list) {
            System.out.println(word);
        }
        System.out.println("End of list.");
    }

    public static void showFurnitureList(ArrayList<Furniture> list) {
        System.out.println("Showing furniture list...");
        for(Furniture word: list) {
            System.out.println(word);
        }
        System.out.println("End of furniture list.");
    }

    public static void showTableList(ArrayList<Table> list) {
        System.out.println("Showing table list...");
        for(Table word: list) {
            System.out.println(word);
        }
        System.out.println("End of table list.");
    }

    public static void showList(ArrayList<?> list) {
        System.out.println("Showing list...");
        for(Object word: list) {
            System.out.println(word);
        }
        System.out.println("End of list.");
    }

    public static void showAnyFurnitureList(ArrayList<? extends Furniture> list) {
        System.out.println("Showing list...");
        for(Furniture word: list) {
            System.out.println(word);
            word.greet();
        }
        System.out.println("End of list.");
    }
}
