import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void lambdaSearch() {
        Person person1 = new Person("Joe",null,24,null, Person.Sex.MALE);
        Person person2 = new Person("Jane",null,35,null, Person.Sex.FEMALE);

        List<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);

        Search.lambdaSearch(testList, 26);

    }

    @Test
    public void printPersons() {
        Person person1 = new Person("Joe",null,24,null, Person.Sex.MALE);
        Person person2 = new Person("Jane",null,35,null, Person.Sex.FEMALE);

        List<Person> testList = new ArrayList<>();
        testList.add(person1);
        testList.add(person2);

        Search.printPersons(testList, person2);



    }
}