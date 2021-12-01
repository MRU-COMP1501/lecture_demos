/**
 * Implements a clicker counter class.
 */

public class Counter {
    private int value = 0;

    /**
     * Increase the count by one.
     */
    public void count() {
        value++;
//        int value = 0; // don't do this, even though it lets you
    }

    /**
     * Getter for the value instance variable.
     * @return the current value of the counter
     */
    public int getValue() {
        return value;
    }

    /**
     * Resets the counter to 0
     */
    public void reset() {
        value = 0;
    }
}
