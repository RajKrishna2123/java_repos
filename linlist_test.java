import java.util.*;
public class linlist_test 
{
    
    public static void main(String[] args) 
    {
    int x;
    int i;
    String tempo;
    LinkedList<Integer> li = new LinkedList<>();
    System.out.println(li);
    for (i=0;i<=9;i++)
    {
        x= 1 + (int) (Math.random() * 1000);
        li.push(x);
    }
    System.out.println(li);
    // String[] arr = li.toArray(new String[0]); 
    // System.out.println(Arrays.toString(arr));
    
    Object[] arr = li.toArray();
    System.out.println(arr);
    System.out.println(arr[0]);
    
    tempo=arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+","+arr[8]+","+arr[9];
   
    System.out.println(tempo);
    System.out.println(li.size());
    li.remove(0);
    System.out.println(li);
    li.add(9,1667);
    System.out.println(li);



    }
}