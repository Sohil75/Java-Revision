package String;

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Bannana";

        String result = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'){
               result = result + 'o';
            }
            else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
