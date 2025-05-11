import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class replicates a social media fitness app. The user is able to interact through input and
 * choose various option such as logging a workout, creating a new profile, or seeing a list of
 * existing users in the app. Our fitness app is called GlowUp.
 * 
 * It uses a Scanner object to read the input of the user, and ArrayLists of athletes and activities
 * provide context for its output.
 *
 * @author Chloe Castrataro, Manal Fayyaz
 * @version 05/09/2025
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

        start();
    }

    /**
     * A welcome message prints as the user "opens" our app with different selection choices.
     */
    public void welcomeMessage()
    {
        System.out.println("Welcome to GlowUp!");
        System.out.println("What would you like to do today?");
        System.out.println("Type the option that best suits your needs;");
        System.out.println("[1] Create a profile!");
        System.out.println("[2] Log a workout!");
        System.out.println("[3] See your fitness history!");
        System.out.println("[4] Find your friends!");
        System.out.println("Or type 'exit' to leave the app");

        int input = scanner.nextInt();
        switch(input) {
            case 1: 
               createProfile();
                break;

            case 2:
                logWorkout();
                break;

            case 3:
                fitnessHistory();
                break;

            case 4:
                printAllAthletes();
                break;
        }
    }

    public void start()
    {
        boolean hasFinished = false;

        welcomeMessage();

        while(!hasFinished) {
            if(scanner.next().equals("exit")) {
                hasFinished = true;
            }
        }
        System.out.println("Thank you for using GlowUp... Goodbye!");
    }

    /**
     * A method meant to fill the athletes ArrayList, creating pre-existing users in our app 
     * database.
     */
    private void createDatabase()
    {
        Athlete athlete1 = new Athlete("Jane", 2000, 150.0, 5.6, Gender.FEMALE, 0);
        Athlete athlete2 = new Athlete("John", 1998, 175.5, 5.8, Gender.MALE, 1);
        Athlete athlete3 = new Athlete("Joe", 2001, 160.8, 5.3, Gender.NONBINARY, 2);

        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);
    }

    /**
     * A method to fill the activities ArrayList of completed workouts by other athletes.
     */
    private void activityDatabase()
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
     * A method meant to print out a list of all the athlete's names currently in the portal.
     *
     */
    public void printAllAthletes()
    {
        System.out.println("Here is a list of all the athletes currently using GlowUp;");
        for(Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
        mainMenu();
    }

    /**
     * A method meant to print a list of all the pre-determined activity options in our app.
     */
    public void printAllActivities()
    {
        for(Modality modality : Modality.values())
        {
            System.out.println(modality);
        }
    }

    /**
     * A method that is meant to simulate creating a profile in our fitness app. The user is asked
     * various questions, and their input is used to create an Athlete object. This object is 
     * automatically added to an ArrayList of Athlete objects.
     */
    public void createProfile()
    {
        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your year of birth?");
        int yearOfBirth = scanner.nextInt();

        System.out.println("What is your weight? In lbs");
        double weight = scanner.nextDouble();

        System.out.println("What is your height? Please use a decimal to represent feet & inches");
        double height = scanner.nextDouble();

        System.out.println("How do you identify? Please choose from the following options;");
        System.out.println("Option 1, 2, 3:");
        for(Gender gender : Gender.values()) {
            System.out.println(gender);
        }
        int option = scanner.nextInt();

        Gender gender = Gender.DEFAULT;
        switch(option) {
            case 1:
                gender = Gender.FEMALE;
                System.out.println("You identify as female");
                break;

            case 2:
                gender = Gender.MALE;
                System.out.println("You identify as male");
                break;

            case 3:
                gender = Gender.NONBINARY;
                System.out.println("You identify as non-binary");
                break;

            case 4:
                gender = Gender.DEFAULT;
                System.out.println(" ");
                break;
        }
        
        System.out.println("\n");
        System.out.println("Your userID is a unique number meant to identify you in our systems.");
        int userID = 3;

        System.out.println("Your userID is [3]");

        Athlete athlete4 = new Athlete(name, yearOfBirth, weight, height, gender, userID);
        athletes.add(athlete4);

        System.out.println("Welcome to GlowUp " + name + "!");
        System.out.println("\n");
        createDatabase();
        
        System.out.println("Would you like to see your profile? Type 'yes' or 'no'.");
        if(scanner.next().equals("yes")) {
            athlete4.display();
            mainMenu();
        } else {
            mainMenu();
        }
    }

    /**
     * A method that is meant to redirect the user back to the main menu once they've completed
     * a certain task such as logging a workout or creating a profile.
     */
    public void mainMenu()
    {
        System.out.println("Type '1' to go back to the main menu...");
        if(scanner.nextInt() == 1) {
            welcomeMessage();
        }
    }

    /**
     * A method that is meant to simulate logging a workout in our social media app. The user will
     * respond to various questions about the activity, and this input will be used to create an
     * Activity  or PoweredActivity object with their specifications. This object is automatically 
     * added to an ArrayList of activities.
     */
    public void logWorkout()
    {
        System.out.println("How long was the workout? (in minutes)");
        double duration = scanner.nextDouble();

        System.out.println("How far did you go? (in kilometers)");
        double distance = scanner.nextDouble();

        System.out.println("What kind of workout was it?");
        System.out.println("Option 1, 2, 3, 4 or 5");
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
                modality = Modality.SWIMMING;
                System.out.println("Swimming workout chosen");
                break;
            case 5:
                modality = Modality.ROLLERBLADING;
                System.out.println("Rollerblading workout chosen");
                break;
            
            case 6:
                modality = Modality.DEFAULT;
                System.out.println(" ");
                break;
        }
        
        System.out.println("Was any equipment used during this workout? Type 'yes' or 'no'");
        if(scanner.next().equals("yes")) {
            System.out.println("What equipment was used?");
            String equipment = scanner.next();
            
            System.out.println("Enter your userID to confirm logged workout");
            int userID = scanner.nextInt();

            System.out.println("Workout logged! Happy trails!");
            System.out.println("\n");
            PoweredActivity pWorkout = new PoweredActivity(duration, distance, modality, userID,equipment);
            activities.add(pWorkout);

            activityDatabase();
            mainMenu();
        } else {
            System.out.println("Enter your userID to confirm logged workout");
            int userID = scanner.nextInt();

            System.out.println("Workout logged! Happy trails!");
            System.out.println("\n");
            Activity workout = new Activity(duration, distance, modality, userID);
            activities.add(workout);

            activityDatabase();
            mainMenu();
        }
    }
    
    /**
     * A method that will call fitnessHistory() to show the options again.  
     */
    public void fitnessHistoryMenu()
    {
        System.out.println("Type '0' to go back to the fitnessHistory...");
        if(scanner.nextInt() == 0) {
         fitnessHistory();
        }
    }
    
    /**
     * A method that is meant to display a menu for viewing various fitness statistics.
     */
    public void fitnessHistory()
    {
        System.out.println("What would you like to see?");
        System.out.println("[1] Total Distance");
        System.out.println("[2] Total Duration");
        System.out.println("[3] Total Calories Burned");
        System.out.println("[4] Activity History");
        System.out.println("[5] Go Back to Main Menu");
        
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                printTotalDistance();
                break;
                
            case 2:
                printTotalDuration();
                break;
                
            case 3:
                printTotalCalories();
                break;
                
            case 4:
                listActivitiesByAthlete();
                break;
                
            case 5:
                mainMenu();
                break;
            }
    }

    /**
     * A method that will print total distance for a given userID.
     */
    public void printTotalDistance()
    {
        System.out.println("Enter your userID to see how far you've gone:");
        int userID = scanner.nextInt();
        
        double totalDistance = 0.0;

        for (Activity activity : activities){
            if (activity.getAthlete() == userID){
               totalDistance += activity.getDistance(); 
            }
        }
        System.out.println("The total distance is: " + totalDistance + " kilometers");
         
        fitnessHistoryMenu();
    }
    
    /**
     * A method that will print total duration of an activity for a given userID
     */
    public void printTotalDuration()
    {
        System.out.println("Enter your userID to see how long you've worked out:");
        int userID = scanner.nextInt();
        
        double totalDuration = 0.0;

        for (Activity activity : activities){
            if (activity.getAthlete() == userID){
               totalDuration += activity.getDuration(); 
            }
        }
        System.out.println("The total duration is: " + totalDuration+ " minutes.");
         
        fitnessHistoryMenu();
    }
    
    /**
     * A method that will print total calories burned for a given userID
     */
    public void printTotalCalories()
    {
        System.out.println("Enter your userID to see how many calories you have burned:");
        int userID = scanner.nextInt();
        
        double totalCalories = 0.0;

        for (Activity activity : activities){
            if (activity.getAthlete() == userID){
               totalCalories += activity.calculateCaloriesBurned(); 
            }
        }
        System.out.println("You have burned a total of: " + totalCalories + " calories");
         
        fitnessHistoryMenu();
    }

    public void listActivitiesByAthlete()
    {
        System.out.println("Enter your userID to access your activity history!");
        int userID = scanner.nextInt();
        
        for(Activity activity: activities) {
            if(activity.getAthlete() == userID) {
               System.out.println(activity.toString());
               System.out.println("\n");
               System.out.println("Nice job!");
            // } else {
                // System.out.println("No activities found for this athlete.");
            // 
           }
        }
        fitnessHistoryMenu();
    }
    
    public void listAllActivities()
    {
        for (Activity activity : activities) {
            System.out.println(activity);
        }
    }
}
