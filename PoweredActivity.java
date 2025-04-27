import java.util.HashMap;
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public void sampleMethod()
    {
        
    }
}
