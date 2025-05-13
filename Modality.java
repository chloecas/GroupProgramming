
/**
 * Enumeration class Modality - The various preset modes of 
 * transportation recognized by our fitness app
 *
 * @author Chloe Castrataro
 * @version 04/17/2025
 */
public enum Modality
{
    WALKING("Walking"), RUNNING("Running"), BIKING("Biking"), SWIMMING ("Swimming"), 
    ROLLERBLADING("Rollerblading"),DEFAULT(" ");
    
    private String modality;
    
    /**
     * A method to assign a modality to an enum and assign it a value.
     * @Param modality to be assigned.
     */
    Modality(String modality)
    {
        this.modality = modality;
    }
    
    
    /**
     * @Return modality as a String to be used outside of this specific class.
     */
    public String toString()
    {
        return modality;
    }
}
