package _1;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Person {
    private long id;
    @Setter
    private String name;
    private String surname;
    private int age;
}

class TestMain{
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Halil");

        System.out.println(person.getName());
        System.out.println(person.getSurname());
    }
}
