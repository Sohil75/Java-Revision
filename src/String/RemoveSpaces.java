package String;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "I Love Java";
        System.out.println(removeSpace(str));
    }

    static String removeSpace(String str){
        String result = " ";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                result += ch;
            }
        }
        return result;
    }
}
