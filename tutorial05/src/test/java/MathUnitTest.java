
import com.redhat.SimpleMath;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;



public class MathUnitTest
{
    @Before
    public void beforeEachTest()
    {
        System.out.println("TEST FOR MULTIPLY");
    }



    @Test(expected = IllegalArgumentException.class)
    public void testExecption()
    {
       assertEquals("2k exp",2000,SimpleMath.multiply(1000,2),0);

    }




    @Test
    public void testMultiply()
    {

        assertEquals(0,SimpleMath.multiply(10,0),0.00001);
        assertEquals(-15,SimpleMath.multiply(3,-5),0);

    }

    @After
    public void afterEchTest()
    {
        System.out.println("TEST COMPLETED");
    }
}
