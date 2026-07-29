package day_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("is leap year ");
        }
        else {
            System.out.println("is not leap year");
        }
    }
}
