import java.util.Arrays;

public class Lecture17 {
    /**
     * Demonstrate array of dice.
     */
    void arrayOfObjects() {
    }

    /**
     * Demonstrate filling the alphabet.
     */
    void fillArray() {
        char[] alphabet = new char[26];
        System.out.println(Arrays.toString(alphabet));

        // for 0 to < 26...
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
    }

    /**
     * Find the minimum value and print it out
     */
    void findMin() {
        double[] values = {5.0, 6.0, 7.0};
        double lowest = 0.0;
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
        int pos =  0;

        // loop and break when found

        System.out.printf("Found %d at position %d\n",searchVal,pos);
    }

    /**
     * Demonstrate removing elements from a partially filled array
     */
    void removeElements() {
        int[] values = new int[100];
        int size = 10;
        Die d6 = new Die();

        for (int i = 0; i < size; i++) {
            values[i] = d6.roll();
        }
        System.out.println(Arrays.toString(values));

        int remove = 2;
        size--;

        // loop and shift
    }

    /**
     * Adding an element in specific order.
     */
    void addElementInOrder() {
        int[] values = {1,2,3,5,6};

        // add a 4 in the 4th position
        values = Arrays.copyOf(values, values.length + 1);
        int addIndex = 3;

        // loop and shift

        values[addIndex] = 4;
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

    /**
     * Shifts each character in the input array by the specified shift value.
     * @param alphabet input alphabet
     * @param shift amount to shift by
     * @return shifted alphabet
     */
    char[] shiftAlphabet(char[] alphabet, int shift) {
        char[] shifted = alphabet;
        for (int i = 0; i < alphabet.length; i++) {
            int letterNum = (alphabet[i] + shift);
            shifted[i] = (char)(letterNum);
        }
        return shifted;
    }
}
