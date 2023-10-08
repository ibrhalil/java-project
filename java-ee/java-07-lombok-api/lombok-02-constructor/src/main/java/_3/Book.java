package _3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    private long id;
    private String name;
    private int page;
}

class TestMain{
    public static void main(String[] args) {
        Book book = new Book(11,"Nutuk",543);

        System.out.println(book.getName());
        System.out.println(book.getPage());
    }
}
