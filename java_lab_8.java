// write a program to find out a particular name among 10 names 
import java.util.*;
import java.lang.*;
public class java_lab_8 {
    
    static String []  x = new String [10];
    String w;
   
    public static void input()
    {        
        Scanner sc =new Scanner (System.in);
        System.out.println("enter 10 name countinously :- \n");
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
        for(int i=0;i<10;i++)
        {
            if(x[i].compareTo(w)==0)
            {
                System.out.println("found! its in string");
                break;
            }
            else 
            {
                System.out.println("not found!");
            }
        }

    }
    public static void main (String[] args)
    {   
        
        input();
        
        find();
        
    }
        
}
