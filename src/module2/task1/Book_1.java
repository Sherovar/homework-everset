package src.module2.task1;

public class Book_1 {
    private String name;
    private String author;
    private double price;
    private String type;

    public Book_1(String name, String author, double price, String type) {
        if (type.equals("Classical")){
            price *= 0.9;
        }
        else if (type.equals("Bestseller")){
            price *= 1.2;
        }
        else if (type.equals("Simple")){
        }
        else{
            return;
        }
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f", name, author, price);
    }

    public static void main(String[] args) {
        Book_1[] array = new Book_1[4];
        array[0] = new Book_1("War_and_Peace", "Tolstoy", 5000, "Classical");
        array[1] = new Book_1("Kodzima_genius", "Wulf", 8000, "Bestseller");
        array[2] = new Book_1("Hobbit", "Tolkien", 9500, "Classical");
        array[3] = new Book_1("Potter", "Rowling", 10000, "Simple");

        for (Book_1 book1 : array) {
            System.out.println(book1);
        }
    }
}
