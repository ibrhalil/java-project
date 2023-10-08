import _0.User;
import _1.Person;

public class TestMain {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setId(100);
        u1.setName("Halil");
        u1.setSurname("Aydın");
        u1.setAge(27);

        System.out.println(u1);



        Person p1 = new Person();
        p1.setId(100);
        p1.setName("Halil");
        p1.setSurname("Aydın");
        p1.setAge(27);

        System.out.println(p1);

    }
}
