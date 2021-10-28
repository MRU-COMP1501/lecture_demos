import java.util.Locale;
import java.util.Scanner;

public class Lecture11 {
    Scanner input = new Scanner(System.in);

    void whileDoWhile() {
        // change to x < 0 to show difference
        System.out.println("while loop: ");
        int x = 4;
        while (x < 3) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\nDone");
        System.out.println("do while:");

        x = 4;
        do {
            System.out.print(x + " ");
            x++;
        } while (x < 3);

        System.out.println("\nDone");
    }

    void doWhileValidation() {
        // A better example than in Lecture 10
        int value;

        do {
            System.out.print("Enter a value between 0 and 100: ");
            value = input.nextInt();
        }
        while (value < 0 || value > 100);

        System.out.println("Your number is " + value);
    }

    void countdownForLoop() {
        // blastoff
        /// could also write countdown = countdown - 1;
        for (int countdown = 10; countdown > 0; countdown--) {
            System.out.print(countdown + "... ");
        }
        System.out.println("Blastoff!");
    }

    void notEqualsLoop() {
        // != 10
        for (int num = 1; num < 10; num += 2) {
            System.out.print(num + " ");
        }
    }

    void sentinelLoop() {
        // change from for loop to sentinel
//        System.out.print("How many test grades do you want to average? ");
//        int nGrades = input.nextInt();

        double total = 0;
        int nGrades = 0;

        System.out.print("Enter grades, -1 to finish: ");
        double grade = input.nextDouble();

        while (grade != -1) {
            nGrades++;
            total += grade;
            System.out.print("Enter the next grade: ");
            grade = input.nextDouble();
        }

//        for (int n = 0; n < nGrades; n++) {
//            System.out.print("Enter the next grade: ");
//            grade = input.nextDouble();
//            total += grade; // same as total = total + grade
//        }
        System.out.println("The average score is " + total / nGrades);
    }

    void validationLoop() {
        // uses hasNext as a kind of sentinel
        double total = 0;
        double grade = 0;
        int nGrades = 0;

        System.out.print("Enter grades to average, Q to quit: ");
        while (input.hasNextDouble()) {
            grade = input.nextDouble();
            total += grade;
            nGrades++;
        }

        System.out.println("The average score is " + total / nGrades);
    }

    void findCaps() {
        // loop over a string and look for capitals
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String initials = "";

        for (int i = 0; i < name.length(); i++) {
            // N A M E
            // 0 1 2 3
            String character = name.substring(i,i+1);
            if (character.equals(character.toUpperCase()) &&
                !character.equals(" ")) {
                initials += character;
            }
        }

        System.out.println("Your initials are " + initials);
    }
}
