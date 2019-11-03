import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateCounter {
    private HashMap<String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws IOException {
        System.out.println ("enter strings into the problem2 file to see if it work.");

        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;
        String theWords;


        fileByteStream = new FileInputStream(dataFile);
        inFS = new Scanner(fileByteStream);



        while (inFS.hasNext()) {
            //System.out.println("num: " + dataFile);
            theWords = inFS.next();
            //goes through the map and count the occurrence of words.
            if (wordCounter.containsKey(theWords))
            {
                wordCounter.put(theWords, wordCounter.get(theWords) + 1);
            }
            else
            {
                wordCounter.put(theWords, 1);
            }
            // System.out.println("num: " + dataFile); *check to see if file was taken.
            // System.out.println(wordCounter); *check cases.
        }
        inFS.close();

    }
    public void write(String outputFile) throws IOException {
        FileOutputStream fileByteStream = null; // File output stream
        PrintWriter outFS = null;


        File temp;
        temp = new File(outputFile);
            //edit file if needed too
        if (temp.exists()) {
            fileByteStream = new FileOutputStream(temp);
            outFS = new PrintWriter(fileByteStream);

                    outFS.write(wordCounter + "\n");
        }
        else
            //create file if needed to.
        {
            temp.createNewFile();
            fileByteStream = new FileOutputStream(temp);
            outFS = new PrintWriter(fileByteStream);

                outFS.write(wordCounter+"\n");


        }
        outFS.close();
       // System.out.println("im in the write function  and the file had to be created"); *check statement
    }

}
