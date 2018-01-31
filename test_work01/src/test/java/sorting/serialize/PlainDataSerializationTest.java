package sorting.serialize;

import com.redhat.sorting.serialization.PlainDataSerializator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class PlainDataSerializationTest {
    @Test
    public void serializationTest() {
        PlainDataSerializator serializator = new PlainDataSerializator();
        Collection collection = new ArrayList();
        collection.add(5);
        collection.add(12);
        collection.add(8);
        collection.add(25);
        String controllString = "5, 12, 8, 25";
        assertEquals(controllString,serializator.serialize(collection));
    }

    @Test
    public void emptyInputTest() {
        PlainDataSerializator serializator = new PlainDataSerializator();
        assertEquals(null, serializator.serialize(null));
    }
}
