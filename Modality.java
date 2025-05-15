
/**
 * Enumeration class Modality - The various preset modes of 
 * transportation recognized by our fitness app
 *
 * @author Chloe Castrataro & Jesse 
 * @version 05/14/2025
 */
public enum Modality
{
    WALKING("Walking"), RUNNING("Running"), BIKING("Biking"), SWIMMING ("Swimming"), 
    ROLLERBLADING("Rollerblading"),DEFAULT(" ");
    
    private String modality;
    
    /**
     * Constructor of enum Modality
     * @param assigning the enum a specified value from the list of constants.
     */
    Modality(String modality)
    {
        this.modality = modality;
    }
    
    
    /**
     * A method to create a String representation of Modality object
     * @return  modality as a String to be used outside of this specific class.
     */
    public String toString()
    {
        return modality;
    }
}
