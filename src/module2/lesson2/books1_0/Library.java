package src.module2.lesson2.books1_0;

public class Library {
    private Book[] books;
    private int index = 0;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        if (index == books.length) {
            System.out.println("Library is full");
            return;
        }
        books[index++] = book;
    }

    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
