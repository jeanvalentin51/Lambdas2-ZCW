import java.time.LocalDate;
import java.util.List;

public class Person implements CheckPerson{



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

    public Person(){
        this.age = null;
        this.name = null;
        this.birthday = null;
        this.gender = null;
        this.emailAddress = null;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void printPerson(String message) {
        System.out.print(message);
    }


    @Override
    public boolean test(Person p) {
        return p.gender.equals(Sex.MALE);
    }

}
