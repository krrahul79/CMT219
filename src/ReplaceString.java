import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceString {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("abbrevations.txt"));
        Map<String, String> hmap = new HashMap<>();
        String ans = "";
        String ques = "hello world! anyone out there? it's lonely here.";
        String words[] = ques.split(" ");
//        StringBuffer ans = new StringBuffer(ques);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] specialWords = s.split(",");
            hmap.put(specialWords[0],specialWords[1]);
        }
        for(String word : words){
            if(hmap.containsKey(word)){
                ans  = ans + hmap.get(word);
            }
            else{
                ans  = ans + word;
            }
            ans = ans + " ";
        }
        System.out.println(ans);
    }
}
