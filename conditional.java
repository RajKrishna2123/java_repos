import java.util.*;
public class conditional {
   m
        int n ;
        Scanner in =new Scanner(System.in);
        // System.out.println("enter any no");
        n=in.nextInt();
        
        if (n>20&&n<6)
        {
            if (n%2!=0&&n!=5)
            {
            System.out.println("Weird");
            }
            else if (n>=2&&n<=5)
            {
                System.out.println("Not Weird");
            }
            else if (n>=6&&n<=20)
            {
                System.out.println("Weird");
            }
        }
        else 
        {    
                System.out.println("Not Weird"); 
        }
        in.close();       
    }    
}