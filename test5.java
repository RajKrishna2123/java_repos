import java.util.concurrent.locks.ReentrantLock;

class Task extends Thread
{
    String S;
    ReentrantLock r =new ReentrantLock();
    Task(String s)
    {
        this.S=s;
    }
    public void run()
    {
        r.lock();
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(S);
            }
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {}
        }
        catch(Exception ex)
        {

        }
        finally
        {
            r.unlock();
        }
    }


}
class test5 
{
    public static void main(String[] args)
    {
        Task T=new Task("Hello");
        Task T1=new Task("World");
        T.start();
        T1.start();
        // TR t1=new TR("Hello");
        // TR t2=new TR(" ");
        // t1.start();
        // t2.start();
    }
}
