
/**
 * User profiles of athletes using our fitness social media portal
 *
 * @author Chloe Castrataro
 * @version 04/16/2025
 */
public class Athlete
{
    private String name;
    private int age;
    private double weight;
    private double height;

    /**
     * Constructor for objects of class Athlete
     * 
     * Weight is in pounds (lbs) with decimals, Height is in feet and inches 
     * where the number after decimal is inch measurement
     */
    public Athlete(String name, int age, double weight, double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setGender()
    {
        
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
     * A method for the user to change the name they previously entered in 
     * the app
     */
    public void changeName(String name)
    {
        this.name = name;
    }
}
