import java.util.Scanner;
import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateCounter getMe = new DuplicateCounter();
        getMe.count("src/problem2.txt"); //takes in a file.
        getMe.write("src/unique_words_counts.txt"); //return a file.

    }
}