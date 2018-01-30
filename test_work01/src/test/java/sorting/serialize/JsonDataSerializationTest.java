package sorting.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.serialization.JsonSerializator;
import com.redhat.utils.Employee;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class JsonDataSerializationTest {

    @Test
    public void serializationTest() {
        JsonSerializator jsonSerializator = new JsonSerializator();
        String jsonString = "[{" +
                "\"name\":\"Irani\"" +
                "\"surname\":\"Romin\"" +
                "\"birthDate\": \"2013-03-11\"" +
                "}]";

        Employee emp = new Employee();
        emp.setName("Irani");
        emp.setSurname("Romin");
        emp.setBirthDate(Date.valueOf("2013-03-11"));
        Collection<Employee> collection = new ArrayList<>();
        collection.add(emp);
        assertEquals(jsonString,jsonSerializator.serialize(collection));
    }

    @Test
    public void emptyInputTest() {
        JsonSerializator jsonSerializator = new JsonSerializator();
        assertEquals(null, jsonSerializator.serialize(null));
    }

}
