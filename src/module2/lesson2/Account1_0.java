package src.module2.lesson2;

public class Account1_0 {
    private String id;
    private String name;
    private int balance = 1;

    public Account1_0(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account1_0(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (amount > balance){
            System.out.println("Amount exceeded balance");
        }
        else {
            balance -= amount;
        }
        return balance;
    }

    public int transferTo(Account1_0 another, int amount){
        if (amount > balance){
            System.out.println("Amount exceeded balance");
        }
        else{
            another.credit(amount);
            balance -= amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
