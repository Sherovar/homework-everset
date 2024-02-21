package src.library.items;

public class Book extends LibraryItem implements BorrowableItem{
    private String author;
    private String title;
    private String isbn;

    public Book(String name, boolean isAvailable, String author, String title, String isbn) {
        super(name, isAvailable);
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + super.getId() + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAvailable='" + super.isAvailable() + '\'' +
                '}';
    }
}
