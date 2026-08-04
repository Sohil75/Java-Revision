package BasicJava;

import java.util.Scanner;

//input : 1234
//output: 4321
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int res = 0;
        while(n!=0){
            int digit = n%10;
            res = res *10 + digit;
            n= n/10;
        }
        System.out.println(res);
    }
}
