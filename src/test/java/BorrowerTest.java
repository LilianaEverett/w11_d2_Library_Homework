import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower person;
    Book book1;
    Library library;

    @Before
    public void before(){
        person = new Borrower("Liliana");
        book1 = new Book("ULYSSES", "James Joyce", "Épic");
        library = new Library("Edinburgh's Library", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Liliana", person.getName());
    }

    @Test
    public void canBorrowBook(){
        person.addBorrowedBook(book1, library);
        library.add(book1);
        assertEquals(1, person.borrowedBooksCount());
        assertEquals(0, library.countBooks());
    }
}
