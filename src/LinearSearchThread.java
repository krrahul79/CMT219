public class LinearSearchThread extends Thread{
    private int data[];
    private int start;
    private int end;
    private int number;
    private int foundpos;

   public  LinearSearchThread(int []data, int start, int end, int number){
       this.data =data;
       this.start = start;
       this.end = end;
       this.number = number;
       foundpos = -1;
   }

   public void run(){
       linearSearch(data,start,end,number);
   }

   public int getFoundpos(){
       return foundpos;
   }

    public synchronized void linearSearch(int data[], int start, int end, int number){
        for(int i = start; i<= end; i++){
            if(data[i] == number){
               foundpos = i;
            }
        }
    }
}
