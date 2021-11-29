import java.util.Scanner;
public class fibonacci_series_leaving_multiple_of_5 {
    public static void main(String[] args)   
    {
        int n ,count=1, first=0 ,second=1 ,sum=0 ,rest;
        Scanner sc=new Scanner(System.in);
        System.out.print("Name :- Raj Krishna \nSection :- I"+
                        "\nroll no :- 1000015049\nSap Id :- 1000015049\n");
        System.out.print("Enter the number of elements :-");
        n=sc.nextInt();
        System.out.println(sum);
        while(count<=n)
        {               
            count+=1;
            first=second; 
            second=sum;
            sum=first+second;
            rest= sum%5;
            if (rest==0)
            {
                continue;
            }
            else
            {
                System.out.println(sum);
            }
        }
        sc.close();
    }
    
}
