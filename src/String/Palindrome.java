package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aba";
        if (str.equals(reverseString(str))){
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println(str + " is not palindrome");
        }

        // string builder method
        String check = "aba";
        if (check.equals(reverseStringBuilder(check).toString())){
            System.out.println( " is palindrome");
        }
        else {
            System.out.println( " is not palindrome");
        }

        //two pointer method
        if(isPalindrome(str)){
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println(str + " is not palindrome");
        }

    }
    static String reverseString(String str ){
        str = str.toLowerCase();
        String rev = "";
        for(int i =str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
    //String Builder Method
    static  StringBuilder reverseStringBuilder(String str){
        StringBuilder rev = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        return rev;
    }

    //two pointer method
    static boolean isPalindrome(String str){
        if(str == null)
            return false;

        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
