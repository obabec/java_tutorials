package sorting.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.sorting.parse.JsonDataParser;
import com.redhat.sorting.utils.Employee;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonParseTest {

    @Test
    public void correctJsonParseTest() throws JsonProcessingException {
        JsonDataParser jsonDataParser = new JsonDataParser();
        Employee emp = new Employee();
        emp.setName("Irani");
        emp.setSurname("Romin");
        emp.setBirthDate(Date.valueOf("2012-03-11"));
        ObjectMapper objectMapper = new ObjectMapper();

        List listerino = new ArrayList();
        listerino.add(objectMapper.writeValueAsString(emp));


        byte[] jsonData = objectMapper.writeValueAsString(emp).getBytes();
        List<Employee> controllEmp = (List<Employee>) jsonDataParser.parseData(listerino);
        assertEquals(emp.getName() + emp.getSurname(),controllEmp.get(0).getName() + controllEmp.get(0).getSurname());

    }

    @Test
    public void emptyByteTest() {
        JsonDataParser parser = new JsonDataParser();
        List bytes = null;
        assertEquals(null,parser.parseData(bytes));
    }
}
