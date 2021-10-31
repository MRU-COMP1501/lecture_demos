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

//        for () { // half the string
//            // palindrome false if first != last
//        }

        if (palindrome) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome :(");
        }
    }

    void countMatches() {
        // loop over characters and count how many "a"s there are
        String sentence = input.nextLine();
        int count = 0;

        // for (int i = 0; i < sentence.length(); i++) {
        // }

        System.out.printf("There are %d \"a\"s\n",count);
    }

    void findMatch() {
        // Enter numbers until the match is found
        int number = (int)(Math.random() * 10) + 1;
        int guess = -1;

        System.out.print("Guess a number between 1 and 10: ");
//        while guess != number
//          input a guess

        System.out.printf("You guessed it, it's %d!\n",number);
    }

    void inputValidation() {
        // Loop until a positive integer is entered
//        int number = ??;
//
//        while (/*sentinel*/) {
//            System.out.print("Enter a positive integer: ");
//
//            // if integer, take it, otherwise advance the input
//
//        }
//        System.out.println("Your number is " + number);
    }

    void countVowelMatches() {
        // loop over characters and count how many vowels there are
        String sentence = input.nextLine();
        int count = 0;

        System.out.printf("There are %d vowels\n",count);
    }

    boolean isVowel(char letter) {
        // return true if letter is a vowel
        boolean result = false;
        return result;
    }
}
