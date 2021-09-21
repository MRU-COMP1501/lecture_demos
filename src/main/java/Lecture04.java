public class Lecture04 {
    void integerOverflow() {
        // Integer overflow example
        int fiftyMillion = 50_000_000;
        System.out.println(100 * fiftyMillion);
        // Expected output: 5_000_000_000;
    }

    void singleVsDouble() {
        // Floating point precision examples
        System.out.println(3.141592653589793);
        System.out.println(3.141592653589793f);
    }

    void floatingPointExactness() {
        // Floating point math example
        double price = 4.35;
        int quantity = 100;
        System.out.println(quantity*price);
    }
}
