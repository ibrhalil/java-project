package _0;

import lombok.Getter;
import lombok.Setter;

public class User {
    private long id;
    @Getter
    @Setter
    private String name;
    private String surname;
    private int age;
}

class TestMain {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Halil");

        System.out.println(user.getName());
    }
}
