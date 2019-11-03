import java.util.Scanner;
import java.io.*;
public class Application {
    public static void main(String[] args) throws IOException{
            DuplicateRemover getMe = new DuplicateRemover();
            getMe.remove("src/problem1.txt");
            getMe.write("src/unique_words.txt");

    }
}