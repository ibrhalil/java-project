package _2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person {
    private long id;
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class TestMain{
    public static void main(String[] args) {
        Person person = new Person();

        Person person1 = new Person("halil","AYDIN");
    }
}
