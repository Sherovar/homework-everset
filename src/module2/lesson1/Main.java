package src.module2.lesson1;

public class Main {
    public static void main(String[] args) {
        Wallet mainWallet = new Wallet();
        mainWallet.deposit(1000);
        InvestmentCalculator investmentCalculator = new InvestmentCalculator(mainWallet, 1000, 5);
        double profit = investmentCalculator.calculateEarnings(3);
        Wallet depositWallet = investmentCalculator.getWallet();
        System.out.printf("Текущая сумма вклада: %3f%n Баланс кошелька: %3f", depositWallet.getBalance(), profit);
        System.out.println("\n" + mainWallet.getBalance());
    }
}
