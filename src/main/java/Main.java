
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Алгоритмы", "Кормен", 1990);
        System.out.println(book);
        book.up();
        book.up();
        book.up();
        book.append("java");
        book.append("book");
        System.out.println(book);

    }
}
