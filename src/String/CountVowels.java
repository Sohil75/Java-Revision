package String;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you String: ");
        String str = sc.nextLine();

        System.out.println(countVowels(str));

    }
    static int countVowels(String str){
        str = str.toLowerCase();
        int vowelCount=0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
