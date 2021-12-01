import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecture21 {

    /**
     * Read strings from terminal and convert to integer.
     * @return ArrayList of integers
     */
    ArrayList<Integer> parseDemo() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
//            String numString = input.next();
            String numString = input.nextLine();
            try {
                intList.add(Integer.parseInt(numString.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Sorry, " + numString + " is not a number, try again.");
                i--;
            }
        }

        return intList;
    }

    /**
     * Create a new class named "Counter"
     */
    void demoCounter() {
        Counter bikeCounter = new Counter();
        Counter carCounter = new Counter();
        Counter pedestrianCounter = new Counter();

        // Pretend someone is pressing a button on an app
        // start keeping track of clicks
        bikeCounter.count();
        bikeCounter.count();
        carCounter.count();
        pedestrianCounter.count();

        // try to access value directly
//        bikeCounter.value += 10;

        System.out.println("# of bikes: " + bikeCounter.getValue());
        System.out.println("# of cars: " + carCounter.getValue());
        System.out.println("# of pedestrians: " + pedestrianCounter.getValue());
    }

    /**
     * Illustrate what can happen with public instance variables.
     */
    void showPublicDanger() {
        PublicCounter bikeCounter = new PublicCounter();
        PublicCounter carCounter = new PublicCounter();
        PublicCounter pedestrianCounter = new PublicCounter();

        // Pretend someone is pressing a button on an app
        // start keeping track of clicks
        bikeCounter.count();
        bikeCounter.count();
        carCounter.count();
        pedestrianCounter.count();

        // We think we're adding 10, but actually only adding 2 characters
        System.out.println(bikeCounter.value);
        bikeCounter.value += 10;
        System.out.println(bikeCounter.value);
        // public instance vars are BAD

        System.out.println("# of bikes: " + bikeCounter.getValue());
        System.out.println("# of cars: " + carCounter.getValue());
        System.out.println("# of pedestrians: " + pedestrianCounter.getValue());
    }
}
