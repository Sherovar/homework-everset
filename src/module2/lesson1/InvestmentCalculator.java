package src.module2.lesson1;

public class InvestmentCalculator {
    private double initialAmount;
    private double annualInterestRate;
    private Wallet wallet;

    public InvestmentCalculator(Wallet mainWallet, double initialAmount, double annualInterestRate) {
        this.initialAmount = initialAmount;
        this.annualInterestRate = annualInterestRate / 100;
        this.wallet = new Wallet();
        mainWallet.transferTo(wallet, initialAmount);
    }

    public double calculateEarnings(int years){
        double tmp = 1 + annualInterestRate / 12;
        double result = initialAmount * Math.pow(tmp, 12 * years);
        wallet.deposit(result);
        return result;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
