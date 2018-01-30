package sorting.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.utils.Employee;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;

import static org.junit.Assert.assertEquals;

public class JsonParseTest {

    @Test
    public void correctJsonParseTest() {
        JsonDataParser jsonDataParser = new JsonDataParser();
        Employee emp = new Employee();
        emp.setName("Irani");
        emp.setSurname("Romin");
        emp.setBirthDate(Date.valueOf("2012-03-11"));

        String jsonString = "{" +
                "\"name\":\"Irani\"" +
                "\"surname\":\"Romin\"" +
                "\"birthDate\": \"2013-03-11\"" +
                "}";

        byte[] jsonData = jsonString.getBytes();
        assertEquals(emp,jsonDataParser.parseData(jsonData));

    }

    @Test
    public void emptyByteTest() {
        JsonDataParser parser = new JsonDataParser();
        byte[] bytes = null;
        assertEquals(null,parser.parseData(bytes));
    }
}
