import java.util.HashMap;
/**
 * A specific kind of activity that users can log which requires a type of equipment.
 *
 * @author Manal Fayyaz
 * @version 04/27/2025
 */
public class PoweredActivity extends Activity 
{
    private String equipment;
    private HashMap<Activity, String> equipmentList;

    /**
     * Constructor for objects of class PoweredActivity
     */
    public PoweredActivity(double distance, double duration, Modality modality, Athlete athlete, String equipment)
    {
        super(distance,duration,modality,athlete);
        this.equipment = equipment;
        equipmentList = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEquipment()
    {
         return equipment;
    }
    
    public double getCaloriesBurned(){
        return super.getCaloriesBurned() * 1.2;
    }
    
    public String toString(){
        return super.toString() + ", equipment='" + equipment + "'";
    }
}
