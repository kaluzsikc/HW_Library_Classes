import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collectionOfBooks;
    private int capacity;

    public Library(int capacity) {
        this.collectionOfBooks = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if( capacity > collectionOfBooks.size()) {
            collectionOfBooks.add(book);
        }
    }

    public int getCapacity() {
        return capacity;
    }


}
