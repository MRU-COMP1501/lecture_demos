import java.util.Scanner;

public class Lecture14 {
    Scanner input = new Scanner(System.in);
    Die d4 = new Die(4);
    int roll = d4.roll();

    /**
     * Demonstrates problem with repeatedly calling nextInt
     */
    void scannerIssue() {
        int value = -1;
        while (value < 0) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                value = input.nextInt();
            }
            input.nextLine();

            if (value < 0) {
                System.out.println("Sorry, try again");
            }
        }
    }

    /**
     * Demonstrates what happens when return value not captured, then fix it
     */
    void returnUnused() {
        double x = 2;
        System.out.printf("x = %f\n",x);
        x = squareIt(x);
        System.out.printf("x = %f\n",x);
    }

    /**
     * Squares a number. Yes, you could just use Math.pow.
     * @param x number to be squared
     * @return x squared
     */
    double squareIt(double x) {
        // also show how result can be returned directly
//        x = x * x;
        return x * x;
    }

    /**
     * Demonstrates scope of different variables
     */
    void scopeDemo() {
        int numRolls = 0;
        int roll;

        do {
            roll = d4.roll();
            String rollString = String.format("You rolled a %d\n",roll);
            System.out.print(rollString);
            numRolls++;
        } while (roll != 4);

//        System.out.print(rollString);
        System.out.printf("It took %d rolls to get a 4",numRolls);
    }

    /**
     * Also for demonstrating scope, local + global
     */
    void rollAgain() {
        showGlobalRoll();
        // DON'T DO THIS
        int roll = d4.roll();
        System.out.printf("Local roll: %d\n", roll);
        showGlobalRoll();
    }

    void showGlobalRoll() {
        System.out.printf("Global roll: %d\n", roll);
    }

    /**
     * Demonstrate debugging
     */
    void debugDemo() {
        double number = 1.0;
        String keepGoing = "yay";
        System.out.println("Enter numbers, then press q to stop.");
        while (!keepGoing.equals("q")) {
            double numerator = getValidDouble("numerator");
            double denominator = getValidDouble("denominator");
            printAsPercent(numerator,denominator);
            keepGoing = input.nextLine();
        }
    }

    /**
     * Print a fraction formatted as a percentage
     * @param num the numerator
     * @param denom the denominator
     */
    void printAsPercent(double num, double denom) {
        double fraction = num / denom;
        if (fraction < 1) {
            fraction *= 100;
        }
        System.out.printf("Your fraction is %.2f%%\n", fraction);
    }

    /**
     * Prompt user for a number and validate.
     * Also, demonstrate recursion and tracing.
     * @return number input by user
     */
    double getValidDouble(String what) {
        System.out.print("Enter the " + what + ": ");

        if (input.hasNextDouble()) {
            double value = input.nextDouble();
            input.nextLine(); // clear that buffer
            return value;
        } else {
            System.out.println("Sorry, try again.");
            input.nextLine();
            return getValidDouble(what);
        }
    }
}
