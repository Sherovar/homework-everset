package src.module2.task3.ex3;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s balace=$%.2f", customer, balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if (amount > balance){
            System.out.println("Amount withdraw exceeds the current balance!");
        } else {
            balance -= amount;
        }
        return this;
    }
}
