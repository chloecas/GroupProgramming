import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
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
    private Scanner scanner;
    
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
        scanner = new Scanner(System.in);
        welcomeMessage();
    }

    /**
     * A welcome message prints as the user "opens" our app with different selection choices
     */
    public void welcomeMessage()
    {
        System.out.println("Welcome to The Fitness Portal!");
        System.out.println("What would you like to do today?");
        System.out.println("Type the option that best suits your needs;");
        System.out.println("A: Log a workout!");
        System.out.println("B: Find your total distance covered!");
        System.out.println("C: See your total calories burned!");
        System.out.println("D: Find your friends!");
        
        if(scanner.next().equals("a")) {
            System.out.println();
        }
        else if(scanner.next().equals("b")) {
               System.out.println();
            }
        else if(scanner.next().equals("c")) {
                System.out.println();
        }
        else if(scanner.next().equals("d")) {
                System.out.println();
        }
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
    
    public void logWorkout()
    {
        //workout = new Activity(double,double,Modality,Athlete);
    }
    /**
     * Method to print all activities
     
    public void listAllActivities()
    {   for(int i = 0; i < activities.size(); i++) {
            activity.toString();
            
            }
        
    }
    */

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
