package Week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find{
    public static void main(String args[]){
        try {
            if(args.length < 2){
                System.out.println("Need atleast 2 arguments");
            }
            else if(args.length == 2){
                String filmName = args[1];
                String word = args[0];
                Scanner sc = new Scanner(new File(filmName));
                while(sc.hasNextLine()){
                    String eachLine =  sc.nextLine();
                    eachLine.toLowerCase();
                    if(eachLine.contains(word)){
                        System.out.println(eachLine);
                    }
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}