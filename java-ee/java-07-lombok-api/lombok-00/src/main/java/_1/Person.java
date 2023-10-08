package _1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private long id;
    private String name;
    private String surname;
    private int age;
}
