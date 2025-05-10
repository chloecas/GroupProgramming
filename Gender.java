
/**
 * Enumeration class Gender - pre-set options for gender input when creating 
 * user profile on fitness app
 *
 * @author Chloe Castrataro
 * @version 04/17/2025
 */
public enum Gender
{
    FEMALE("Female"), MALE("Male"), NONBINARY("Non Binary"), DEFAULT(" ");
    
    private String gender;
    
    Gender(String gender)
    {
        this.gender = gender;
    }
    
    public String toString()
    {
        return gender;
    }
}


