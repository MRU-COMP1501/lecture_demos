import java.util.Scanner;

public class Lecture14 {
    Scanner input = new Scanner(System.in);

    /**
     * Demonstrates problem with repeatedly calling nextInt
     */
    void scannerIssue() {
        int value = -1;
        while (value < 0) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                value = input.nextInt();
            } else {
                input.nextLine();
            }
            if (value < 0) {
                System.out.println("Sorry, try again");
            }
        }
    }
}
