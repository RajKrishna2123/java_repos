// question was to write this code in method (function not in the way written) so convert it to method function
import java.util.Scanner;
import java.lang.String;
public class lab2 {
    static void comp(int a , int b)
    {
        
    }
    public static void main(String[] args)
    {   
       
        int i,len1,len2,tempo=0;
        Scanner sc=new Scanner(System.in);       
        String s,k; 
        System.out.println("enter the string ");
        s=sc.nextLine();
        System.out.println("enter the 2nd string ");
        k=sc.nextLine();
        len1=s.length();
        len2=k.length();
        if (len1>len2||len1==len2)
        {
            for (i=0;i<len2;i++)
            {
                if(s.charAt(i)==k.charAt(i))
                {
                    continue;
                }
                else 
                {
                    System.out.println("enterd string is not same");
                    tempo=1;
                    break;
                }
            }
        }
        else 
        {
             for (i=0;i<len1;i++)
            {
                if(s.charAt(i)==k.charAt(i))
                {
                    continue;
                }
                else 
                {
                    System.out.println("enterd string is not same");
                    tempo=1;
                    break;
                }
            }
        }
        if (tempo==0&&len1==len2)
        {
            System.out.println("0");
        }
        // else if (tempo!=0&&len1==len2)
        // {
        //     System.out.println("strins are same lenght but not equal");

        // }
        // else if (tempo==0&&len1!=len2)
        // {
        //     System.out.println("strins are same till some extent but not equal");

        // }
        else
        {
            tempo=s.compareTo(k);
            if (tempo<0&&len1>len2)
            {
                System.out.println("+ve");
            }
            else if (tempo<0&&len1<len2)
            {
                System.out.println("-ve");
            }
            else if (tempo>0&&len1>len2)
            {
                System.out.println("+ve");
            }
            else
            {
                System.out.println("-ve");
            }

        }
    }
}
