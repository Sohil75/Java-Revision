package BankingProject;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123,7524,500);
        bankAccount.deposit(1000);
        System.out.println(bankAccount.checkBalance());
        bankAccount.withdraw(200);
        System.out.println(bankAccount.checkBalance());

        SavingAccount savingAccount = new SavingAccount(123,7524,1000);
        System.out.println(savingAccount.calculateInterest());


    }
}
