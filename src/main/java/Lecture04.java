public class Lecture04 {
    void singleVsDouble() {
        // Floating point precision examples
        System.out.println(3.141592653589793);
        System.out.println(3.141592653589793f);
    }

    void mixingTypes() {
        // Demonstration of arithmetic with doubles vs integers
        int radius = 3;
        double pi = 3.14159;
        double circumference = 2 * pi * radius;
        System.out.print("Circumference: ");
        System.out.println(circumference);

        int triangleHeight = 5;
        double triangleWidth = 3.0;
        double triangleArea = triangleHeight * triangleWidth / 2;
        System.out.print("triangleArea: ");
        System.out.println(triangleArea);
    }

    void integerOverflow() {
        // Integer overflow example
        int fiftyMillion = 50_000_000;
        System.out.println(100 * fiftyMillion);
        // Expected output: 5_000_000_000;
    }

    void floatingPointExactness() {
        // Floating point math example
        double price = 4.35;
        int quantity = 100;
        System.out.println(quantity*price);
    }

    void mathLib() {
        // Demo of math library
        // always converts arguments to double and returns double
        int four = 4;

        System.out.print("Four squared: ");
        System.out.println(Math.pow(four,2));
    }
}
