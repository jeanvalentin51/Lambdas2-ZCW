import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void getAge() {

        Person testPerson = new Person("Joe",null,42,null, Person.Sex.MALE);

        Integer expected = 42;
        Integer actual = testPerson.getAge();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getName() {
        Person testPerson = new Person("Joe",null,42,null, Person.Sex.MALE);

        String expected = "Joe";
        String actual = testPerson.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void printPersonsOlderThan() {
    }
}