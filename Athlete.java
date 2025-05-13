import java.util.ArrayList;
/**
 * User profiles of athletes using our fitness social media portal
 *
 * @author Chloe Castrataro
 * @version 04/16/2025
 */
public class Athlete 
{
    private String name;
    private int yearOfBirth;
    private double weight;
    private double height;
    private Gender gender;
    private int userID;
    
    /**
     * Constructor for objects of class Athlete
     * 
     * @param name   name of athlete
     * @param yearOfBirth   birth year of the athlete
     * @param weight   weight of athlete in pounds (lbs)
     * @param height   height of athlete in feet and inches
     * @param gender    gender of athlete chosen from a list of enum values
     * @param userID   ID number to identify athlete in the system
     */
    public Athlete(String name, int yearOfBirth, double weight, double height, Gender gender, int userID)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.userID= userID;
    }
    
    /**
     * A method meant to compare two Athletes objects to see if they are the same.
     * @param   Athlete object to be compared
     * @return   true if athlete is the same, false is they are not
     */
    public boolean equals(Athlete athlete)
    {
        return(this == athlete);
    }
    
    /**
     * A method to see the name entered in the app
     * @return    Name of athlete
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * A method to display all of the athlete's personal information they previously entered
     * @return   A description of the Athlete object and its field values as a String
     */
    public String toString()
    {
        return "Welcome " + name + "!" +
                "Here are your user details; " +
                "Year of Birth: " + yearOfBirth +
                "Weight: " + weight +
                "Height: " + height +
                "Gender: " + gender;
    }
}
