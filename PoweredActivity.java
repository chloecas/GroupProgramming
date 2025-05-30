import java.util.HashMap;
/**
 * A specific kind of activity that users can log which requires a type of equipment.
 *
 * @author Manal Fayyaz, Chloe
 * @version 04/27/2025
 */
public class PoweredActivity extends Activity 
{
    private String equipment;

    /**
     * Constructor for objects of class PoweredActivity
     */
    public PoweredActivity(double distance, double duration, Modality modality, int userID , String equipment)
    {
        super(distance,duration,modality,userID);
        this.equipment = equipment;
    }

    /**
     * Get the equipment used for the activity
     * @return the equipment object
     */
    public String getEquipment()
    {
        return equipment;
    }

    /**
     * Calculate the calories burned, with 20% boost for equipment use  
     * @return the estimate calories burned  
     */
    public double calculateCaloriesBurned(){
        return super.calculateCaloriesBurned() * 1.2;
    }

    /**
     * Displays the details of the power activity including equipment 
     */
    public String toString(){
        return super.toString() + ", Equipment: " + equipment;
    }
}
