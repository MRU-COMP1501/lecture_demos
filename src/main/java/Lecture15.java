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
        while (true) {
            System.out.print("Enter the account number: ");
            if (input.hasNextInt()) {
                accountNum = input.nextInt();
                break;
            } else {
                System.out.print("Sorry, try again\n");
                input.nextLine();
            }
        }
        return accountNum;
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
