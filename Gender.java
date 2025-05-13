
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
    
    /**
     * A method to construct an an enum and assign it a value.
     * @param Gender to be assigned.
     * 
     */
    Gender(String gender)
    {
        this.gender = gender;
    }
    
    /**
     * @Return Gender as a String, to be used outside of this class.
     */
    public String toString()
    {
        return gender;
    }
}


