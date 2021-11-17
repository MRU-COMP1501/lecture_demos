import java.util.Arrays;

public class Lecture16 {
    /**
     * Rolls a d4 and prints out whether a snack should be eaten.
     * Stops executing when a 4 is rolled.
     */
    void refactorMe(String snack) {
        if (snack.length() == 0) {
            System.out.println("That isn't even a snack!");
            return;
        }

        Die d4 = new Die(4);
        int roll = d4.roll();

        do {
            if (shouldCheckRoll(snack)) {
                if (roll == 1) {
                    System.out.printf("Rolled a %d? Eat that %s!\n", roll, snack);
                } else {
                    System.out.printf("Sorry, rolled a %d, no %s for you\n", roll, snack);
                }
            } else if (snack.equals("fruit")) {
                System.out.printf("Rolled a %d? Eat that %s!\n", roll, snack);
            } else {
                System.out.printf("Sorry, rolled a %d, no %s for you\n", roll, snack);
            }
            roll = d4.roll();
        } while (roll != 4);
    }

    boolean shouldCheckRoll(String snack) {
        return snack.equals("chips") || snack.equals("popcorn") || snack.equals("candy");
    }

    /**
     * Create an array and fill it with dice rolls, then print.
     */
    void arrayBounds() {
        Die d12 = new Die(12);
        int[] rolls = new int[6];

        for (int i = 0; i < rolls.length; i++) {
            System.out.print(rolls[i] + " ");
            rolls[i] = d12.roll();
            System.out.print(rolls[i] + "\n");
        }
    }

    /**
     * Create an array, make a copy, edit the copy, the print it out.
     */
    void copyArrayRef() {
        int[] rolls = {1, 2, 3, 4};
        int[] sameRolls = rolls;
        int[] copyRolls = Arrays.copyOf(rolls, rolls.length + 2);
        System.out.println("copyRolls length: " + copyRolls.length);
        System.out.print(copyRolls[copyRolls.length - 1] + " ");

        System.out.print(rolls[0] + " ");
        copyRolls[0] = 6;
        System.out.print(rolls[0] + " ");
        sameRolls[0] = 4;
        System.out.print(rolls[0]);
    }

    /**
     * Demonstrate array equality and reference equality.
     */
    void arrayEquality() {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};

        System.out.println("Array == :      " + (array1 == array2));
        System.out.println("Arrays.equals : " + Arrays.equals(array1, array2));
    }

    /**
     * Demonstrate accessing an element out of bounds
     */
    void outOfBounds() {
        double[] values = new double[10];
        System.out.println("First element: " + values[0]);

//        double[] uninitialized;
//        uninitialized[0] = 100;
        values[10] = 100;
    }

    /**
     * Demonstrate enhanced for.
     * Also, use a String array.
     */
    void enhancedFor() {
        String[] lunch = {"sandwich", "rice", "apple", "candy"};

        for (String food : lunch) {
            System.out.print(food + ", ");
            food = "eaten";
            System.out.print(food + ", ");
        }
        System.out.println();
        for (int i = 0; i < lunch.length; i++) {
            System.out.print(lunch[i] + ", ");
            lunch[i] = "eaten";
            System.out.print(lunch[i] + ", ");
        }

        System.out.println();
        for (String food : lunch) {
            System.out.print(food + ", ");
        }
    }

}
