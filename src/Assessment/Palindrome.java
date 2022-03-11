package Assessment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char[] ch = new char[s.length()];
        }
        for (int i = 0; i < s.length(); i++) {
            char[] ch1 = new char[s.length()];
        }
         StringBuffer buff = new StringBuffer(s);
        StringBuffer reverseBuff = buff.reverse();
        String reverseString = reverseBuff.toString();
        for (int i = 0; i < s.length(); i++) {
            char[] ch2 = new char[s.length()];
        }
        if(s.equals(reverseString)){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }

    }
}
