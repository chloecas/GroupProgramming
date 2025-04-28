import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class ActivityManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActivityManager
{
    private ArrayList<String> athletes;
    private HashMap<Athlete, Activity> activityHistory;
    private ArrayList<Activity> activities;

    public static void main(String[] args)
    {
     
    }
    
    /**
     * Constructor for objects of class ActivityManager
     */
    public ActivityManager()
    {
        activityHistory = new HashMap<>();
        athletes = new ArrayList<>();
        activities = new ArrayList<>();
        welcomeMessage();
    }

    /**
     * A welcome message prints as the user "opens" our app with different selection choices
     */
    public void welcomeMessage()
    {
        System.out.println("Welcome to The Fitness Portal!");
        System.out.println("What would you like to do today?");
    }
    
    /**
     * Adding athletes to the database of users
     * 
     * @param The name of the athlete to be added
     */
    public void addAthlete(String name)
    {
        athletes.add(name);
    }
    
    /**
     * Adding activities to the database of activities
     * 
     * @param The activity to be added
     */
    public void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    
    /**
     * A method meant to print out a list of all the athlete's names in the portal
     *
     */
    public void printAllAthletes()
    {
        for(String name : athletes) {
            System.out.println(name);
        }
    }
        // // Method to print all activities
    // METHOD listAllActivities()
        // FOR each activity IN activities
            // PRINT activity details
        // END FOR
    // END METHOD

    // // Method to list activities by athlete
    // METHOD listActivitiesByAthlete(Athlete athlete)
        // IF athlete exists in athleteActivities
            // FOR each activity IN athleteActivities.get(athlete)
                // PRINT activity details
            // END FOR
        // ELSE
            // PRINT "No activities found for this athlete."
        // END IF
    // END METHOD

    // // Method to print statistics
    // METHOD printStatistics()
        // // brainstorm details here
        // // e.g., total distance, total activities, etc.
    // END METHOD

}
