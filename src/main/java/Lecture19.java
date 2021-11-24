import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture19 {
    /**
     * Show how boxing/unboxing works
     */
    void demoAutoBox() {
        int x = 5;
        Integer y = x;
        System.out.printf("The Integer is %d\n", y);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        Double number = 4.5;
    }

    /**
     * Show how 2D array syntax is cleaner than 2D ArrayList
     */
    void demo2D() {
        final int ROWS = 10;
        final int COLS = 8;

        // Demo to show 2D array simpler than Arraylist
        int[][] minesweeperGrid = new int[ROWS][COLS];
        minesweeperGrid[4][7] = 1;

        System.out.println("Array: ");
        for (int row = 0; row < ROWS; row++) {
            System.out.println(Arrays.toString(minesweeperGrid[row]));
        }

        // equivalent with ArrayList
        ArrayList<ArrayList<Integer>> arraylistGrid = new ArrayList<ArrayList<Integer>>();

        // initialize with 10x8 grid of zeros...
        for (int row = 0; row < ROWS; row++) {
            arraylistGrid.add(new ArrayList<Integer>());
            for (int col = 0; col < COLS; col++) {
                arraylistGrid.get(row).add(0);
            }
        }

        // finally, set element [4][7] to 1
        arraylistGrid.get(4).set(7,1);

        System.out.println("\n\nArrayList: ");
        for (int row = 0; row < ROWS; row++) {
            System.out.println(arraylistGrid.get(row));
        }
    }

    /**
     * Scan a text file using Scanner
     */
    void scanTextFile(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner fInput = new Scanner(inputFile);

        while (fInput.hasNextInt()) {
            int num = fInput.nextInt();
            System.out.println(num);
        }

        fInput.close();
    }

    /**
     * Scan with while hasnextline
     */
    void scanAllLines(String filename) throws FileNotFoundException {
        // Waits forever
//        Scanner input = new Scanner(System.in);
//
//        while (input.hasNextLine()) {
//            String line = input.nextLine();
//            System.out.println("Your line is: " + line);
//        }
        File inputFile = new File(filename);
        Scanner fInput = new Scanner(inputFile);
        int lineNo = 0;
        ArrayList<String> fileContents = new ArrayList<String>();

        while (fInput.hasNextLine()) {
            String line = fInput.nextLine();
//            System.out.printf("File line %d: %s\n", lineNo++, line);
            fileContents.add(line);
        }

        System.out.print(fileContents);

        fInput.close();
    }

    /**
     * Convert file to all caps
     */
    void convertToAllCaps(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner fInput = new Scanner(inputFile);
        String outFileName = "allcaps_" + filename;
        PrintWriter fOutput = new PrintWriter(outFileName);

        while (fInput.hasNextLine()) {
            String line = fInput.nextLine();
            line = line.toUpperCase();
            fOutput.println(line);
        }

        fInput.close();
        fOutput.close();

        System.out.println("Successfully written to " + outFileName);
    }

    /**
     * Demonstrate scanning a web page
     */
    void scanURL() throws IOException {
        URL webPage = new URL("https://mru-comp1501.github.io/f21");
        Scanner urlScanner = new Scanner(webPage.openStream());

        while (urlScanner.hasNextLine()) {
            System.out.println(urlScanner.nextLine());
        }
        urlScanner.close();
    }
}
