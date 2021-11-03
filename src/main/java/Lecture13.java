import java.util.Locale;
import java.util.Scanner;

public class Lecture13 {
    Scanner input = new Scanner(System.in);

    /**
     * Main method called from the LectureDemos class
     */
    void mainEntryMethod() {
        System.out.println("Welcome to the demo!");

        // prompt the user to enter a string, then do some manipulation on it
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        int numCapitalLetters = numCapitals(inputString);
        System.out.print("Original String: " + inputString + "\n");
        System.out.printf("There are %d capital letters\n",numCapitalLetters);

        String doubled = repeatStringTwice(inputString);
        System.out.println(doubled);

        System.out.println(nCopies(inputString,4));
    }

    /**
     * Counts the capital letters in str
     * @param str input string
     * @return number of capital letters
     */
    int numCapitals(String str) {
        int count = 0;
        str = str.replace(' ','a');
        for (int i = 0; i < str.length(); i++){
            String letter = str.substring(i,i+1);
            if (letter.equals(letter.toUpperCase()))
                count++;
        }
        System.out.print("String inside method: " + str + "\n");
        return count;
    }

    /**
     * returns a new string consisting of two copies of the old string
     * @param str input string
     * @return two copies of str
     */
    String repeatStringTwice(String strung) {
        return nCopies(strung,2);
    }

    /**
     * returns a new string consisting of N copies of the old string
     * @param str input string
     * @param N integer number of copies
     * @return str repeated N times
     */
    String nCopies(String str, int N) {
        String copied = "";
        for (int i = 0; i < N; i++) {
            copied += str + " ";
        }
        return copied;
    }
}
