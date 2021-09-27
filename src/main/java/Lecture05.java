import java.util.Scanner;

public class Lecture05 {
    public void unicodeExample() {
        // Print out a symbol from https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // Note: during class this resulted in an error, but it works on my system. Sometimes
        // different computers have different configurations and capabilities.
        char enclosed3 = '③';
        char recycle = '♻';
        System.out.println(enclosed3);
    }

    public void stringNumConcat() {
        // Build the date string and show length
        String today = "September " + 27;
        System.out.println(today);
        System.out.println(today.length());
    }

    public void subString() {
        // You can't spell awesome without me
        String awesome = "awesome";
        System.out.println("awesome".substring(
                "awesome".length()-2,"awesome".length()));
    }

    public void tabsAndNewlines() {
        // Item/price/unicorn
        String table = "Item\tPrice\nUnicorn\t$5\n";
        System.out.println(table);
    }

    public void tabsWithLongWords() {
        // Supercalifragilisticexpialidocious with a shorter word
        String table = "Item\t\t\t\t\t\t\tPrice\nUnicorn\t$5\n";
        table = table + "Supercalifragilisticexpialidocious\t$10";
        System.out.println(table);
    }

    public void printVsPrintln() {
        // Show what happens when you use print instead of println, then add newline
        System.out.println("Hello");
        System.out.println("World");
        System.out.print("Hello, \n");
        System.out.print("World!");
        System.out.println();
    }

    public void multipleFormattedOutputs() {
        // Print a mix of integers and doubles in printf
        System.out.printf("Today is September %d, I slept for %.1f hours last night\n", 27, 3.6578);
    }

    public void scientificNotation() {
        // print out the speed of light
        final double SPEED_OF_LIGHT = 2.9987e8;
        System.out.printf("The speed of light is %g\n",SPEED_OF_LIGHT);
        System.out.printf("But pi is %g\n",3.14159);
    }

    public void leftJustify() {
        // Left justify Supercalifragilisticexpialidocious and pad to 40 spaces
        System.out.printf("%-40sPrice\n%-40s$5\n%-40s$10",
                "Item","Unicorn","Supercalifragilisticexpialidocious");
    }

    public void inputDemo() {
        // create a scanner and read some stuff
        Scanner input = new Scanner(System.in);
        System.out.print("How many coffees would you like? ");
        int numCoffees = input.nextInt();
        System.out.printf("Are you sure you want %d coffees?\n",numCoffees);
    }
}
