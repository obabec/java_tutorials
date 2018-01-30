package sorting.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.parse.PlainDataParser;
import com.redhat.sorting.utils.Employee;
import org.junit.Test;
import sorting.DataStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParseTest {

    @Test
    public void correctJsonParseTest() {
        JsonDataParser jsonDataParser = new JsonDataParser();
        byte[] jsonData = null;
        File f = new File("tmp.json");
        Employee emp = new Employee();
        emp.setName("Pavel");
        emp.setSurname("Macek");
        emp.setBirthDate(Date.valueOf("2002-08-11"));
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(f,emp);
            jsonData = Files.readAllBytes(f.toPath());
            f.delete();
            assertEquals(emp,jsonDataParser.parseData(jsonData));
        } catch (IOException e) {
            e.printStackTrace();
        } try {
            String outputParse = objectMapper.writeValueAsString(emp);
            assertEquals(jsonData.toString(),outputParse);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void correctPlainParseTest() {
        List parserOutputList = null;
        DataStream dataStreamer = new DataStream();
        dataStreamer.setFilerino(new File("tempParseTest.tmp"));
        Collection c = new ArrayList();
        c.add("Svete");
        c.add("Ahoj");
        c.add("!");
        dataStreamer.createFile(c);
        List controlList = new ArrayList(c);

        try {
            byte[] data = Files.readAllBytes(dataStreamer.getFilerino().toPath());
            dataStreamer.destroyFilerino();
            PlainDataParser plainDataParser = new PlainDataParser();
            parserOutputList = plainDataParser.parseData(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(controlList,parserOutputList);
    }

    @Test
    public void emptyByteTest() {
        PlainDataParser parser = new PlainDataParser();
        byte[] bytes = null;
        assertEquals(null,parser.parseData(bytes));
    }

}
