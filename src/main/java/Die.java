import java.util.ArrayDeque;
import java.util.Random;

/**
 * Implements a pseudorandom number generator.
 * Has a fixed number of sides, generates a uniformly distributed integer.
 */

public class Die {
    private static final int[] VALID_DICE = {4, 6, 8, 10, 12, 20};
    private final Random roller = new Random();
    private final int N_SIDES;
    private boolean rigged = false;
    private final ArrayDeque<Integer> riggedSequence = new ArrayDeque<>();
    private int lastRolled;
    /**
     * Constructor to take a specific number of sides.
     * @param nSides in VALID_DICE.
     * @throws IllegalArgumentException if nSides is invalid
     */
    public Die(int nSides) throws IllegalArgumentException {
        // Loop through the list of valid dice and make sure nSides is in there
        boolean valid = false;
        for (int side : VALID_DICE) {
            if (nSides == side) {
                valid = true;
                break;
            }
        }

        // if we didn't set valid to true, throw an exception
        if (!valid)
            throw new IllegalArgumentException("Invalid number of sides");

        N_SIDES = nSides;
    }

    // default constructor to create a D6
    public Die() {
        N_SIDES = 6;
    }

    /**
     * method to roll the die
     * @return die roll
     * @throws ArrayIndexOutOfBoundsException if dice are rigged and the sequence is empty
     */
    public int roll() throws ArrayIndexOutOfBoundsException {
        if (rigged) {
            if (riggedSequence.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                lastRolled = riggedSequence.pop();
            }
        } else {
            lastRolled = roller.nextInt(N_SIDES) + 1;
        }
        return lastRolled;
    }

    /**
     * Sets a predictable sequence of die rolls
     * @param sequence array of integers
     */
    public void setRiggedSequence(int[] sequence) {
        // method to rig the die
        riggedSequence.clear();

        // add the elements to the end of the stack
        for (int roll : sequence) {
            riggedSequence.addLast(roll);
        }
        rigged = true;
    }

    /**
     * Method to undo the rigging.
     */
    public void unRig() {
        riggedSequence.clear();
        rigged = false;
    }

    public String toString() {
        return String.format("A die with %d sides\nLast rolled: %d", N_SIDES, lastRolled);
    }
}
