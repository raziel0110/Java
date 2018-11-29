package object.container.homework;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
