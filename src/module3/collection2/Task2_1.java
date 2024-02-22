package src.module3.collection2;

import java.util.ArrayList;

public class Task2_1 {

    public static void main(String[] args) {
        Product bread = new Product("Bread", 100, 5);
        Product milk = new Product("Milk", 300, 5);
        Product shampoo = new Product("Shampoo", 1020, 5);
        Product toothPaste = new Product("Tooth Paste", 2100, 5);

        Category chemical = new Category("Chemical");
        Category food = new Category("Food");

        chemical.addProduct(shampoo);
        chemical.addProduct(toothPaste);
        food.addProduct(milk);
        food.addProduct(bread);

        Basket basketOne = new Basket();
        basketOne.addProduct(bread);
        basketOne.addProduct(toothPaste);
        Basket basketTwo = new Basket();
        basketTwo.addProduct(shampoo);
        basketTwo.addProduct(milk);

        User bamboook = new User("Bamboook", basketOne);
        User fedor = new User("Fedor", basketTwo);

        System.out.println("Products:");
        System.out.println(chemical.getProducts());
        System.out.println(food.getProducts());

        System.out.println("---------------------------------------");

        System.out.println(bamboook.login + " has in basket:" + bamboook.getBasket().getProducts());
        System.out.println(fedor.login + " has in basket:" + fedor.getBasket().getProducts());


    }

}

class Product{
    String name;
    int price;
    int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

class Category{
    String name;
    ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


}
class Basket{
    ArrayList<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
}

class User{
    String login;
    Basket basket;

    public User(String login, Basket basket) {
        this.login = login;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }
}


