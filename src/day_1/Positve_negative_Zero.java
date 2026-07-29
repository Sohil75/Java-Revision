package day_1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Positve_negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check: ");
        int n = sc.nextInt();
        if(n> 0){
            System.out.println("it is a positive number");
        }
        else if(n<0){
            System.out.println("it is a negative number");
        }
        else {
            System.out.println("it is a zero");
        }
    }
}
