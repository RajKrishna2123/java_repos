import java.util.Scanner;
public class decimal {
    public static void main(String[] args) 
    {   
        System.out.print("Name :- Shubham kumar singh \nSection :- I"+
            "\nroll no :- 200102299\nSap Id :- 1000015053\n");
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter first floating ­point number:- "); 
        double num1 = sc.nextDouble(); 
        System.out.print("enter second floating­point number:- "); 
        double num2 = sc.nextDouble(); 
        sc.close();  
        if (Math.abs(num1 - num2) < 0.00001) { 
        System.out.println("These numbers are the same."); 
        } 
        else
        { 
            System.out.println("These numbers are different."); 
        } 
    } 
}
    

