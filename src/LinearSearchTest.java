import java.util.Random;

public class LinearSearchTest {
    public static void main(String args[]){
        int []data = new int[10];
        Random r = new Random();
        for(int i = 0; i<10;i++){
            data[i] = r.nextInt(10);
            System.out.print(data[i] + " ");
        }

        LinearSearchThread t1 = new LinearSearchThread(data, 0, 4, 7);
        LinearSearchThread t2 = new LinearSearchThread(data, 5, 9, 7);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("t1 pos"+t1.getFoundpos());
//        System.out.println("t2 pos" +t1.getFoundpos());
        if(t1.getFoundpos()!=-1){
            System.out.println("pos"+ t1.getFoundpos());
        }
        if(t2.getFoundpos()!=-1){
            System.out.println("pos"+t2.getFoundpos());
        }
    }
}
