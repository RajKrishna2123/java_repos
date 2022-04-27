import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test2223 implements Runnable
{
    
    static int sum = 0;
    public static void main(String[] args) 
    {
        System.out.println("Main Method Started");
        ExecutorService myPool = Executors.newFixedThreadPool(1000);
        
        for(int i = 0 ; i < 1000;i++)
        {
            myPool.execute(new test2223());
        }
        
        System.out.println("Without Waiting for threads to finish Value of sum: "+sum);
        myPool.shutdown();
        
        while(!myPool.isTerminated())
        {

        }

        System.out.println("Value to sum after termination of Thread : "+sum);
    }

    @Override
    public void run() {
        sum+=1;     
    }
}
