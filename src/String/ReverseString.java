package String;

public class ReverseString {
    public static void main(String[] args) {
        String s = "avaj";
        System.out.println(reverseString(s));
        //built in-method
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }

    static String reverseString(String str){
        str = str.toLowerCase();
        String rev = " ";
        for(int i=str.length()-1;i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }


}
