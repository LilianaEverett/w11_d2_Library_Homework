import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Borrower person;

    @Before
    public void before(){
        library = new Library("Edinburgh's Library", 3);
        book1 = new Book("ULYSSES", "James Joyce", "Épic");
        book2 = new Book("THE GREAT GATSBY", "F. Scott Fitzgerald", "Romance");
        person = new Borrower("Liliana");
    }

    @Test
    public void hasName(){
        assertEquals("Edinburgh's Library", library.getName());
    }

    @Test
    public void canAddBook(){
        library.add(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canNotAddBookNotEnoughCapacity(){
        library.add(book1);
        library.add(book1);
        library.add(book2);
        library.add(book2);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.add(book1);
        library.add(book2);
        library.removeBook(book1);
        assertEquals(1, library.countBooks());
    }

//    @Test
//    public void borrowBook(){
//        library.borrowBook(book1, person);
//        library.add(book1);
//        library.add(book1);
//        library.add(book2);
//        assertEquals(1, person.borrowedBooksCount());
//        assertEquals(2, library.countBooks());
//    }



}
