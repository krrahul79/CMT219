
import java.io.*;
import java.util.Scanner;

public class Find {
    public static void main(String args[]){
      int count = 0;
        if(args.length != 2){
            System.out.println("Two arguments are expected");
        }
        else{
            String fileName = args[0];
            String actor = args[1];
            try {
                Scanner sc = new Scanner(new File(fileName));
                while(sc.hasNextLine()){
                    String s = sc.nextLine();
                    if(actor.equalsIgnoreCase(s)){
                        System.out.println(s);
                        count++;
                    }
                }
                if(count > 0){
                System.out.println("Keyword matched in "+ count + " lines");
                }
                else{
                  System.out.println("No matches found");  
                }


            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        }
    }
}
