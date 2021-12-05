

import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static int totalAmount = 0;

    // constructor
    public BankAccount() {
        setCheckingBalance(0);
        setSavingBalance(0);

        numberOfAccounts++;
        totalAmount += getCheckingBalance() + getSavingBalance();
    }

    // methods
    public void checkingDeposit(double amount) {
        this.checkingBalance += amount;
        // setCheckingBalance(getCheckingBalance() + amount);
        totalAmount += amount;
    }

    public void savingDeposit(double amount) {
        setSavingBalance(getSavingBalance() + amount);
        totalAmount += amount;
    }

    public void checkingWithDraw(double amount) {
        setCheckingBalance(getCheckingBalance() - amount);
        totalAmount -= amount;
    }

    public void savingWithDraw(double amount) {
        setSavingBalance(getSavingBalance() - amount);
        totalAmount -= amount;
    }

    public double totalBalance() {
        return getCheckingBalance() + getSavingBalance();
    }

    public static int totalAccounts() {
        return numberOfAccounts;
    }

    public static double totalAmount() {
        return totalAmount;
    }

    // set and get
    // checkingBalance
    public void setCheckingBalance(double amount) {
        this.checkingBalance = amount;
        totalAmount += amount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    // savingBalance
    public void setSavingBalance(double amount) {
        this.savingBalance = amount;
        totalAmount += amount;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }


}