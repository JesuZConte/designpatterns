package factory;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}



class PersonFactory
{
    static List<Person> persons = new ArrayList<>();

    public Person createPerson(String name)
    {
        // todo
        Person person = new Person(persons.size(), name);
        persons.add(person);
        return person;
    }

}
