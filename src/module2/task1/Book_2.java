package src.module2.task1;

public class Book_2 {
    private String title;
    private int price;
    private String type;
    private int sold;

    public Book_2(String title, int price, String type, int sold) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getSold() {
        return sold;
    }

    public int getSum(){
        int sum = 0;
        int count = sold;
        int price = type.equals("Classical") ? (int)(this.price * 0.8) : this.price;
        if (count > 50){
            sum += price * (count - 50) * 1.2;
            count = 50;
        }
        sum += count * price;
        return sum;
    }


    public static void main(String[] args) {
        Book_2[] book2s = new Book_2[6];
        book2s[0] = new Book_2("DayWithUnicorn", 5000, "Classical", 60);
        book2s[1] = new Book_2("Kodzima_genius", 5000, "Simple", 80);
        book2s[2] = new Book_2("Amphibious", 6000, "Classical", 30);
        book2s[3] = new Book_2("Parry_Hotter", 4000, "Simple", 50);
        book2s[4] = new Book_2("GoThrow", 5000, "Simple", 20);
        book2s[5] = new Book_2("LoveInWar", 6000, "Classical", 100);

        int total = 0;
        for (Book_2 book2 : book2s) {
            System.out.println(book2.getTitle() + " " + book2.getSum());
            total += book2.getSum();
        }
        System.out.println("Total = " + total);

    }
}
