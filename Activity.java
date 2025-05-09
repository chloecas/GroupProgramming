import java.util.ArrayList;
import java.util.HashMap;
/**
 * The kinds of activities users can log in our fitness app, with specifications for the 
 * duration, modality, distance, and calories burned per exercise.
 *
 * @author Manal Fayyaz,Chloe
 * @version 04/27/2025
 */
public class Activity
{
    private double distance;
    private double duration;
    private Modality modality;
    private int userID;
    private Athlete athlete;

    /**
     * Constructor for objects of class Activity
     */
    public Activity(double distance, double duration, Modality modality, int userID)
    {
        this.distance = distance;
        this.duration = duration;
        this.modality = modality;
        this.userID = userID;
    }

    /** 
     * Get the athlete who performed the activity
     * @return the athlete object
     */
     public int getAthlete(){  
       return userID;
    }
    
    /**
     * Gets the transportation mode used in the activity
     * @return the mode of transportation
     */
    public Modality getModality(){
        return modality;
    }
    
    /**
     * Gets the disance traveled during the activity
     * @return the distance in kilometers
     */ 
    public double getDistance(){
        return distance;
    }
    
    /**
     * Gets the duration of the activity
     * @return the duration in minutes
     */
    public double getDuration(){
        return duration;
    }
    
    
    /**
     * Calculate the calories burned based on the distance
     * @return the estimated number of calories burned
     */
    public double calculateCaloriesBurned(){
        //calories = distance * 50
        return distance * 50; //1 km = 50 calories
    }
    
    /**
     * Print the information related to activity
     */
    public String toString(){
        return "Activity{" + "athlete=" + athlete.getName() + ", modality=" + modality + ",distance=" + distance + " km" + ",duration=" + duration + " mins" + "}";
    } 
}
