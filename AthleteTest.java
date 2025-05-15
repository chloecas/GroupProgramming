

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AthleteTest.
 *
 * @author Manal Fayyaz
 * @version 5/13/2025
 */
public class AthleteTest
{
    /**
     * Default constructor for test class AthleteTest
     */
    public AthleteTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
 
    @Test
    public void CreateAthleteTest()
    {
        Athlete athlete1 = new Athlete("manal", 2005, 49, 2.4, Gender.FEMALE, 2);
        assertEquals(Gender.FEMALE, athlete1.getGender());
        assertEquals(2.4, athlete1.getHeight(), 0.1);
        assertEquals("manal", athlete1.getName());
        assertEquals(2, athlete1.getUserID());
        assertEquals(49, athlete1.getWeight(), 0.1);
        assertEquals(2005, athlete1.getYearOfBirth());
    }

    @Test
    public void getNameTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals("Chloe", athlete1.getName());
    }

    @Test
    public void getYOBTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals(1998, athlete1.getYearOfBirth());
    }

    @Test
    public void getWeightTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals(34.5, athlete1.getWeight(), 0.1);
    }
    
    @Test
    public void getHeightTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals(5.3, athlete1.getHeight(), 0.1);
    }

    @Test
    public void getGenderTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals(Gender.NONBINARY, athlete1.getGender());
    }

    @Test
    public void getUserIDTest()
    {
        Athlete athlete1 = new Athlete("Chloe", 1998, 34.5, 5.3, Gender.NONBINARY, 3);
        assertEquals(3, athlete1.getUserID());
    }
}







