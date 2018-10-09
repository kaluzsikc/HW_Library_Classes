import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBook;

    public Borrower(){
        this.borrowedBook = new ArrayList<>();
    }

    public int getBooks() {
        return borrowedBook.size();
    }

    public void borrowBooks(Book book, Library library) {
        if (borrowedBook.add(book)) {
            library.removeBook(book);
        }
    }
}
