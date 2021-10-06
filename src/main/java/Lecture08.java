import java.util.Scanner;

public class Lecture08 {
    enum Emotions {HAPPY, SAD, CONFUSED, SCARED};
    public void assignmentDemo() {
        // repeat, variable format
        String repeated = "*** ".repeat(5);
        System.out.println(repeated);

        System.out.printf("%40s\n","Hello");
        int width = 40;
        System.out.printf("%" + width + "s\n","Hello");

        String output = String.format("%" + width + "s\n","Hello");
        System.out.print(output);
    }

    public void enumClassExample() {
        // Happy in enum
        enum LocalEmotions {HAPPY, SAD, CONFUSED, SCARED};
        LocalEmotions myFeeling = LocalEmotions.HAPPY;

        Scanner input = new Scanner(System.in);
        System.out.print("How are you feeling? ");
        myFeeling = LocalEmotions.valueOf(input.nextLine());

        if (myFeeling == LocalEmotions.HAPPY) {
            System.out.println("Clap your hands");
        }

        // if (myFeeling > Emotions.SAD) // Error
        switch (myFeeling) {
            case HAPPY: System.out.println("Clap your hands"); break;
            case SAD: System.out.println("That's too bad"); break;
        }
    }

    public void enumScopeExample() {
        // also Happy, but change scope
        Emotions myFeeling = Emotions.HAPPY;

        Scanner input = new Scanner(System.in);
        System.out.print("How are you feeling? ");
        myFeeling = Emotions.valueOf(input.nextLine());

        if (myFeeling == Emotions.HAPPY) {
            System.out.println("Clap your hands");
        }

        // if (myFeeling > Emotions.SAD) // Error
        switch (myFeeling) {
            case HAPPY: System.out.println("Clap your hands"); break;
            case SAD: System.out.println("That's too bad"); break;
        }
    }

    public void booleanExample() {
        // you know it as bool
        boolean happy = true;
        boolean knowIt = true;

        if (happy) {
            if (knowIt) {
                System.out.println("Clap your hands!");
            }
        }
    }

    public void andExample() {
        // happy and you know it
        boolean happy = true;
        boolean knowIt = true;

        Emotions myFeeling = Emotions.HAPPY;

        if (myFeeling == Emotions.HAPPY && knowIt) {
                System.out.println("Clap your hands!");
        }
    }

    public void precedenceExample() {
        // water boiling at 0 in Van or 96.2 in Calgary
        double temp = 98; // celsius
        String city = "Vancouver";

        if ((temp > 100 && city.equals("Vancouver")) ||
                (temp > 96.2 && city.equals("Calgary"))) {
            System.out.println("Water is boiling");
        } else {
            System.out.println("Water is not boiling yet");
        }
    }

    public void shortCircuit() {
        // quantity and price integer
        int quantity = 0;
        int price = 5;

        if (quantity == 0 || price / quantity > 5) {
            System.out.println("if condition is true!");
        }
    }

    public void deMorganSimplify() {
        // no pets allowed except cats
//        !(A && B) is the same as !A || !B
//        !(A || B) is the same as !A && !B

        String pet = "cat";
        double weight = 20; //lbs
        if (!pet.equals("none") && !pet.equals("cat") &&
            !(pet.equals("dog") && weight < 15)) {
            System.out.println("Sorry, no pets allowed");
        } else {
            System.out.println("That's allowed");
        }

        // A = pet.equals("none"); B = pet.equals("cat")
        if (!(pet.equals("none") || pet.equals("cat"))  &&
                !(pet.equals("dog") && weight < 15)) {
            System.out.println("Sorry, no pets allowed");
        } else {
            System.out.println("That's allowed");
        }
    }

    public void inputValidation() {
        // elevator
    }
}
