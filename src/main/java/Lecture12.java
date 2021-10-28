import java.util.Scanner;

public class Lecture12 {
    Scanner input = new Scanner(System.in);
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
