package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr= new int[n];
       for(int i =0;i< arr.length;i++){
           arr[i]= sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));
        System.out.println(evenDigit(arr));
        System.out.println(oddDigit(arr));

    }
    static int evenDigit(int[] arr ){
        int evenCount =0;
        for (int i =0 ;i< arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
    static int oddDigit(int[] arr){
        int oddDigit = 0;
        for(int num : arr){
            if(num % 2 != 0){
                oddDigit++;
            }
        }
        return oddDigit;
    }
}
