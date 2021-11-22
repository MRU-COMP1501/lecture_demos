import java.util.Arrays;

public class Lecture17 {
    /**
     * Demonstrate array of dice.
     */
    void arrayOfObjects() {
        Die[] dice = new Die[4];

        for (int i = 0; i < 4; i++) {
            dice[i] = new Die();
        }

        for (Die d : dice) {
            System.out.println(d.roll());
        }
    }

    /**
     * Demonstrate filling the alphabet.
     */
    void fillArray() {
        char[] alphabet = new char[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)(i + 'a');
        }

        System.out.println(Arrays.toString(alphabet));
    }

    /**
     * Demonstrate summing and averaging
     */
    void sumAndAvg() {
        double sum = 0;
        double[] values = {5.0, 6.0, 7.0};
        for (double val : values) {
            sum += val; // add the value to the sum
        }
        System.out.printf("Average: %.1f\n", sum / values.length);
    }

    /**
     * Find the minimum value and print it out
     */
    void findMin() {
        double[] values = {5.0, 6.0, 4.0, 7.0};
        double lowest = values[0];
        for (double val : values) {
            if (val < lowest) {
                lowest = val;
            }
        }
        System.out.printf("The lowest value is %.1f\n",lowest);
    }

    /**
     * Look for the index of a specific value in an array
     */
    void findValue() {
        int[] values = {4, 7, 8, 4, 21, 5, 34, 6, 84};
        int searchVal = 21;
        int pos = -1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == searchVal) {
                pos = i;
                break;
            }
        }
        System.out.printf("Found %d at position %d\n",searchVal,pos);

        boolean found = false;
        for (int val : values) {
            if (val == searchVal) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.printf("Found %d\n", searchVal);
        }
    }

    /**
     * Demonstrate removing elements from a partially filled array
     */
    void removeElements() {
        int[] values = new int[10];
        int size = 10;
        Die d6 = new Die();

        for (int i = 0; i < size; i++) {
            values[i] = d6.roll();
        }
        System.out.println(Arrays.toString(values));

        int remove = 2;
        size--;
        for (int i = remove; i < size; i++) {
            values[i] = values[i + 1];
        }
        values[values.length - 1] = 0;
        System.out.println(Arrays.toString(values));
    }

    /**
     * Adding an element in specific order.
     */
    void addElementInOrder() {
        int[] values = {1,2,3,5,6};

        // add a 4 in the 4th position
        values = Arrays.copyOf(values, values.length + 1);
        int addIndex = 3;

        System.out.println(Arrays.toString(values));

        for (int i = values.length - 1; i > addIndex; i--) {
            values[i] = values[i - 1];
        }

        System.out.println(Arrays.toString(values));

        values[addIndex] = 4;
        System.out.println(Arrays.toString(values));
    }

    /**
     * Create a char array containing all the letters of the english alphabet.
     * @return alphabet
     */
    char[] getAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)('a' + i);
        }
        return alphabet;
    }
}
