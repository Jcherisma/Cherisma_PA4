import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public final class DuplicateRemover {
    private Set<String> uniqueWords;

    public void remove(String dataFile) throws IOException {
        System.out.println ("enter strings into the problem1 file to see if it work.");

        FileInputStream fileByteStream = null; //  input stream for file
        Scanner inFS = null;
        String theWords;

        uniqueWords = new HashSet<String>();
       fileByteStream = new FileInputStream(dataFile);
        inFS = new Scanner(fileByteStream);


//goes through the set and see if there any replications
        while (inFS.hasNext()) {

            theWords = inFS.next();

            uniqueWords.add(theWords);
            //System.out.println("num: " + uniqueWords); *check case
        }
        //System.out.println("num im in remove function "); *check case
        fileByteStream.close();
    }

    public void write(String outputFile) throws IOException {
        FileOutputStream fileByteStream = null; // File output stream
        PrintWriter outFS = null;


        File temp;
        temp = new File(outputFile);
//input into a file already there
        if (temp.exists()) {
            fileByteStream = new FileOutputStream(temp);
            outFS = new PrintWriter(fileByteStream);
            Iterator get = uniqueWords.iterator();

            while (get.hasNext()) {
                String word1;

                word1 = (String) get.next();
                System.out.println("num: " + word1);
                outFS.write(word1 + "\n");
            }
            outFS.close();
           // System.out.println("im in the write function "); *check case

        }
        //makes a file if one is not there already.
        else
        {
            temp.createNewFile();
            fileByteStream = new FileOutputStream(temp);
            outFS = new PrintWriter(fileByteStream);

            Iterator get = uniqueWords.iterator();

            while (get.hasNext()) {
                String word1;

                word1 = (String) get.next();
                //System.out.println("num: " + word1);
                outFS.write(word1 + "\n");
            }

        }
        outFS.close();
        //System.out.println("im in the write function  and the file had to be created"); *check case
    }
}