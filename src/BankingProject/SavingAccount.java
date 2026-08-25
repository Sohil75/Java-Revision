package BankingProject;

public class SavingAccount extends BankAccount {
    public SavingAccount(int accountNumber, int pin, int balance) {
        super(accountNumber, pin, balance);
    }

    public double  calculateInterest(){
     double balance = checkBalance();
     double anualrate = 0.04;
     double monthlyrate = anualrate /12;

     for(int i =0;i<=12;i++){
         double interestThisMonth = balance * monthlyrate;
         balance = balance + interestThisMonth;
     }
     return balance;

    }

}
