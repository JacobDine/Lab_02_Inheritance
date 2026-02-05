import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Year;

class PersonTest {

    @Test
    void testConstructorAndToString() {
        Person p = new Person("12345", "John", "Doe", "Mr.", 1970);
        String expected = "Person{IDnum='12345', firstName='John', lastName='Doe', title='Mr.', YOB=1970}";
        assertEquals(expected, p.toString());
    }

    @Test
    void testSetters() {
        Person p = new Person("12345", "John", "Doe", "Mr.", 1970);

        p.setFirstName("Jane");
        p.setLastName("Smith");
        p.setTitle("Dr.");
        p.setYOB(1980);

        assertEquals("Jane", p.getFirstName());
        assertEquals("Smith", p.getLastName());
        assertEquals("Dr.", p.getTitle());
        assertEquals(1980, p.getYOB());
    }

    @Test
    void testFullnameAndFormalname() {
        Person p = new Person("12345", "John", "Doe", "Mr.", 1970);
        assertEquals("John Doe", p.fullname());
        assertEquals("Mr. John Doe", p.formalname());
    }

    @Test
    void testGetAge() {
        Person p = new Person("12345", "John", "Doe", "Mr.", 2000);
        int currentYear = Year.now().getValue();
        assertEquals(currentYear - 2000, p.getAge());
        assertEquals(2026 - 2000, p.getAge(2026));
    }

    @Test
    void testCSV_JSON_XML() {
        Person p = new Person("12345", "John", "Doe", "Mr.", 1970);

        assertEquals("12345, John, Doe, Mr., 1970", p.toCSV());

        String jsonExpected = "{\"IDnum\":\"12345\",\"firstName\":\"John\",\"lastName\":\"Doe\",\"title\":\"Mr.\",\"YOB\":1970}";
        assertEquals(jsonExpected, p.toJSON());

        String xmlExpected = "<person><IDnum>12345</IDnum><firstName>John</firstName><lastName>Doe</lastName><title>Mr.</title><YOB>1970</YOB></person>";
        assertEquals(xmlExpected, p.toXML());
    }

    @Test
    void testEquals() {
        Person p1 = new Person("000006", "John", "Doe", "Mr.", 1970);
        Person p2 = new Person("000006", "Jane", "Smith", "Dr.", 1980);
        Person p3 = new Person("000007", "Alice", "Griffin", "Ms.", 1990);

        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }
}
