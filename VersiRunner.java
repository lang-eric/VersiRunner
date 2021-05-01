import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//VersiRunner can take any file of text, and send that text to whatever code you have that does things with text.
//Sample Run Parameters: Java:java VersiRunner textfile

public class VersiRunner {
    private String file_path;

    public static void main(String[] args) {
        /* Sample usage of VersiRunner */
        VersiRunner v = new VersiRunner(args[0]);
        v.run(); //use the run method to begin file processing.
    }

    /*
    Constructor for VersiRunner, which takes a file_path as a parameter.
     */
    public VersiRunner(String file_path) {
        this.file_path = file_path;
    }

    void run() {
        try {
            File code = new File(file_path);
            Scanner s = new Scanner(code);

            boolean optional_evaluation_point = true;

            while (s.hasNextLine()) {
                /*processing of each line happens here*/
                
                String nextLine = s.nextLine(); //store the next line for optional evaluation.
                
                if (optional_evaluation_point) {
                    do_something(nextLine);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error, invalid file.");
        }
    }

    /* Sample function to represent a java function which might receive the text file's lines.*/
    void do_something(String line) {
        
    }


}
