

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();


        account1.setCheckingBalance(100);
        account1.setSavingBalance(300);
        account2.setCheckingBalance(2000);
        account2.setSavingBalance(10000);
        account3.setCheckingBalance(100);
        account3.setSavingBalance(300234);
        account4.setCheckingBalance(200);
        account4.setSavingBalance(1000000);

        System.out.println("------ACCOUNT 1 BALANCE-------");
        System.out.println(account1.totalBalance());

        System.out.println("------ACCOUNT 2 BALANCE-------");
        System.out.println(account2.totalBalance());

        System.out.println("------ACCOUNT 3 BALANCE-------");
        System.out.println(account3.totalBalance());

        System.out.println("------ACCOUNT 4 BALANCE-------");
        System.out.println(account4.totalBalance());

        System.out.println("------TOTAL ACCOUNTS-------");
        System.out.println(BankAccount.totalAccounts());

        System.out.println("------TOTAL-------");
        System.out.println(BankAccount.totalAmount());

    }
}