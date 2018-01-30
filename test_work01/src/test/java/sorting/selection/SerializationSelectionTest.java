package sorting.selection;

import com.redhat.sorting.cmd.CommadLineParser;
import com.redhat.sorting.selectors.serialize.SerializatorSelectorImpl;
import com.redhat.sorting.serialization.JsonSerializator;
import com.redhat.sorting.serialization.PlainDataSerializator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SerializationSelectionTest {

    @Test
    public void selectJsonSerialization() {
        CommadLineParser cmdParser = new CommadLineParser();
        SerializatorSelectorImpl selector = new SerializatorSelectorImpl();
        cmdParser.setTypeOfContent("json");
        assertEquals(new JsonSerializator(), selector.selectSelizator(cmdParser));
    }

    @Test
    public void selectPlainSerialization() {
        CommadLineParser cmdParser = new CommadLineParser();
        SerializatorSelectorImpl selector = new SerializatorSelectorImpl();
        cmdParser.setTypeOfContent("plain");
        assertEquals(new PlainDataSerializator(), selector.selectSelizator(cmdParser));
    }

}
