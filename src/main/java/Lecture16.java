import java.util.Arrays;

public class Lecture16 {
    /**
     * Rolls a d4 and prints out whether a snack should be eaten.
     * Stops executing when a 4 is rolled.
     */
    void refactorMe(String snack) {
        Die d4 = new Die();
        int roll = d4.roll();

        if (snack.length() > 0) {
            do {
                if (roll == 1 && snack.equals("candy")) {
                    System.out.printf("Rolled a %d? Eat that %s!\n", roll, snack);
                } else if (roll == 1 && (snack.equals("chips") || snack.equals("popcorn"))) {
                    System.out.printf("Rolled a %d? Eat that %s!\n", roll, snack);
                } else if (snack.equals("fruit")) {
                    System.out.printf("Rolled a %d? Eat that %s!\n", roll, snack);
                } else {
                    System.out.printf("Sorry, rolled a %d, no %s for you\n", roll, snack);
                }
                roll = d4.roll();
            } while (roll != 4);
        } else {
            System.out.println("That isn't even a snack!");
        }
    }

    /**
     * Create an array and fill it with dice rolls, then print.
     */
    void arrayBounds() {
    }

    /**
     * Create an array, make a copy, edit the copy, the print it out.
     */
    void copyArrayRef() {
    }

    /**
     * Demonstrate array equality and reference equality.
     */
    void arrayEquality() {
    }

    /**
     * Demonstrate accessing an element out of bounds
     */
    void outOfBounds() {
    }

    /**
     * Demonstrate enhanced for.
     * Also, use a String array.
     */
    void enhancedFor() {
    }
}
