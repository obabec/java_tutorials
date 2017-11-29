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

        for (int i=0;i<5;i++)
        {
            numbersToSort.add(rand.nextInt());
            //System.out.println(numbersToSort.get(i));
        }

        Main.numbersToSort = numbersToSort;
        Main.bubble();

        for (int i=0;i<5;i++)
        {
            log.fine(String.valueOf(Main.numbersToSort.get(i)));
        }
        Collections.sort(numbersToSort);
        System.out.println("XXXXXXXXXXXXXXXXXX");
        numbersToSort.forEach(System.out::println);
        assertEquals(numbersToSort,Main.numbersToSort);

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
