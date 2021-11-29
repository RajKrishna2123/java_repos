// write a program to find out a particular name among 10 names 
import java.util.*;
import java.lang.*;
public class java_lab_8 {
    
    static String []  x = new String [10];
    String w;
   
    public static void input()
    {   
          
        Scanner sc =new Scanner (System.in);
        System.out.println("enter 10 name countinously :-");
        for(int i=0;i<10;i++)
        {
            x[i]=sc.nextLine();
        }
        
    }
    public static void find()
    {   
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the name to be found :-");
        String w=sc.nextLine();
        int s=1;
        for(int i=0;i<10;i++)
        {
            if(x[i].compareTo(w)==0)
            {
                // System.out.println("found! its in string");
                s=0;
                break;
            }
        }
        if (s==0)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
    public static void main (String[] args)
    {   
        System.out.print("Name :- Shubham Kumar Singh  \nSection :- I"+
                "\nroll no :- 200102299\nSap Id :- 1000015053\n");
        input();
        
        find();
        
    }
        
}
