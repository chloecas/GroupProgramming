
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
    
    Modality(String modality)
    {
        this.modality = modality;
    }
    
    public String toString()
    {
        return modality;
    }
}
