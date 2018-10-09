import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(5);
        book1 = new Book("Learn Java", "CodeClan", "SiFi");
        book2 = new Book("Lethal White: Cormoran", "Robert Galbraith", "Mystery");
        book3 = new Book("Set In Darkness", "Ian Rankin", "Crime");
        book4 = new Book("Harry Potter 1", "J K Rowling", "Fantasy");
        book5 = new Book("Harry Potter 2", "J K Rowling", "Fantasy");


    }

    @Test
    public void getBorrowersBooks() {
        assertEquals(0, borrower.getBooks());
    }

    @Test
    public void canTakeBooks() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        borrower.borrowBooks(book1, library);
        borrower.borrowBooks(book2, library);

        assertEquals(2, borrower.getBooks());
        assertEquals(3, library.countBooks());
    }
}
