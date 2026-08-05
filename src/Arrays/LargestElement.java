package Arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr= new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        System.out.println();
        System.out.println("Largerst number in array: " + largestelement(arr));
        System.out.println("Smallest Element in array: " + smallestElement(arr));
        System.out.println(searchElement(arr,5));

    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    static int largestelement(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int smallestElement(int[] arr){
        int min =arr[0];
        for (int i =0 ; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int searchElement(int[] arr, int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
