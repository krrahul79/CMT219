package assessment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Extract {

    public static void main(String args[]) throws FileNotFoundException {
        extractWords();
    }


    public static List<String> extractWords() throws FileNotFoundException {
      Scanner sc = new Scanner(new File("C:\\Users\\c21100478\\OneDrive - Cardiff University\\Desktop\\Practicals\\CMT219\\src\\assessment2\\google-10000-english-no-swears.txt.txt"));
      while(sc.hasNextLine()){
          String eachLine = sc.nextLine();
          System.out.println(eachLine);
      }
      return null;
    }
}


