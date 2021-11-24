//for the given set of strings find the longest string from that . 
import java.util.Scanner;
import java.lang.String;
public class stringarray {
    public static void main(String[] args)
    {
        int n,i,temp;  
        Scanner sc=new Scanner(System.in);
        String[] array = new String[10];
        System.out.println("Enter the elements of the array: ");
        for (i=0;i<10;i++)
        {
            array[i]=sc.nextLine();
        }
        for (i=0;i<10;i++)
        {
            if (array[i].length()>array[i+1].length())
            {
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
    }
}
