import java.util.concurrent.locks.ReentrantLock;

class Task 
{
    String S;
    ReentrantLock r ;
    Task(ReentrantLock r, String s)
    {
        this.r=r;
        this.s=s;
    }
    public void run()
    {
        r.lock();
        try 
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(s);
            }
            try{

            }
        }
    }


}
class test99 
{
    public static void main(String[] args)
    {
        ReentrantLock l = new ReentrantLock();
        Task T=new Task(l,"Hello");
        Task T1=new Task(l,"World");
        T.start();
        T1.start();
        // TR t1=new TR("Hello");
        // TR t2=new TR(" ");
        // t1.start();
        // t2.start();
    }
}
