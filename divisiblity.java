import java.util.Scanner;
public class divisiblity {
    static void divi(int a,int b)
    {
        int i,temp;
        for (i=a;i<=b;i++)
        {
            temp = i%7;
            if (temp==0)
            {
            System.out.println(i+"is divisible by 7");
            }
        }
        
    }
    public static void main(String[] args)   
    {  
        int n,i;
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the starting number ");  
        n=sc.nextInt();
        System.out.println("Enter the closing number ");
        i=sc.nextInt();
        divi(n,i);
        sc.close();
    }    
    
    
}
