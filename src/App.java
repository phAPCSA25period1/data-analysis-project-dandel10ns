import java.io.File;
import java.util.Scanner;

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

        // TODO: Update this with your CSV file path
        File file = new File("https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/StateData2020-CDC-Census.csv");

        // TODO: Create an array of Data objects to store data
        Data arr[] = new Data[file.length];
        Scanner scan = new Scanner(file);


        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        int i = 0;
        while (scan.hasNext()){
            if (i==0){
                scan.nextLine();
            }
            String line = scan.nextLine();
            String[] parts = line.spilt(",");
            String name = parts[1];
            String overdoseDeaths = parts[4];
            String firearmDeaths = parts[6];
            Data state = new Data(name, overdoseDeaths, firearmDeaths);
            arr[i] = state;

            i++;
        }

        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);


        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question


        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }


}