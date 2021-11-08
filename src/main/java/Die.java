import java.util.ArrayDeque;
import java.util.Random;

public class Die {
    final int[] VALID_DICE = {4, 6, 8, 10, 12, 20};
    Random roller = new Random();
    int nSides;
    boolean rigged = false;
    ArrayDeque<Integer> riggedSequence = new ArrayDeque<>();

    // Constructor to create a die with any number of valid sides
    public Die(int nSides) {
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

        this.nSides = nSides;
    }

    // default constructor to create a D6
    public Die() {
        this(6);
    }

    // method to roll the die
    public int roll() throws ArrayIndexOutOfBoundsException {
        if (rigged) {
            if (riggedSequence.isEmpty()) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                return riggedSequence.pop();
            }
        } else {
            return roller.nextInt(nSides) + 1;
        }
    }

    public void setRiggedSequence(int[] sequence) {
        // method to rig the die
        riggedSequence.clear();

        // add the elements to the end of the stack
        for (int roll : sequence) {
            riggedSequence.addLast(roll);
        }
        rigged = true;
    }

    public void unRig() {
        riggedSequence.clear();
        rigged = false;
    }
}
