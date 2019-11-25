import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void getAge() {

        Person testPerson = new Person("Joe",null,42,null, Person.Sex.FEMALE);

        Integer expected = 42;
        Integer actual = testPerson.getAge();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getName() {
    }

    @Test
    public void printPersonsOlderThan() {
    }
}