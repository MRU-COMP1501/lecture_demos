import java.util.Scanner;

public class Lecture06 {
    static final double EPSILON = 1e-14;
    public void elevatorExample() {
        // User inputs floor, calculate actual floor by skipping 13
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the floor: ");
        int floor = input.nextInt();
        int actualFloor = floor;

        if (floor > 13) {
            actualFloor--;
        }

//        if (floor > 13) {
//            actualFloor = floor - 1;
//        } else {
//            actualFloor = floor;
//        }
        System.out.printf("Floor %d is actually %d\n",floor,actualFloor);
    }

    public void braceDemo() {
        // Show what happens with different brace configurations
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the floor: ");
        int floor = input.nextInt();
        int actualFloor = floor;

        if (floor > 13)
            actualFloor--;

        System.out.printf("Floor %d is actually %d\n",floor,actualFloor);
    }

    public void semicolonDemo() {
        // Show what happens with semicolons
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the floor: ");
        int floor = input.nextInt();
        int actualFloor = floor;

        if (floor > 13);
            actualFloor--;

        System.out.printf("Floor %d is actually %d\n",floor,actualFloor);
    }

    public void variableScope() {
        // Demonstrate variables in and out of scope
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the floor: ");
        int floor = input.nextInt();

        if (floor > 13) {
            int actualFloor = floor - 1;
            System.out.println(actualFloor);
        }

        System.out.printf("Floor %d is actually \n",floor);
    }

    public void floatingComparison() {
        // Demonstrate floating point comparison sum of 5.6 and 5.8
        double sum = 5.6 + 5.8;
        if (sum == 11.4) {
            System.out.println("Huzzah!");
        } else {
            System.out.println("Actually, sum is " + sum);
        }

        if (Math.abs(sum - 11.4) < EPSILON) {
            System.out.println("Huzzah!");
        } else {
            System.out.println("Actually, sum is " + sum);
        }
    }

    public void operatorPrecedence() {
        // Show arithmetic vs comparisons
        int floor = 14;
        System.out.println(13 < floor - 1);
        System.out.println(13 < floor--);
        System.out.println(floor);
        floor = 14;
        System.out.println(13 < --floor);
        System.out.println(floor);
    }

    public void stringEquality() {
        // Show equals vs == for strings with string concat
        String bob = "bob";
        System.out.println(bob == "bob");
        bob += "cat";
        System.out.println(bob == "bobcat");
        System.out.println(bob.equals("bobcat"));
    }

    public void stringComparison() {
        // Show what happens with the compareTo() method
        System.out.println("bob".compareTo("cat")); // negative
        System.out.println("bob".compareTo("Cat")); // positive
        System.out.println("bob".compareToIgnoreCase("Cat")); // negative
        System.out.println("42".compareTo("cat")); // negative
    }

    public void bookstoreExample() {
        // 8% discount if the price is less than $128,
        // 16% discount if the price is at least $128
        final double SMALL_DISCOUNT = 0.08;
        final double BIG_DISCOUNT = 0.16;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the price? ");
        double price = input.nextDouble();

        if (price > 128) {
            price = price * (1 - BIG_DISCOUNT);
        } else {
            price = price * (1 - SMALL_DISCOUNT);
        }

        System.out.printf("The discounted price is $%.2f\n",price);

        // alternative solution
        double discount = SMALL_DISCOUNT;
        if (price > 128) {
            discount = BIG_DISCOUNT;
        }
        price = price * (1 - discount);
        System.out.printf("The discounted price is $%.2f\n",price);

    }
}
