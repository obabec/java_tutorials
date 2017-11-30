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
        Main.numbersToSort.clear();
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

    @Test
    public void oneNumberTest()
    {
        Main.numbersToSort.clear();
        Random rand = new Random();
        int numero = rand.nextInt();
        log.warning(Integer.toString(numero));
        Main.numbersToSort.add(numero);
        Main.bubble();
        log.warning(Integer.toString(Main.numbersToSort.get(0)));

        assertEquals(numero,Main.numbersToSort.get(0),0);
    }

    @Test
    public void reverseListTest()
    {
        Main.numbersToSort.clear();
        List<Integer> listerino = new ArrayList<>();
        for (int i=5;i>0;i--)
        {
            listerino.add(i);
        }
        Main.numbersToSort = listerino.stream().collect(Collectors.toList());
        Collections.sort(listerino);
        Main.bubble();

        assertEquals(true,listerino.equals(Main.numbersToSort));
    }

    @Test
    public void emptyListTest()
    {
        Main.numbersToSort.clear();
        List<Integer> listerino = new ArrayList<>();
        Main.numbersToSort = listerino.stream().collect(Collectors.toList());
        assertEquals(listerino,Main.numbersToSort);

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
