import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("Learn Java", "CodeClan", "SiFi");
    }

    @Test
    public void hasTitle(){
        assertEquals("Learn Java", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("CodeClan", book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("SiFi", book.getGenre());
    }
}
