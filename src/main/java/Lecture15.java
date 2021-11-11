import java.util.Scanner;

public class Lecture15 {
    Scanner input = new Scanner(System.in);

    /**
     * Reads and validates account number input from user.
     * Ensures input is an integer, allows negatives.
     *
     * @return account number
     */
    int readAccountNumber() {
        int accountNum = -1;
        boolean keepLooping = true;
        while (keepLooping) {
            System.out.print("Enter the account number: ");
            if (input.hasNextInt()) {
                accountNum = input.nextInt();
                keepLooping = false;
            } else {
                System.out.print("Sorry, try again\n");
                input.nextLine();
            }
        }
        return accountNum;
    }

    /**
     * Contrived example to declare and call different methods,
     * passing information between them.
     */
    void callAndPass() {
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
//        boolean sss = hasLetterS(phrase);
//        printMessage(sss);
        printMessage(hasLetterS(phrase));
    }

    boolean hasLetterS(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's' || str.charAt(i) == 'S') {
                return true;
            }
        }
        return false;
    }

    void printMessage(boolean hasS) {
        if (hasS) {
            System.out.println("wow, that's quite the S");
        } else {
            System.out.println("Nope");
        }
    }

    /**
     * Rolls a d4 and prints out whether a snack should be eaten.
     * Stops executing when a 4 is rolled.
     */
    void refactorMe(String snack) {
        Die d4 = new Die();
        int roll = d4.roll();

        do {
            if (roll == 1 && snack.equals("candy")) {
                System.out.printf("Rolled a %d? Eat that %s!\n",roll,snack);
            } else if (roll == 1 && (snack.equals("chips") || snack.equals("popcorn"))) {
                System.out.printf("Rolled a %d? Eat that %s!\n",roll,snack);
            } else if (snack.equals("fruit")) {
                System.out.printf("Rolled a %d? Eat that %s!\n",roll,snack);
            } else {
                System.out.printf("Sorry, rolled a %d, no %s for you\n",roll,snack);
            }
            roll = d4.roll();
        } while (roll != 4);
    }
}
