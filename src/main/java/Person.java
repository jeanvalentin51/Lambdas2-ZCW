import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }


    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;
    private Integer age;


    public Person(String name, String emailAddress, Integer age, LocalDate birthday, Sex gender){
        this.age = age;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void printPerson(String name, int age) {
        System.out.print(name + " is older than " + age);
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson(p.getName(), p.getAge());
            }
        }
    }



}
