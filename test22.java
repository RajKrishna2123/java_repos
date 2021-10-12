import java.util.*;
public class test22 {
    public static void factorial(int n)
    {
        int x,i=1;
        for (x=n;x>0;--x)
        {
            i=i*x;
        }
        System.out.println("\nfactorial of "+n+"! is "+i);
    }
    public static void main (String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter theno till which you want factorial :-");
        int n=sc.nextInt();
        sc.close();
        factorial(n);
    }
}
