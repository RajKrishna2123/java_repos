import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class testy
{
    public static void main(String[]args)
    {
        ArrayList <Integer>arr= new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            arr.add((int)(Math.random()*100));
        }
        System.out.println("Original List of random numbers:"+arr);
        Collections.sort(arr);
        System.out.println("Sorted List of random numbers"+arr);
        Set arrSet=new HashSet(arr);
        System.out.println("Sorted list of random numbers with duplicates removed,ifany:"+arrSet);
    }
}