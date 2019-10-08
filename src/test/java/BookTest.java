import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Book book2;

    @Before
    public void before(){
        book1 = new Book("ULYSSES", "James Joyce", "Épic");
        book2 = new Book("THE GREAT GATSBY", "F. Scott Fitzgerald", "Romance");

    }

    @Test
    public void hasTitle(){
        assertEquals("ULYSSES", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("James Joyce", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Épic", book1.getGenre());
    }

}
