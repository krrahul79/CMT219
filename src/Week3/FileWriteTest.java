package Week3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteTest{
    public static void main(String args[]){
        FileWriter writer = null;
        try {
            writer = new FileWriter( "times5.txt" );
            PrintWriter out = new PrintWriter( writer );
            for(int i = 0; i<10; i++){
                out.println(5*i);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
