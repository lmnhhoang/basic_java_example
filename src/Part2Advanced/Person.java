package Part2Advanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static List<Person> getListPerson() {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John", 12));
        listPerson.add(new Person("Peter", 15));
        listPerson.add(new Person("John", 17));
        listPerson.add(new Person("Tom", 21));
        return listPerson;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    Comparator<Person> compByName = (Person o1, Person o2) -> o1.getName().compareTo(o2.getName());
    //Comparator<Person> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());

}
