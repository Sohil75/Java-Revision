package String;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str = "java";
        char ch = str.charAt(0);
        str = str.substring(1);
       String st = ch + "";
      st =  st.toUpperCase();
        System.out.println(st + str);
    }
}
