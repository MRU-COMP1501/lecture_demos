import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Lecture18 {
    /**
     * Creates an empty 2D array of integers
     * @param nRows number of rows
     * @param nCols number of columns
     */
    void makeMinesweeperBoard(int nRows, int nCols, double percentMines) {
        boolean[][] mines = new boolean[nRows][nCols];

        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < nCols; col++) {
                // Randomly assign a mine to true/false
                mines[row][col] = Math.random() < percentMines;
            }
        }
        printMinesweeperBoard(mines);
    }

    /**
     * Method to print out minesweeper board with empty squares or xs for bombs.
     * @param mines board of mine locations
     */
    void printMinesweeperBoard(boolean[][] mines) {
        for (int row = 0; row < mines.length; row++) {
            for (int col = 0; col < mines[row].length; col++) {
                if (mines[row][col]) {
                    System.out.print("|x");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }

        // replace with enhanced for loop
    }


    /**
     * Example of initializing with values
     */
    String[][] makeFixed2Darray() {
        String[][] supers = {
                {"Amazing","Fox"},
                {"Omega", "Zombie"},
                {"Magnificent","Beast"},
                {"Captain","Master"},
                {"Doctor","Machine"}
                // add some more
        };

        // find a superhero name

        return supers;
    }

    /**
     * Do stuff with ArrayList
     */
    void demoArrayList() {
        // make an arraylist and add
        ArrayList<String> names = new ArrayList<String>();
        String[][] supers = makeFixed2Darray();
        names.add("Amazing Machine");
        names.add("Magnificent Master");

        Die d4 = new Die(4);
        names.add(supers[d4.roll()][0] + " " + supers[d4.roll()][1]);

        // print out
        // insert with add(index,element)
        // remove with name, index
        // get/set
        // size
    }

    /**
     * Show how arraylist copying works
     */
    void arrayListCopy() {
        ArrayList<String> breakfast = new ArrayList<String>();
        breakfast.add("Hashbrowns");
        breakfast.add("Eggs");
        breakfast.add("Bacon");
        breakfast.add("Waffles");
        breakfast.add("Maple syrup");
        breakfast.add("Coffee");

        // do some copying and equality checking
    }

    /**
     * Show how boxing/unboxing works
     */
    void demoAutoBox() {
    }
}
