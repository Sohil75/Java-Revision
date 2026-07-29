package day_1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int res =0;
        int count=0;
        while (n>0){
            int digit = n%10;
            count++;
            res = res + digit * count ;
            n= n/10;

        }
        System.out.println(res);
    }
}
