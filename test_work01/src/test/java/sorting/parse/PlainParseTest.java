package sorting.parse;

import com.redhat.sorting.parse.PlainDataParser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlainParseTest {
    @Test
    public void parseTest() {

        Collection c = new ArrayList();
        c.add("Svete");
        c.add("Ahoj");
        c.add("!");
        List controlList = new ArrayList(c);

        PlainDataParser plainDataParser = new PlainDataParser();
        List parserOutputList = plainDataParser.parseData(controlList);
        assertEquals(controlList,parserOutputList);
    }

    @Test
    public void emptyByteTest() {
        PlainDataParser parser = new PlainDataParser();
        List bytes = null;
        assertEquals(null,parser.parseData(bytes));
    }
}
