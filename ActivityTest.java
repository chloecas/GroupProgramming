

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivityTest
{
    /**
     * Default constructor for test class ActivityTest
     */
    public ActivityTest()
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
    public void getDurationTest()
    {
        Activity activity1 = new Activity(12.2, 18.2, Modality.WALKING, 9);
        assertEquals(18.2, activity1.getDuration(), 0.1);
    }

    @Test
    public void getDistanceTest()
    {
        Activity activity1 = new Activity(12.2, 15.6, Modality.WALKING, 9);
        assertEquals(12.2, activity1.getDistance(), 0.1);
    }

    @Test
    public void getAthleteTest()
    {
        Activity activity1 = new Activity(12.2, 18.2, Modality.BIKING, 9);
        assertEquals(9, activity1.getAthlete());
    }

  
    @Test
    public void getModalityTest()
    {
        Activity activity1 = new Activity(12.2, 12.2, Modality.WALKING, 9);
        assertEquals("Walking", activity1.getModality());
    }

    @Test
    public void CalcCalBurnedTest()
    {
        Activity activity1 = new Activity(12.2, 12.2, Modality.WALKING, 9);
        assertEquals(610, activity1.calculateCaloriesBurned(), 0.1);
    }

 
}









