import java.util.*;
public class sort_name
{
    public static void main(String[] args) 
    {   
        System.out.print("Name :- Shubham Kumar Singh \nSection :- I"+
                        "\nroll no :- 200102299\nSap Id :- 1000015053\n");
        String[] x = new String[10];
        int z;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Names :");
        for(int i = 0; i<10; i++) 
        {
            x[i] = sc.next();
        }
        for(int j = 0; j<10; j++) 
        {
            for(int i = 0; i<(9-j); i++ )
            {
                z = x[i].compareTo(x[i+1]);
                if(z == 0 || z<0)
                {
                    continue;
                }
                else 
                {
                    temp = x[i+1];
                    x[i+1] = x[i];
                    x[i] = temp;
                }
            }
        }
        System.out.print("Names after sorting are as follows: ");
        for(int i = 0; i<10; i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
