package Week3;

import java.util.Scanner;
import java.util.Vector;

public class ReverseInputs {
    public static void main(String[] args) {
        Vector<StringBuffer> anslist = new Vector<StringBuffer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED: \n");
        String line = sc.nextLine();
        while(line.length() != 0){
            anslist.add(new StringBuffer(line).reverse());
            line = sc.nextLine();
        }
        for(StringBuffer ans : anslist){
            System.out.println(ans);
        }

    }


}
