package String;

public class CountUpperCaseLowerCase {
    public static void main(String[] args) {
        String str = "JaVaProGram";
        int uppercaseCount=0;
        int lowercaseCount =0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        System.out.println(uppercaseCount);
        System.out.println(lowercaseCount);
    }
}
