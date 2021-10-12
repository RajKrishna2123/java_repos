public class overloading 
{
    double sum(int x,double y )
    {
        return x+y;
    }
    double sum(double x ,int y )
    {
        return x+y;
    }
    public static void main (String[] args)
    {
        overloading obj= new overloading();
        System.out.println(obj.sum(10.0,40));
        System.out.println(obj.sum(20,10.0));
    }
}
