import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of * rows: ");

        while (input.hasNext()) {
            int number = input.nextInt();

            // While Method
            int counter = number;
            while (counter > 0) {
                int numberOfSpaces = (number - counter);
                while (numberOfSpaces > 0) {
                    System.out.print(" ");
                    --numberOfSpaces;
                }
                int star = counter;
                while (star != 0) {
                    System.out.print("*");
                    --star;
                }
                --counter;
                System.out.println();
            }

            System.out.println();

            // For Method
            for (int counter2 = number; counter2 > 0; counter2--) {
                for (int numberOfSpaces2 = (number - counter2); numberOfSpaces2 > 0; numberOfSpaces2--) {
                    System.out.print(" ");
                }
                for (int star2 = counter2; star2 > 0; star2--) {
                    System.out.print("+");
                }
                System.out.println();
            }
            System.out.println("Input Ctrl D to quit or,");
            System.out.print("Input number of * rows: ");
        }
    }
}