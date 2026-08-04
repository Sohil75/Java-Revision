package BankingProject;

import java.util.Scanner;

public class BankingProject {

    static int pin =4125;
    static int accountNumber = 4545468;
    int balance =0;
    static void deposit(){
        System.out.println("Deposit");
    }
    static void withdraw(){
        System.out.println("Withdraw");
    }
    static void checkBalance(){
        System.out.println("CheckBalance");
    }
    static void exit(){
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Online Indian Banking.... ");
        System.out.println("Enter you Account Number: ");
        int acNum= sc.nextInt();
        System.out.println("Enter pin: ");
        int password = sc.nextInt();

        if(acNum == accountNumber && password== pin ){
            System.out.println("Select what brings you here today: ");
            System.out.println(1 + " Deposit");
            System.out.println(2 + " Withdraw");
            System.out.println(3 + " CheckBalance");
            System.out.println(0 + " Exit");
            int option = sc.nextInt();
            switch (option){
                case 1: {
                    deposit();
                    break;
                }
                case 2: {
                    withdraw();
                    break;
                }
                case 3:{
                    checkBalance();
                    break;
                }
                default:{
                    exit();
                }

            }

        }
        else {
            System.out.println("Check Your Credentials.. ");
        }

    }
}
