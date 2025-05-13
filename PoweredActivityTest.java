

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PoweredActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PoweredActivityTest
{
    /**
     * Default constructor for test class PoweredActivityTest
     */
    public PoweredActivityTest()
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
    public void PoweredActivityTest()
    {
        PoweredActivity poweredA1 = new PoweredActivity(2, 20, Modality.WALKING, 2, "none");
        assertEquals(120, poweredA1.calculateCaloriesBurned(), 0.1);
        assertEquals("none", poweredA1.getEquipment());
    }
}


