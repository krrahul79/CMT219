package Assessment;

import java.io.*;
import java.util.Scanner;

public class Sum
{
    public static void main(String [] args)
    {
        if (args.length != 1)
        {
            System.err.println("One argument expected!");
            System.exit(1);
        }
        String fileName = args[0];
        int sum = 0;
        try {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                String eachLine = sc.nextLine();
                String[] numbers = eachLine.split("\\s");
                for(String number : numbers){
                    try{
                        sum += Integer.parseInt(number);
                        System.out.println(number);
                    }catch (Exception e){
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        System.out.println("Sum of the numbers is : "+sum);
        // TODO: Complete the program
    }

}
