/**
 * Represents one row of statistical data from the CDC Census data.
 * Class inculdes firearm and overdose death rates.
 */
public class Data {

    private double firearmDeaths;
    private String name;
    private double overdoseDeaths;

    /**
     * Constructor for Data class
     * @param name
     * @param firearmDeaths String value of firearm death rate
     * @param overdoseDeaths String value of overdose death rate
     */
    public Data (String name, String firearmDeaths, String overdoseDeaths){
        this.name = name;
        this.firearmDeaths = Double.parseDouble(firearmDeaths);
        this.overdoseDeaths = Double.parseDouble(overdoseDeaths);
    }

    /**
     * Getter for name
     * @return name of the state
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for overdose death rate
     * @return overdose death rate as a double
     */
    public double getOverdose(){
        return overdoseDeaths;
    }

    /**
     * Getter for firearm death rate
     * @return firearm death rate as a double
     */
    public double getFirearm(){
        return firearmDeaths;
    }

    /**
     * Returns a string representation of the Data object
     * @return String in the format: "In [name] there are [firearm
     */
   @Override
    public String toString() {
        return ("In " + name + " there are " + firearmDeaths +  " firearm deaths and " + overdoseDeaths + " overdose deaths.");
    }
}