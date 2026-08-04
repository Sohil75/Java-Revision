package Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,5,6};
        printArray(arr);
        System.out.println();
        System.out.println(sumOfArray(arr));
        System.out.println(avgOfArray(arr));
    }
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int sumOfArray(int[] arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    static int avgOfArray(int[] arr){
        int avg=0;
        int sum =sumOfArray(arr);
        for(int i =0;i<arr.length;i++){
            avg = sum/arr.length;
        }
        return avg;
    }

}
