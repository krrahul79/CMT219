import java.util.Scanner;

public class Fibanocci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i = 0; i<n;i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }

}
