import java.util.ArrayList;

public class Loader {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>() {{
            add(new Developer("Andrew", "111", "java"));
            add(new Developer("Bob", "222", "c++"));
            add(new Developer("John", "333", "python"));
            add(new Employee("Clark", "444"));
            add(new BackendDeveloper("John", "555", "PHP", "PHP/Symphony/JS"));
            add(new Person("Albert"));
        }};

        for (Person person : people) {
            if (person instanceof BackendDeveloper) {

                person.greet();
                ((BackendDeveloper) person).doWork();
                ((BackendDeveloper) person).writeCode();
                ((BackendDeveloper) person).printStack();
            }
            else if (person instanceof Developer) {

                person.greet();
                ((Developer) person).doWork();
                ((Developer) person).writeCode();
            }
            else if (person instanceof Employee) {

                person.greet();
                ((Employee) person).doWork();
            }
            else if (person instanceof Person) {

                person.greet();
            }


        }
    }
}















