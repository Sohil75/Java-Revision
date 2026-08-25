package BankingProject;

public class BankAccount {
    private int accountNumber;
    private int pin;
    private  int balance ;

    public BankAccount(int accountNumber,int pin,int balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance= balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
      public void deposit(int amount){
        if(amount>0) {
            balance += amount;
        }
    }
     public void withdraw(int amount ){
        if(amount > 0 && amount<=balance){
            balance -= amount;
        }
    }
     public int checkBalance(){

        return balance;
    }


}
