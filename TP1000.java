import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TP1000 implements Runnable
{
    
    static int sum = 0;
    public static void main(String[] args) 
    {
        System.out.println("Main Method Started");
        ExecutorService myPool = Executors.newFixedThreadPool(1000);
        for(int i = 0 ; i < 1000;i++)
        {
            myPool.execute(new TP1000());
        }
        System.out.println("Without Waiting for threads to finish Value of sum: "+sum);
        myPool.shutdown();
        while(!myPool.isTerminated()){}
        System.out.println("After thread termination value of sum: "+sum);
    }

    @Override
    public void run() 
    {
        sum+=1;
    }
}
