
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivityManagerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivityManagerTest
{
    /**
     * Default constructor for test class ActivityManagerTest
     */
    public ActivityManagerTest()
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
    public void testAddActivity()
    {
        ActivityManager manager = new ActivityManager();
        //there should be 4 entries in the ArrayList after logging a workout
        assertEquals(4, manager.getActivities().size());
    }
    
    @Test
    public void testAddAthlete()
    {
        ActivityManager manager1 = new ActivityManager();
        //there should be 4 entries in the ArrayList after creating a profile
        assertEquals(4, manager1.getAthletes().size());
    }
}
