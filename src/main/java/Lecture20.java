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
        String fileContents = FileHandler.readFile(inFile);

        if (fileContents.equals("")) { // or fileContents.isEmpty()
            System.out.println(inFile + " not found");
        } else {
            System.out.println("File contents: ");
            System.out.println(fileContents);

            boolean success = FileHandler.writeFile("NewFile.txt", fileContents);
            if (success) {
                System.out.println("Writing successful.");
            }
        }

    }

    /**
     * Demo Scanner.next()
     * @param inFile filename to read
     */
    void consumesWhitespace(String inFile) throws FileNotFoundException {
        File fHandle = new File(inFile);
        Scanner fInput = new Scanner(fHandle);
        ArrayList<String> tokens = new ArrayList<String>();

        while (fInput.hasNext()) {
            tokens.add(fInput.next());
        }
        fInput.close();

        System.out.println(tokens);

    }

    /**
     * Demo Scanner with hasNextInt() and nextInt()
     * @param inFile filename to read
     */
    void calculateAverage(String inFile) throws FileNotFoundException {
        File fHandle = new File(inFile);
        Scanner fInput = new Scanner(fHandle);
        int sum = 0;
        int counter = 0;

        while(fInput.hasNext()) {
            if (fInput.hasNextInt()) {
                sum += fInput.nextInt();
                counter++;
            } else {
                String token = fInput.next();
            }
        }

        fInput.close();
        System.out.printf("The average of all the integers is %d\n",sum / counter);
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
        fInput.useDelimiter("[,\r\n]");

        while (fInput.hasNext()) {
            fileContents.add(fInput.next());
        }

        return fileContents;
    }

    /**
     * Prints the first N ArrayLists in a 2D arrayList
     * @param twoDArrayList 2D ArrayList to print
     * @param N number to print
     */
    void printFirstN(ArrayList<ArrayList<String>> twoDArrayList, int N) {
        // print out the first N rows
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
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            ArrayList<String> row = new ArrayList<String>();
            while (lineScanner.hasNext()) {
                String token = lineScanner.next();
                row.add(token);
            }
            fileContents.add(row);
        }
        fInput.close();

        return fileContents;
    }

    boolean isInAlphabet(char ch) {
//        Character.isLetter(ch); includes non-Latin letters
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }
}
