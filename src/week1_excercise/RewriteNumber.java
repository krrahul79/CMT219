package week1_excercise;

import java.util.Scanner;

public class RewriteNumber {
    public static void main( String args[] ) {
        Scanner in = new Scanner( System.in );

        System.out.println( "Enter an integer between 0 and 9" );
        int num = in.nextInt();
        if(num == 1){
            System.out.println("One");
        }
        else if(num == 2){
            System.out.println("Two");
        }
        else{
            System.out.println("Unknown number");
        }

        switch (num){
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
