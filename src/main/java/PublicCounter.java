/**
 * Implements a (bad) public clicker counter class.
 */

public class PublicCounter {
    public String value = "";

    /**
     * Increase the count by one.
     */
    public void count() {
        value += "|";
    }

    /**
     * Getter for the value instance variable.
     * @return the current value of the counter
     */
    public int getValue() {
        return value.length();
    }

    /**
     * Resets the counter to 0
     */
    public void reset() {
        value = "";
    }
}
