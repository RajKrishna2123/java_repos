// class thread_A extends Thread 
// {
//     public void run()
//     {
//         for(int  i=1;i<=5;i++)
//         {
//             System.out.println(i);
//         }
//     }    
// }
// class thread_B extends Thread 
// {
//     public void run()
//     {
//         for(int  i=6;i<=10;i++)
//         {
//             System.out.println(i);
//         }
//     }    
// }
// class thread_C extends Thread 
// {
//     public void run()
//     {
//         for(int  i=11;i<=15;i++)
//         {
//             System.out.println(i);
//         }
//     }    
// }
class test extends Thread
{
    int x,y;
    test(int a, int b)
    {
        x=a;y=b;
    }
 
    public void run()
    {
        for(int i=this.x;i<=this.y;i++)
        {
            System.out.println(i);
        }
    } 
}
class threading
{
    public static void main (String[] args)
    {
        test Thread_A=new test(1,5);
        test Thread_B=new test(6,10);
        test Thread_C=new test(11,15); 
        Thread_A.start();
        Thread_B.start();
        Thread_C.start();
    }
}