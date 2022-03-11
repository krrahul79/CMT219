package Week4;

import java.util.Random;

public class MathematicalMethods {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0; i<16; i++) {
            System.out.println(r.nextInt(4)+3);
        }
        for(int i = 0; i<20; i++) {
            System.out.println((r.nextInt(4)+4)+r.nextDouble());
        }
    }
}
