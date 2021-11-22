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
                mines[row][col] = Math.random() < percentMines;
                if (mines[row][col]) {
                    System.out.printf("Mine at (%d,%d)\n",row,col);
                }
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

        int first = 'c' - 'a'; // map letter c to index position
        int last = 'd' - 'a';

        String superHeroName = supers[first][0] + " " + supers[last][1];
//        System.out.println("My superhero name is " + superHeroName);

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
        for (int i = 0; i < 5; i++) {
            names.add(supers[d4.roll()][0] + " " + supers[d4.roll()][1]);
        }

        System.out.println(names);
        names.add(1,"INTERRUPTION");
        names.add(5,"INTERRUPTION");
        System.out.println(names);
        names.remove("INTERRUPTION");
        System.out.println(names);
        names.remove(4);
//        names.add(20,"INTERRUPTION");
        supers[0][0] = "fred";
        names.set(0, "fred");

        System.out.printf("There are %d elements in names\n",names.size());
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

//        ArrayList<String> food = breakfast; // creates new pointer to same dat
        ArrayList<String> food = new ArrayList<String>(breakfast);
//        food.set(0,"Pancakes");
        System.out.println(breakfast);
        System.out.println(food);

        System.out.println(food == breakfast);
        System.out.println(food.equals(breakfast));
        ArrayList<ArrayList<String>> nestedList = new ArrayList<ArrayList<String>>();

    }

    /**
     * Show how boxing/unboxing works
     */
    void demoAutoBox() {
    }
}
