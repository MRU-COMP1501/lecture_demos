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

// Yahtzee algorithm sample
//    Problem: which Yahtzee strategy is better?
//    Approach: try each thousands of times (millions?)
//    - define the two scenarios:
//    - roll one die twice to try to get a 4
//    - roll two dice up to twice to try to get a 4/6 or 4/1
//
//    Breakdown:
//    - main method (run) to loop over trials and count successes
//    - method to ask the user how many trials
//    - method to execute scenario 1 and scenario 2
//    - scenario 1 is simple:
//    - roll a die, if 4 return true
//    - roll again, if 4 return true
//    else return false
//
//    - scenario 2
//    - roll both dice, [if 4/6 or 4/1, return true] -> magicCombo
//    - else [if 4, 6, or 1] -> keepRoll
//    - reroll the other die, [if 4/6 or 4/1, return true] -> magicCombo
//
//    - scenario 2 rewritten:
//    roll dice, if magicCombo, return true
//    if keepRoll, reroll the other
//    if magicCombo, return true
//    reroll both, if magicCombo, return true
//    else return false
