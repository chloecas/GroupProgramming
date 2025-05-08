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
        athletes = new ArrayList<>();
        activities = new ArrayList<>();
        scanner = new Scanner(System.in);
        
        
        createDatabase();
        activityDatabase();
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
        System.out.println("A: Create a profile!");
        System.out.println("B: Log a workout!");
        System.out.println("C: See your fitness history!");
        System.out.println("D: Find your friends!");
        
        if(scanner.next().equals("a")) {
            createProfile();
        }
        else if(scanner.next().equals("b")) {
               logWorkout();
            }
        else if(scanner.next().equals("c")) {
                System.out.println();
        }
        else if(scanner.next().equals("d")) {
                printAllAthletes();
        }
    }
    
    public void createDatabase()
    {
        Athlete athlete1 = new Athlete("Jane", 2000, 150.0, 5.6, Gender.FEMALE, 0);
        Athlete athlete2 = new Athlete("John", 1998, 175.5, 5.8, Gender.MALE, 1);
        Athlete athlete3 = new Athlete("Joe", 2001, 160.8, 5.3, Gender.NONBINARY, 2);
        
        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);
    }
    
    public void activityDatabase()
    {
       Activity running = new Activity(15.5, 70.3, Modality.RUNNING, 0);
       Activity walking = new Activity(5, 45.8, Modality.WALKING, 1);
       Activity biking = new Activity(20.2, 126.9, Modality.BIKING, 2);
       
       activities.add(running);
       activities.add(walking);
       activities.add(biking);
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
     * Adding athletes into the database of our social media platform
     * 
     * @param The athlete to be added
     */
    public void addAthlete(Athlete athlete)
    {
        athletes.add(athlete);
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
    
    public void printAllActivities()
    {
        for(Modality modality : Modality.values())
        {
            System.out.println(modality);
        }
    }
    
    public void createProfile()
    {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        
        System.out.println("");
    }
    
    /**
     * 
     */
    public void logWorkout()
    {
        System.out.println("How long was the workout? (in minutes)");
        double duration = scanner.nextDouble();
        
        System.out.println("How far did you go? (in kilometers)");
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
        
        System.out.println("Enter your userID to confirm logged workout");
        int userID = scanner.nextInt();
        
        System.out.println("Workout logged! Happy trails!");
        Activity workout = new Activity(duration, distance, modality, userID);
        activities.add(workout);
       
    }

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
