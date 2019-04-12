import java.util.Scanner;

public class SyntaxExamples {

    public static void main(String[] args) {

        int[][] grid = {
                {3, 5, 252},
                {2, 4},
                {7, 8, 9}
        };
        System.out.println("First example: " + grid[0][2]);
        System.out.println("------");

        String[][] texts = new String[2][3];

        for(int[] arr: grid) {
            for(int num2: arr) {
                System.out.println(num2);
            }
        }

        System.out.println("___________");
        System.out.println("Grid format");
        System.out.println("-----------");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }



        /*
        String[] fruits = {"apple", "banana", "kiwi"};
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
         */


        /*
        int[] myIntArr;

        myIntArr = new int[3];

        System.out.println(myIntArr[0]);

        myIntArr[0] = 10;
        myIntArr[1] = 20;
        myIntArr[2] = 30;
        System.out.println(myIntArr[0]);
        System.out.println(myIntArr[1]);
        System.out.println(myIntArr[2]);

        for(int i = 0; i < myIntArr.length; i++) {
            System.out.printf("myIntArr at index %d is: %d.\n", i, myIntArr[i]);
        }
        int[] nums = {5, 6, 7};
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("Current number is %d.%n", nums[i]);
        }
         */


        /*
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        } while(value != 5);
        System.out.println("Got 5!");
         */


        /*
        System.out.println("Enter a number: ");
        int value = scanner.nextInt();
        while(value != 5) {
            System.out.println("Wrong number. Please enter another number: ");
            value = scanner.nextInt();
        }
        System.out.println("Correct! You picked 5!");
         */


        /*
        System.out.println("Hello World!");
        int value = 0;
        boolean loop = value < 20;
        while(value < 10) {
            System.out.println("value is less than 10");
            value += 1;
        }
        System.out.println("value is: " + value);

        for (int i = 0; i < 5; i++) {
            System.out.printf("The value of i is: %d.\n", i);
        }
        System.out.println("for loop done");

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // Output prompt
        System.out.println("Enter a line of text: ");

        // wait for user to enter something
        String line = input.nextLine();

        // Tell them what they typed
        System.out.println("You entered: ~ " + line + " ~");

        // Output prompt
        System.out.println("Enter a number: ");

        // wait for user to enter something
        int num = input.nextInt();

        // Tell them what they typed
        System.out.println("You entered: ~ " + num + " ~");
         */
    }
}
