public class Lecture22 {

    private int numAttendees;
    public String name; // public bad

    public Lecture22() {
        numAttendees = 10;
        name = "Classes and stuff";
    }

//    Can't have two constructors that both take one integer'
//    public Lecture22(int anotherInt) {
//        name = "Classes and stuff";
//    }


    public Lecture22(int numAttendees) {
        this.numAttendees = numAttendees;
        name = "Classes and stuff";
    }

    public void setNumAttendees(int num) {
        if (num < 0) {
            System.out.println("Invalid number");
            return;
        }
        numAttendees = num;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    /**
     * Demonstrate the printString method
     */
    public void printDie() {
        Die d6 = new Die(6);
        System.out.println(d6);
    }
}
