public class RemoveWhiteSpaces {
    public static void main(String args[]){
        String s = "Saket Saurav        is a QualityAna    list";
        String ans = s.replaceAll("\\s","");
        System.out.println(ans);
    }
}
