import java.util.Scanner;

public class Lecture10 {
    Scanner input = new Scanner(System.in);

    public void forLoopOddities() {
        // weird stuff
        double sum = 25.0;
        boolean flag = false;
        for (Scanner keyboard = new Scanner(System.in); sum < 60; flag = true) {
            System.out.println("this makes no sense");
            sum = 60;
        }

        for (; ; ) {
            System.out.println("Infinite loop!");
        }
    }

    public void forLoopCounter() {
        // modify counter in loop
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                i++;
            }
            System.out.println("i is: " + i);
        }

        for (int i = 1; i <= 5; i = i + 2) {
            System.out.println("i is: " + i);
        }
    }

    public void breakContinue() {
        // show what happens with break and continue
        for (int i = 0; i < 20; i++ ) {
            if (i == 10) {
                continue;
            }
            if (i == 15) {
                break;
            }
            System.out.println("i is " + i);
        }
    }

    public void doWhile() {
        // input validation example
//        int number;
//        do {
//            number = input.nextInt();
//        } while (input.hasNextInt());
//
//        System.out.print(number);

        int anotherNumber = 0;
        do {
            System.out.println("Another number is: " + anotherNumber);
            anotherNumber += 100;
        } while (anotherNumber > 10);

        anotherNumber = 100;
        while (anotherNumber > 10) {
            System.out.println("Another number is: " + anotherNumber);
            anotherNumber += 100;
        }
    }

//    (x > 0 || x < 10) && x == 5
}
