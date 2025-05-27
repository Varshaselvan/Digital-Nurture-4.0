import java.util.List;

public class RecordExample {

    // Define the record
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create a list of Person records
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 17),
            new Person("Charlie", 25),
            new Person("Diana", 15)
        );

        // Print all Person instances
        System.out.println("All people:");
        people.forEach(System.out::println);

        // Filter people aged 18 or older and print
        System.out.println("\nPeople aged 18 or older:");
        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);
    }
}