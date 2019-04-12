public class MoreClassExamples {

    public static void main(String[] args) {

        // Inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // Efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.")
            .append(" ")
            .append("I am a lion tamer.");

        System.out.println(sb.toString());

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d: %s\n", i, "The number.");
        }
        for (int i = 7; i <= 14; i++) {
            System.out.printf("%-2d: %s\n", i, "Wahoo.");
        }
        System.out.printf("Float formatting: %f\n", 3852.382057);
        System.out.printf("Float formatting: %.1f\n", 3852.382057);
        System.out.printf("Float formatting: %.2f\n", 3852.382057);
        System.out.printf("Float formatting: %6.3f\n", 3852.382057);

    }
}
