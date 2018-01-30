package sorting.selection;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.selectors.parse.ParseSelection;
import com.redhat.sorting.selectors.sort.SortSelection;
import com.redhat.sorting.sort.InsertSorter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionTest {

    @Test
    public void parserSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setTypeOfContent("json");
        ParseSelection parserSelector = new ParseSelection();

        assertEquals(new JsonDataParser(),parserSelector.selectParser(cmdParser));
    }

    @Test
    public void insertSorterSelectionTest() {

        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("insert");
        SortSelection sortSelector = new SortSelection();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));

    }

    @Test
    public void quickSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("quick");
        SortSelection sortSelector = new SortSelection();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

    @Test
    public void selectSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("select");
        SortSelection sortSelector = new SortSelection();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

    @Test
    public void bubbleSorterSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setAlgorithm("bubble");
        SortSelection sortSelector = new SortSelection();
        assertEquals(new InsertSorter(),sortSelector.selectSorter(cmdParser));
    }

}
