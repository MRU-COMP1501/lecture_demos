import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial11 {
    int getNumIncreasingFromFile(String filename) throws FileNotFoundException {
        File inFile = new File(filename);
        Scanner fScan = new Scanner(inFile);

        // read the first line into an integer and consume the newline
        int prev = fScan.nextInt();
        fScan.nextLine();

        int nIncreasing = 0;

        while (fScan.hasNext()) {
            // read the current entry in the file, consume newline
            int current = fScan.nextInt();
            fScan.nextLine();

            // compare to previous
            if (current > prev) {
                nIncreasing++;
            }
            // update previous
            prev = current;
        }

        return nIncreasing;
    }

    ArrayList<Integer> readFileToList(String filename) throws FileNotFoundException {
        File inFile = new File(filename);
        Scanner fScan = new Scanner(inFile);
        ArrayList<Integer> depths = new ArrayList<Integer>();

        while (fScan.hasNext()) {
            // read the current entry in the file, consume newline
            int current = fScan.nextInt();
            fScan.nextLine();

            // add to the array
            depths.add(current);
        }

        return depths;
    }

    int calcIncreasingDepths(ArrayList<Integer> depths) {
        int nIncreasing = 0;

        // start looping at 1 so we can compare to previous
        for (int i = 1; i < depths.size(); i++) {
            if (depths.get(i) > depths.get(i - 1)) {
                nIncreasing++;
            }
        }

        return nIncreasing;
    }
}
