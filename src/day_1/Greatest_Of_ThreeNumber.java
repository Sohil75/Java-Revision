package day_1;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Greatest_Of_ThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a + " is greatest number");
        }
        else if (b>=a && b>=c){
            System.out.println(b + " is greatest number");
        }
        else {
            System.out.println(c + " is greatest number") ;
        }

    }
}
