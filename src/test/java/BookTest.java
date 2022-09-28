import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private static  Book book = new Book("Математика", "Петерсон", 2021);

    @Test
    public void shouldIncreaseBooksRating() {
        int rating = book.getRating();
        book.up();
        assertEquals(rating+1, book.getRating());
    }

    @Test
    public void shouldReduceBooksRating() {
        int rating = book.getRating();
        book.down();
        assertEquals(rating-1,book.getRating());
    }

    @Test
    public void shouldAppendText() {
        String oldText = book.getText();
        String newText = "newText";
        book.append(newText);
        assertEquals(oldText+newText+ " ", book.getText());
    }
}
