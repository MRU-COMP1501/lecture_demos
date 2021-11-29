import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecture20 {
    /**
     * Read a file and print out the contents using FileHandler class
     * @param inFile filename to read
     */
    void demoFileHandler(String inFile) {
    }

    /**
     * Demo Scanner.next()
     * @param inFile filename to read
     */
    void consumesWhitespace(String inFile) throws FileNotFoundException {
        File fHandle = new File(inFile);
        Scanner fInput = new Scanner(fHandle);

        // .next
    }

    /**
     * Read a CSV file using a Scanner
     * @param inFile file to read
     * @return ArrayList of strings in the file
     * @throws FileNotFoundException
     */
    ArrayList<String> readCSV(String inFile) throws FileNotFoundException {
        File fHandle = new File(inFile);
        Scanner fInput = new Scanner(fHandle);
        ArrayList<String> fileContents = new ArrayList<String>();

        // setup scanner to read csv with [,\n]

        return fileContents;
    }

    /**
     * Prints the first N ArrayLists in a 2D arrayList
     * @param twoDArrayList 2D ArrayList to print
     * @param N number to print
     */
    void printFirstN(ArrayList<ArrayList<String>> twoDArrayList, int N) {
        // print out the first five rows
        for (int i = 0; i < N; i++) {
            System.out.println(twoDArrayList.get(i));
        }
    }

    /**
     * Reads a CSV and returns a 2D ArrayList of contents
     * @param inFile File to read
     * @return Arraylist containing ArrayList of rows
     */
    ArrayList<ArrayList<String>> readCSVBetter(String inFile) throws FileNotFoundException {
        File fHandle = new File(inFile);
        Scanner fInput = new Scanner(fHandle);
        ArrayList<ArrayList<String>> fileContents = new ArrayList<ArrayList<String>>();

        // Loop over fInput, then lineScanner
        while (fInput.hasNextLine()) {
            String line = fInput.nextLine();
            // Scanner for each line, create new arraylist, add each token
            // add to fileContents
        }
        fInput.close();

        return fileContents;
    }

    /**
     * Prints out the occupancy for Calgary shelter data
     * @param data 2D ArrayList of shelter data
     */
    void printAverageOccupancy(ArrayList<ArrayList<String>> data) {
        final int CAPACITY_IDX = 8;
        final int OVERNIGHT_IDX = 9;

        // loop through the rows and add calculate the occupancy as percent capacity
        for (int row = 1; row < data.size(); row++) {
//                int capacity = ?;
//                int overnight = ?;
//                System.out.printf("Occupied overnight: %d of %d\n", overnight, capacity);
        }
    }
}
