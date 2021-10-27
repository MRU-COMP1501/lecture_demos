import java.util.Locale;
import java.util.Scanner;

public class Lecture11 {
    Scanner input = new Scanner(System.in);

    void whileDoWhile() {
        // change to x < 0 to show difference
        System.out.println("while loop: ");
        int x = 0;
        while (x < 3) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\nDone");
        System.out.println("do while:");

        x = 0;
        do {
            System.out.print(x + " ");
            x++;
        } while (x < 3);

        System.out.println("\nDone");
    }

    void doWhileValidation() {
        // A better example than in Lecture 10
        double value;

        do {
            System.out.print("Enter a value between 0 and 100: ");
            value = input.nextInt();
        }
        while (value < 0 || value > 100);

        System.out.println("Your number is " + value);
    }

    void countdownForLoop() {
        // blastoff
    }

    void notEqualsLoop() {
        // != 10
    }

    void sentinelLoop() {
        // change from for loop to sentinel
        System.out.print("How many test grades do you want to average? ");
        int nGrades = input.nextInt();

        double total = 0;
        double grade;

        for (int n = 0; n < nGrades; n++) {
            System.out.print("Enter the next grade: ");
            grade = input.nextDouble();
            total += grade; // same as total = total + grade
        }
        System.out.println("The average score is " + total / nGrades);
    }

    void validationLoop() {
        // uses hasNext as a kind of sentinel
        double total = 0;
        double grade = 0;
        int nGrades = 0;

        System.out.print("Enter grades to average, Q to quit: ");

//        while () {
//
//        }

        System.out.println("The average score is " + total / nGrades);
    }

    void findCaps() {
        // loop over a string and look for capitals
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String initials = "";

//        for () {
//
//        }

        System.out.println("Your initials are " + initials);
    }

    void palindromeDetector() {
        // Prompts the user to enter a word and outputs if it is a palindrome or not
        System.out.print("Enter a word: ");
        String word = input.next();
        String reversed = "";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            reversed = word.substring(i,i+1) + reversed;
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome :(");
        }
    }

    void palindromeHalfLoopDetector() {
        // Prompts the user to enter a word and outputs if it is a palindrome or not
        // Loops through half the word only
        System.out.print("Enter a word: ");
        String word = input.next();
        int length = word.length();
        boolean palindrome = true;

        for (int i = 0; i < length / 2; i++) {
            char first = word.charAt(i);
            char last = word.charAt(length - 1 - i);
            if (first != last) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome :(");
        }
    }
}
