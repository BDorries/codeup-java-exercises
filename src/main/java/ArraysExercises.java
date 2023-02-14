import java.util.ArrayList;

public class ArraysExercises {
    private static Person jim = new Person("Jim");
    private static Person mary = new Person("Mary");
    private static Person aaron = new Person("Aaron");
    private static ArrayList<Person> people = new ArrayList();

    public static void main(String[] args) {
        people.add(jim);
        people.add(mary);
        people.add(aaron);
    }

    public static ArrayList<Person> addPerson(Person person){
        people.add(person);
        return people;
    }
}
