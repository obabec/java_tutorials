package sorting.selection;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.selectors.parse.ParseSelectorImpl;
import com.redhat.sorting.selectors.sort.SortSelectorImpl;
import com.redhat.sorting.sort.InsertSorter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortSelectionTest {



    @Test
    public void insertSorterSelectionTest() {

        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("insert");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));

    }

    @Test
    public void quickSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("quick");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

    @Test
    public void selectSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("select");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

    @Test
    public void bubbleSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("bubble");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

}
