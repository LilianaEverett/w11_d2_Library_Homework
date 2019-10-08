import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }


    public void addBorrowedBook(Book book, Library library) {
        if (library.books.contains(book)) {
            this.borrowedBooks.add(book);
            library.removeBook(book);
        }
    }

    public int borrowedBooksCount() {
        return this.borrowedBooks.size();
    }
}
