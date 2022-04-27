import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable
{	
    public static int sum=0;
    
	public void run()
	{         
	    sum+=1;
	}
}
class graded_lab_3 extends Task
{
    public static void main(String[] args)
	{   

		System.out.println("Initialising Threads");

        ExecutorService myPool = Executors.newFixedThreadPool(1000);
        
        for(int i = 0 ; i < 1000;i++)
        {
            myPool.execute(new Task());
        }
        
        System.out.println( "Executing threads >> sum = " + sum );
        
        myPool.shutdown();

        System.out.println( "Thread Terminated >> sum = " + sum );
    }
}

