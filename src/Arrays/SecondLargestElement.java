package Arrays;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[] arr){
        int max= Integer.MIN_VALUE;
        int secMax =Integer.MIN_VALUE;
        for(int i =0 ;i< arr.length;i++){
            if (arr[i]>max){
                secMax = max;
                max = arr[i];
            } else if (arr[i]>secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}