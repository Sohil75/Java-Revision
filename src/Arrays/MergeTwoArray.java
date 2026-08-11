package Arrays;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(MergedArray(arr,arr2)));

    }

   static int[] MergedArray(int[] arr, int[] arr2){
        int a1 = arr.length;
        int a2 = arr2.length;
        int[] MergedArray = new int[a1+ a2];
        for(int i = 0; i < arr.length; i++){
            MergedArray[i]= arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            MergedArray[a1 + i] = arr2[i];
        }
        return MergedArray;
   }
}
