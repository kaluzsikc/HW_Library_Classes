import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book capacity;


    @Before
    public void before() {
        library = new Library(5);
        book1 = new Book("Learn Java", "CodeClan", "SiFi");
        book2 = new Book("Lethal White: Cormoran", "Robert Galbraith", "Mystery");
        book3 = new Book("Set In Darkness", "Ian Rankin", "Crime");
        book4 = new Book("Harry Potter 1", "J K Rowling", "Fantasy");
        book5 = new Book("Harry Potter 2", "J K Rowling", "Fantasy");
        book6 = new Book("Harry Potter 3", "J K Rowling", "Fantasy");
    }

    @Test
    public void getLibraryStock() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.countBooks());
    }

    @Test
    public void canNotAddFullCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void getLibraryCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void removeBookFromLibrary() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.removeBook(book1);
        assertEquals(4, library.countBooks());
    }

}


