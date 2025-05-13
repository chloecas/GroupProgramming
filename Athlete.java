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
     * A method to see the birth year entered in the app
     * @return    birth year of athlete
     */
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    /**
     * A method to see the weight entered in the app
     * @return    weight of athlete
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     * A method to see the height entered in the app
     * @return    height of athlete
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * A method to see the gender chosen from list of pre-set values 
     * @return    gender of athlete
     */
    public Gender getGender()
    {
        return gender;
    }
    
    /**
     * A method to see the userID entered by the athlete
     * @return    userID of athlete
     */
    public int getUserID()
    {
        return userID;
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

