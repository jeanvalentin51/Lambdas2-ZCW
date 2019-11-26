import java.util.List;
import java.util.function.Predicate;

public class Search {

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson(p.getName() + " is a male");
            }
        }
    }

    public static void lambdaSearch(List<Person> roster, int age){
        for (Person p : roster) {
            Predicate<Person> b = x -> x.getAge() > age;
            boolean x = b.test(p);

            if (x == true) p.printPerson(p.getName() + " is over " + age);
        }
    }

}
