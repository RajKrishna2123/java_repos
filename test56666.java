class Thre implements Runnable 
{
    public void run ()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
class test56666
{
    public static void main(String args[])
    {   
        Thre obj = new Thre();
        Thread T1 =new Thread(obj);
        T1.start();

    }
}