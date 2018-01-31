package sorting.selection;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.selectors.parse.ParseSelectorImpl;
import com.redhat.sorting.selectors.sort.SortSelectorImpl;
import com.redhat.sorting.sort.BubbleSorter;
import com.redhat.sorting.sort.InsertSorter;
import com.redhat.sorting.sort.QuickSorter;
import com.redhat.sorting.sort.SelectSorter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortSelectionTest {



    @Test
    public void insertSorterSelectionTest() {

        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("insert");
        cmdParser.setDatatype("string");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new InsertSorter().getClass().getName(), sortSelector.selectSorter(cmdParser).getClass().getName());

    }

    @Test
    public void quickSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("quick");
        cmdParser.setDatatype("string");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new QuickSorter().getClass().getName(), sortSelector.selectSorter(cmdParser).getClass().getName());
    }

    @Test
    public void selectSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("select");
        cmdParser.setDatatype("string");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new SelectSorter().getClass().getName(), sortSelector.selectSorter(cmdParser).getClass().getName());
    }

    @Test
    public void bubbleSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("bubble");
        cmdParser.setDatatype("string");
        SortSelectorImpl sortSelector = new SortSelectorImpl();
        assertEquals(new BubbleSorter().getClass().getName(), sortSelector.selectSorter(cmdParser).getClass().getName());
    }

}
