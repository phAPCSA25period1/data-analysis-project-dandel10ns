/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Data {

    // TODO: Add at least 3 private attributes
    // Example:
    // private String name;
    // private String population;
    // private String value;
    private double firearmDeaths;
    private String name;
    private double overdoseDeaths;

    // TODO: Create a constructor that takes all attributes as parameters
    public Data (String name, String firearmDeaths, String overdoseDeaths){
        this.name = name;
        this.firearmDeaths = Double.parseDouble(firearmDeaths);
        this.overdoseDeaths = Double.parseDouble(overdoseDeaths);
    }

    // TODO: Add getters for attributes you need
    public String getName(){
        return name;
    }

    public double getOverdose(){
        return overdoseDeaths;
    }

    public double getFirearm(){
        return firearmDeaths;
    }
    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object
    public String toString(){
        System.out.println("In " + name + "there are " + firearmDeaths + " firearm deaths per 100 people and " + overdoseDeaths + " overdose deaths per 100 people.");
    }
}