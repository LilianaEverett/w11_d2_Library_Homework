import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private String name;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public void add(Book book) {
        if (countBooks() < this.capacity) {
            this.books.add(book);
        }
    }

    public int countBooks() {
        return this.books.size();
    }


    public void removeBook(Book book) {
        this.books.remove(book);
    }
}
