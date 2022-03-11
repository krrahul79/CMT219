package CMT2052018;

public class MyTaskTest {
    public static  void main(String args[]){
        MyTask[] myTasks= new MyTask[11];
        for(int i = 1; i<=10; i++){
            myTasks[i] = new MyTask(Thread.MAX_PRIORITY,i);
            myTasks[i].start();
        }
        for(int i = 1; i<=10;i++){
            try {
                myTasks[i].join();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
