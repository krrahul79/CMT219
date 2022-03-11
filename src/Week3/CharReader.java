package Week3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharReader {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader( " textfile .txt" );
            int endoffile = 0;
            while(endoffile != -1){
                int read = reader.read();
                if(read == -1){
                    endoffile = -1;
                }
                else{
                    char c = (char) read;
                    System.out.println(c);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
