import java.io.FileNotFoundException;
import java.io.IOException;

public class LectureDemos {
    static public void main(String[] args) throws IOException {
        Lecture04 l04 = new Lecture04();
        Lecture05 l05 = new Lecture05();
        Lecture06 l06 = new Lecture06();
        Lecture07 l07 = new Lecture07();
        Lecture08 l08 = new Lecture08();
        Lecture09 l09 = new Lecture09();
        Lecture10 l10 = new Lecture10();
        Lecture11 l11 = new Lecture11();
        Lecture12 l12 = new Lecture12();
        Lecture13 l13 = new Lecture13();
        Lecture14 l14 = new Lecture14();
        Lecture15 l15 = new Lecture15();
        Lecture16 l16 = new Lecture16();
        Lecture17 l17 = new Lecture17();
        Lecture18 l18 = new Lecture18();
        Lecture19 l19 = new Lecture19();

        // Change this line to call the method you want to test
//        l19.scanAllLines("src\\main\\java\\Lecture19.java");
        l19.demo2D();
        // Shows how to call a method in the same class as main (must be static)
//        int randomInt = getRandomInt();
    }

    static int getRandomInt() {
        return (int)(Math.random() * 10);
    }
}
