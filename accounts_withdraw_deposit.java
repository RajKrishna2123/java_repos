import java.util.Scanner;
import java.lang.Math;
public class accounts_withdraw_deposit 
{   
    public static int withdraw (int taken_amount)
    { 
        return 0 - taken_amount;       
    }
    public static int withdraw (int init_amount , int taken_amount)
    { 
        return init_amount - taken_amount;       
    }
    public static int deposite (int init_amount , int sub_amount )
    {
        return init_amount - sub_amount;
    }
    public static void main(String[] args )
    {
        long n;
        int i;  
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 10 digit account no :- ");  
        n=sc.nextInt();
        boolean x=true;
        while(x==true)
        {
            System.out.print("choose \n");
            System.out.print("choose 1. To withdraw amount from savings \n");
            System.out.print("choose 2. To deposit amount \n");
            System.out.print("choose 3. To wthidraw amount from loan \n");
            i=sc.nextInt();
            int savings=10000;
            
            if(i==1)
            {
                System.out.println("the account no choosen is "+n);
                System.out.println("enter the amount to be withdran");
                int amount=sc.nextInt();
                System.out.println("the amout taken out is "+amount+" left amount "+withdraw(savings,amount)+" in balance.");
                System.out.println();
                System.out.println("Want to countinue more transactions or quit for now :- \n 1. For more \n 2. quit");
                int j=sc.nextInt();
                if (j==1)
                {
                    continue;
                }
                else
                { 
                    break;
                }
            }
            
            else if (i==2)
            {
                System.out.println("the account no choosen is "+n);
                System.out.println("enter the amount to be deposited");
                int amount=sc.nextInt();
                System.out.println("the amout deposited is "+amount+" left amount "+deposite(savings,amount)+" in balance.");
                System.out.println();
                System.out.println("Want to countinue more transactions or quit for now :- \n 1. For more \n 2. quit ");
                int j=sc.nextInt();
                if (j==1)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            else if(i==3)
            {
                System.out.println("the account no choosen is "+n);
                System.out.println("enter the amount to be withdran");
                int amount=sc.nextInt();
                System.out.println("the amout taken out is "+amount+" left amount "+Math.abs(withdraw(amount))+" on loan.");
                System.out.println();
                 System.out.println("Want to countinue more transactions or quit for now :- \n 1. For more \n 2. quit");
                int j=sc.nextInt();
                if (j==1)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            else
            {
                System.out.println("entered cohice is incorrect try again by chooseing relevent option :-  ");
                continue;
            }
        }
        sc.close();
    }
}
