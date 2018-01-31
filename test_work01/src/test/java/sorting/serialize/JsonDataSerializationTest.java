package sorting.serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.serialization.JsonSerializator;
import com.redhat.sorting.utils.Employee;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class JsonDataSerializationTest {

    @Test
    public void serializationTest() throws JsonProcessingException {
        JsonSerializator jsonSerializator = new JsonSerializator();
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp = new Employee();
        emp.setName("Irani");
        emp.setSurname("Romin");
        emp.setBirthDate(Date.valueOf("2013-03-11"));
        Collection<Employee> collection = new ArrayList<>();
        collection.add(emp);
        assertEquals(objectMapper.writeValueAsString(collection),jsonSerializator.serialize(collection));
    }

    @Test
    public void emptyInputTest() {
        JsonSerializator jsonSerializator = new JsonSerializator();
        assertEquals(null, jsonSerializator.serialize(null));
    }

}
