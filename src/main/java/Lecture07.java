import java.util.Scanner;

public class Lecture07 {
    Scanner input = new Scanner(System.in);
    public void caffeineDemo() {
        // 0-50, 50-100,100-200,200+
        System.out.print("How much caffeine is in your system? :");
        double caffeine = input.nextDouble();

        if (caffeine < 50) {
            System.out.println("Need more coffee");
        } else if (caffeine < 100) {
            System.out.println("Good start");
        } else if (caffeine < 200) {
            System.out.println("Ahh, perfect");
        } else {
            System.out.println("TOO MUCH COFFEE");
        }
    }

    public void caffeineWithoutElse() {
        System.out.print("How much caffeine is in your system? :");
        double caffeine = input.nextDouble();

        if (caffeine < 50) {
            System.out.println("Need more coffee");
        } if (caffeine < 100) {
            System.out.println("Good start");
        } if (caffeine < 200) {
            System.out.println("Ahh, perfect");
        } {
            System.out.println("TOO MUCH COFFEE");
        }
    }

    public void caffeineSwitch() {
        // caffeine example with switch syntax
        System.out.print("How many coffees? ");
        int coffees = input.nextInt();

        switch(coffees) {
            case 0: System.out.println("Not enough"); break;
            case 1: System.out.println("Good start"); break;
            case 2: System.out.println("Perfect!"); break;
            default: System.out.println("TOO MUCH!");
        }
    }

    public void switchOddities() {
        // demo without break or statement
        System.out.print("How many coffees? ");
        int coffees = input.nextInt();

        switch(coffees) {
            case 0: System.out.println("Not enough"); break;
            case 1:
                System.out.println("Good start");
                System.out.println("Could use more");
                int whee = 1;
                switch (whee) {
                    case 2: System.out.println("Whee is 2"); break;
                    default: System.out.println("Not 2");
                }
            case 2: System.out.println("Perfect!"); break;
            default: System.out.println("TOO MUCH!");
        }
    }

    public void nestedIf() {
        // Drink order
        String drink = "ginger ale";

        if (drink.equals("alcohol")) {
            // ask for ID...
            double age = 17;
            if (age >= 18) {
                System.out.println("Here's your booze");
            } else {
                System.out.println("Sorry, you need to be 18 in Alberta");
            }
        } else {
            System.out.println("Here's your pop");
        }

    }

    public void danglingIf() {
        // Drink order again
        System.out.print("What is your drink order? ");
        String drink = input.nextLine();
        System.out.print("What is your age? ");
        double age = input.nextDouble();

        if (drink.equals("alcohol"))
            if (age >= 18)
                System.out.println("Here's your booze");
            else
                System.out.println("Here's your pop");

    }
}
