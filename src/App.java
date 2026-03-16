import java.io.File;
import java.util.Scanner;
import java.io.IOException;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) {

        File file = new File("https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/StateData2020-CDC-Census.csv");
        Data[] states = new Data[53];

        try (Scanner scan = new Scanner(file)){
            int i = 0;
            //skip header row
            if (scan.hasNextLine()){
                scan.nextLine();
            }

            while (scan.hasNext() && i < states.length){
                String line = scan.nextLine();
                String[] parts = line.split(",");
                states[i] = new Data(parts[1], parts[4], parts[6]);
                i++;
        }

        //call analysis methods
        String highest = findMaxOverdose(states);
        System.out.println("Highest overdose rate: " + highest); 
    }
    catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }

    }



/**
 * Algorithm to find the state with the highest overdose death rate.
 */
public static String findMaxOverdose(Data[] arr) {
        double max = -1.0;
        String resultState = "";
        for (Data sta : arr) {
            if (sta != null && sta.getOverdose() > max) {
                max = sta.getOverdose();
                resultState = sta.getName();
            }
        }
        return resultState;
    }
}