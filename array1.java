import java.util.*;
class array1
{
    public static void main(String[] args)   
    {  
        int n,i;
        System.out.print("Name :- Shubham kumar singh \nSection :- I"+
                "\nroll no :- 200102299\nSap Id :- 1000015053\n");  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number of elements you want to store: ");  
        n=sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int temp;
        
        for (i=0;i<n-1;i++)
        {
            if (array[i]>array[i+1])
            {
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
        System.out.println("highest no of out of gib=ven input is : "+array[n-1]);
        sc.close();
    }      
}
