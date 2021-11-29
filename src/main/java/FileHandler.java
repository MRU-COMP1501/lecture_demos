import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Simple class to handle File I/O for COMP 1501 Assignment 3.
 * Reads/writes entire text files to/from a single String.
 * @author Charlotte Curtis
 */

public class FileHandler {
    /**
     * Reads a file and returns a String
     * @param filename Name of a text file relative to project root.
     * @return String containing file contents, or empty string if file can't be read.
     */
    public static String readFile(String filename) {
        String fileContents = "";

        try {
            fileContents = Files.readString(Path.of(filename));
        } catch (IOException e) {
            return fileContents;
        }

        return fileContents;
    }

    /**
     * Writes a single string to a text file.
     * @param filename Name of the file to create relative to project root
     * @param contents Contents to write to the file.
     * @return True if writing successful, false if something went wrong.
     */
    public static boolean writeFile(String filename, String contents) {
        try {
            Files.writeString(Path.of(filename),contents);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
