package sorting.selection;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.parse.PlainDataParser;
import com.redhat.sorting.selectors.parse.ParseSelectorImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserSelectionTest {

    @Test
    public void parserJsonSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setTypeOfContent("json");
        ParseSelectorImpl parserSelector = new ParseSelectorImpl();

        assertEquals(new JsonDataParser().getClass().getName(),parserSelector.selectParser(cmdParser).getClass().getName());
    }

    @Test
    public void parserPlainSelectionTest() {
        CommadLineParser cmdParser = new CommadLineParser();
        cmdParser.setTypeOfContent("plain");
        ParseSelectorImpl parserSelector = new ParseSelectorImpl();

        assertEquals(new PlainDataParser().getClass().getName(),parserSelector.selectParser(cmdParser).getClass().getName());
    }

}
