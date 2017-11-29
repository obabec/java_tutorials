import com.redhat.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

public class bubbleTest
{
    Logger log = Logger.getLogger("MyLogger");
    ConsoleHandler cHand = new ConsoleHandler();


    @Before
    public void beforeEachTest()
    {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.info("Starting new test!");
    }

    @Test
    public void bubbleTestInt()
    {
        Random rand = new Random();
        List<Integer> numbersToSort= new ArrayList<>();



        for (int i=0;i<rand.nextInt(Integer.SIZE-1);i++)
        {
            numbersToSort.add(rand.nextInt());
        }

        Main.numbersToSort = numbersToSort.stream().collect(Collectors.toList());
        Main.bubble();

        Collections.sort(numbersToSort);

        assertEquals(true,Main.numbersToSort.equals(numbersToSort));

    }


    @After
    public void afterEachTest()
    {
        cHand.setFormatter(new SimpleFormatter());
        cHand.setLevel(Level.ALL);
        log.addHandler(cHand);
        log.info("Ending test!");
    }






}
