package day_1;

import java.util.Scanner;

public class vowels_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String st= sc.next();
        int countV = 0;
        int countC= 0;
        for(int i =0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                countV++;
            }
            else {
                countC++;
            }
        }
        System.out.println("number of consonants are : " + countC);
        System.out.println("number of vowels are : " + countV);
    }
}
