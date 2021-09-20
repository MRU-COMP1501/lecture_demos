public class Lecture04 {
    void run() {
        // Integer overflow example
        int fiftyMillion = 50_000_000;
        System.out.print("100 * 50,000,000 = ");
        System.out.println(100 * fiftyMillion);
        // Expected output: 5_000_000_000;

        long longFiftyMillion = 50_000_000;
        System.out.print("100 * longFiftyMillion: ");
        System.out.println(100 * longFiftyMillion);

        // Floating point precision examples
        System.out.print("Double precision pi: ");
        System.out.println(Math.PI);
        System.out.print("Single precision pi: ");
        System.out.println((float)Math.PI);

        // Floating point math example
        double price = 4.35;
        int quantity = 100;
        System.out.print("100 units at 4.35 each: ");
        System.out.println(quantity*price);
    }
}
