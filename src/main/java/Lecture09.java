import java.util.Scanner;

public class Lecture09 {
    Scanner input = new Scanner(System.in);
    public void inputValidation() {
        // elevator needs integer
        System.out.print("Enter the floor number: ");

        if (input.hasNextInt()) {
            int floor = input.nextInt();
        } else {
            System.out.println("That's not a number");
        }
    }

    public void inputValidationNumbers() {
        // integer, positive, not 13, below max
    }

    public void inputValidationLoop() {
        // while !hasNextDouble
        System.out.print("Enter a string: ");

//        while (input.hasNext()) {
//            String result = input.nextLine();
//            System.out.print("Line: " + result);
//        }

        String optionA = input.next();
        while (!optionA.equals("s") && !optionA.equals("t")){
            System.out.print("try again: ");
            optionA = input.nextLine();
        }

    }

    public void infiniteLoop() {
        // with counter
        int counter = 0;
        while (true) {
            counter++;
            System.out.println(counter);
        }
    }

    public void whileExample() {
        // compound interest
        double accountBalance = 1000.0;
        int years = 0;
        while (accountBalance < 2000) {
            double interest = accountBalance * 0.05;
            accountBalance += interest;
            years++;
        }

        System.out.println("You doubled your money in " + years + " years");
    }

    public void changingCondition() {
        // copy compound interest, accountBalance * 2
        double accountBalance = 1000.0;
        int years = 0;
        while (accountBalance < accountBalance * 2) {
            double interest = accountBalance * 0.05;
            accountBalance += interest;
            years++;
        }

        System.out.println("You doubled your money in " + years + " years");
        System.out.println("Final balance: " + accountBalance);
    }

    public void forLoopOddities() {
        // weird stuff
    }

    public void forLoopCounter() {
        // modify counter in loop
    }
}

/**
 * Sample code from lab 04. Note that the following code is not intended
 * to be run, it is just shown here for demonstration purposes.
 */
class BypassTheCleaning {
    void checkFreeDelivery_1() {
        final double FREE_DELIVERY_THRESHOLD = 40.0;
        // get the user input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your order total: ");
        double total = keyboard.nextDouble();
//        Check if in free delivery range
        if (total >= 40) {
            System.out.println("You get free delivery!");
            } else {
            double diff = 40 - total;
            System.out.println("Add $" + diff + " to your order to get free delivery");
        }
    }

    void checkFreeDelivery_2() {
        final double FREE_DELIVERY_THRESHOLD = 40.0;
        Scanner order = new Scanner(System.in);
        System.out.print("Please enter dollar amount for current order: ");

        double amount = order.nextDouble();
        double underFree = FREE_DELIVERY_THRESHOLD - amount;

        if (underFree == 0) {
            System.out.println("You get free delivery!");
        }
        if (underFree <= 0) {
            System.out.println("You get free delivery!");
        } else if (underFree > 0) {
            System.out.printf("Add $%.2f to your order to get free delivery", underFree);
        }
    }

    void checkFreeDelivery_3() {
    //Reads input value as order cost,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dollar amount of current order");
        double orderCost = scanner.nextDouble();
        if (orderCost < 40.00) {
            System.out.println("Add $" + (40.00 - orderCost) + " to your order to get free delivery");}
        else if  (orderCost >= 40) {System.out.println("You get free delivery!");}
        else System.out.println("Try that again");
    }
}