import java.util.*;
class array1
{
    public static void main(String[] args)   
    {  
        int n,i;  
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
        System.out.println("highest no of the array: "+array[n-1]); 
        System.out.println("Array elements are: ");  
        
        for (i=0; i<n; i++)   
        {  
            System.out.println(array[i]);  
        }
        sc.close();
    }      
}
