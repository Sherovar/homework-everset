package src.module2.lesson1;

public class Wallet {
    private double balance;


    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void transferTo(Wallet targetWallet, double amount){
        if (this.balance >= amount){
            targetWallet.deposit(amount);
            this.withdraw(amount);
        }
    }

    public double getBalance(){
        return balance;
    }
}

