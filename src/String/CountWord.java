package String;

public class CountWord {
    public static void main(String[] args) {
        String st = "I Love Java";
        int count = 0;
        boolean isWord = false;
        for(int i =0; i< st.length();i++){
            char ch = st.charAt(i);
          if(ch==' '){
              isWord = false;
          }
          else if(!isWord){
              isWord = true;
              count++;
          }
        }
        System.out.println(count);
    }
}
