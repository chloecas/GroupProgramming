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
    private ArrayList<Athlete> athletes;
    private HashMap<Athlete, Activity> activityHistory;
    private ArrayList<Activity> activities;
    private Scanner scanner;
    private HashMap<Integer, Double> totalDistanceById;
    private HashMap<Integer, Double> totalDurationById;
    private HashMap<Integer, Integer> totalCaloriesById;
    
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
        totalDistanceById = new HashMap<>();
        totalDurationById = new HashMap<>();
        totalCaloriesById = new HashMap<>();
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
            logWorkout();
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
        for(Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    }
    
    /**
     * 
     */
    public void logWorkout()
    {
        System.out.println("How long was the workout?");
        double duration = scanner.nextDouble();
        
        System.out.println("How far did you go?");
        double distance = scanner.nextDouble();
        
        System.out.println("What kind of workout was it?");
        System.out.println("Option 1, 2, or 3");
        for(Modality modality : Modality.values()) {
            System.out.println(modality);
        }
        
        int option = scanner.nextInt();
        
        Modality modality = Modality.DEFAULT;
        switch(option) {
            case 1:
                modality = Modality.WALKING;
               System.out.println("Walking workout chosen");
               break;
            
            case 2:
                modality = Modality.RUNNING;
                System.out.println("Running workout chosen");
                break;
            
            case 3:
                modality = Modality.BIKING;
                System.out.println("Biking workout chosen");
                break;
                
            case 4:
                modality = Modality.DEFAULT;
                System.out.println(" ");
                break;
            }
        //Modality walking = Modality.valueOf(scanner.nextLine());
        
        System.out.println("Enter your userID to confirm logged workout");
        int userID = scanner.nextInt();
        
        System.out.println("Workout logged! Happy trails!");
        Activity workout = new Activity(duration, distance, modality, userID);
       
    }
    public void printTotalDistance()
    {
        System.out.print("Enter your userID: ");
        int userID = scanner.nextInt();

        System.out.print("How much distance did you just cover (in km)? ");
        double distance = scanner.nextDouble();

        double currentTotal = totalDistanceById.getOrDefault(userID, 0.0);

        double updatedTotal = currentTotal + distance;
        totalDistanceById.put(userID, updatedTotal);

        System.out.println("User " + userID + ", your total distance is: " + updatedTotal + " km.");
    }

    public void printTotalDuration()
    {
        System.out.print("Enter your userID: ");
        int userID = scanner.nextInt();

        System.out.print("How long was your activity (in minutes)? ");
        double duration = scanner.nextDouble();

        double currentTotal = totalDurationById.getOrDefault(userID, 0.0);
        double updatedTotal = currentTotal + duration;
        totalDurationById.put(userID, updatedTotal);

        System.out.println("User " + userID + ", your total duration is: " + updatedTotal + " minutes.");
    }

    public void printTotalCalories()
    {
        System.out.print("Enter your userID: ");
        int userID = scanner.nextInt();

        System.out.print("How many calories did you burn? ");
        int calories = scanner.nextInt();

        int currentTotal = totalCaloriesById.getOrDefault(userID, 0);
        int updatedTotal = currentTotal + calories;
        totalCaloriesById.put(userID, updatedTotal);

        System.out.println("User " + userID + ", your total calories burned so far is: " + updatedTotal);
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
