package day_1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int ogNumber = sc.nextInt();
        int n= ogNumber;
        int rev=0;
        while (n>0){
            int digit = n %10;
            rev= rev * 10 + digit;
            n /= 10;
        }
        System.out.println(rev);
        if(ogNumber==rev){
            System.out.println(ogNumber+ " is palindrome");
        }
        else {
            System.out.println(ogNumber+ " not palindrome");
        }
    }
}
