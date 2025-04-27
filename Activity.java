import java.util.ArrayList;
/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    private double distance;
    private double duration;
    private Modality modality;
    private Athlete athlete;
    private ArrayList<Activity> activities;

    /**
     * Constructor for objects of class Activity
     */
    public Activity(double distance, double duration, Modality modality, Athlete athlete)
    {
        this.distance = distance;
        this.duration = duration;
        this.modality = modality;
        this.athlete = athlete;
        activities = new ArrayList<>();
        
        activities.add(this);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here

    }
}
