import java.util.ArrayList;
/**
 * The kinds of activities users can log in our fitness app, with specifications for the 
 * duration, modality, distance, and calories burned per exercise.
 *
 * @author Manal Fayyaz
 * @version 04/27/2025
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
     public Athlete getAthlete(){
       return athlete;
    }
    
    public Modality getModality(){
        return modality;
    }
    
     public double getDistance(){
        return distance;
    }
    
     public double getDuration(){
        return duration;
    }
    
    public double getCaloriesBurned(){
        return distance * 50;
    }
    
    public String toString(){
        return "Activity{" + "athlete=" + athlete.getName() + ", modality=" + modality + ",distance=" + distance + " km" + ",duration=" + duration + " mins" + "}";
    } 
}
