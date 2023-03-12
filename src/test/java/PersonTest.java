import org.example.people.Person;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    @Test
    public void testConstructor()
    {
        Person testMe = new Person("Joe", "Smith");

        assertAll(
            () -> assertEquals("Joe", testMe.getFirst()),
            () -> assertEquals("Smith", testMe.getLast()),
            () -> assertNull(testMe.getTitle())
        );
    }
}
