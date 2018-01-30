package sorting.parse;

import com.redhat.sorting.parse.PlainDataParser;
import org.junit.Test;
import sorting.DataStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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

        byte[] data = c.toArray().toString().getBytes();
        PlainDataParser plainDataParser = new PlainDataParser();
        List parserOutputList = plainDataParser.parseData(data);
        assertEquals(controlList,parserOutputList);
    }

    @Test
    public void emptyByteTest() {
        PlainDataParser parser = new PlainDataParser();
        byte[] bytes = null;
        assertEquals(null,parser.parseData(bytes));
    }
}
