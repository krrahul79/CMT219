package CMT2052018;

public class MyTask extends Thread{
    private int ID;

    public MyTask(int priority, int inID){
        setPriority(priority);
        ID = inID;
    }

    public void run(){
        System.out.println("Threads " + ID + "is running");
    }
}
