package DBScrape.userInterface;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import DBScrape.Result;


/**
 * Exports results to file
 */
public class Printer {

    private static Printer instance;
    private ArrayList<Result> printQueue;
    private static final String writeDir = "./output";
    private static String writeName = "searchResults";

    private Printer() {
        printQueue = new ArrayList<Result>();
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    /**
     * Prints the printQueue to a file
     * @author rengotap
     */
    public void print() {
        if (verifyLocation()) {
            try {
                FileWriter w = new FileWriter(writeDir+writeName+".txt");
                //w.write(getFileHeader());
                for (int i = 0; i < printQueue.size(); i++)
                    w.write(printQueue.get(i).toString() + '\n' + '\n' + '\n');
                w.close();
                System.out.println("INFO: Successfully wrote to file");
            } catch (IOException e) {
                System.out.println("ERROR: Unable to write to file");
                e.printStackTrace();
            }
        }
    }

    /**
     * Verifies that the save location exists
     * @return
     */
    private boolean verifyLocation() {
        try {
            File writeIn = new File(writeDir + writeName + ".txt");
            if (writeIn.exists()) {
                System.out.println("INFO: Save location verified");
                return true;
            } else {
                writeIn.createNewFile();
                System.out.println("INFO: Created file");
                return true;
            }
        } catch (IOException e) {
            System.out.println("ERROR: Unable to verify printer's save location");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * adds a result to the printqueue
     * @param result result to be added
     * @author rengotap
     */
    public void enqueue(Result result) {
        printQueue.add(result);
    }

    /**
     * removes a result from the queue
     * @param index position of item
     * @author rengotap
     */
    public void dequeue(int index) {
        printQueue.remove(index);
    }

    /**
     * Removes all results from the queue
     * @author rengotap
     */
    public void wipe() {
        printQueue.clear();
    }
}