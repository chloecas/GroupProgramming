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
    private ArrayList<Athlete> athletes;
    
    /**
     * Constructor for objects of class Athlete
     * 
     * Weight is in pounds (lbs) with decimals, Height is in feet and inches 
     * where the number after decimal is inch measurement
     */
    public Athlete(String name, int yearOfBirth, double weight, double height, Gender gender)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        athletes = new ArrayList<>();// position = athlete, name
        
        athletes.add(this);
    }
    
    /**
     * A method to see the name entered in the app
     *
     * @return    name of athlete
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * A method to display all of the athlete's personal information they previously entered
     */
    public void display()
    {
        System.out.println("Welcome " + name + "!");
        System.out.println("Here are your user details; ");
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
    }
}
