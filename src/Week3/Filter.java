package Week3;

import java.io.*;
import java.util.Scanner;

public class Filter{
    public static void main(String args[]){
        try {
            if(args.length < 2){
                System.out.println("Need atleast 2 arguments");
            }
            else if(args.length == 2){
                String filmName = args[1];
                String word = args[0];
                String filterFile = args[2];
                Scanner sc = new Scanner(new File(filmName));
                try{
                    FileWriter filewriter = new FileWriter(filterFile);
                    PrintWriter out = new PrintWriter(filewriter);
                    while(sc.hasNextLine()){
                        String eachLine =  sc.nextLine();
                        if(eachLine.contains(word)){
                            out.println(eachLine);
                        }
                    }
                }catch(IOException e){
                    System.out.println(e);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}