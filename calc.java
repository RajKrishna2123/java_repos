import java.util.Scanner;
public class calc
{
    public static void main(String args[]) 
    {

        int x, y, sol = 0,cho;        
        char operator;
        Scanner in = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Enter 1st no numbers: ");
            x = in.nextInt();
            System.out.println("Enter 2nd no numbers: ");
            y = in.nextInt();
            System.out.println();
            System.out.println("Enter operator: ");
            operator = in.next().trim().charAt(0);
            switch(operator) 
            {
                case '+':                
                {
                    sol = x + y;
                    break;
                }
                case '-':
                {   
                    sol = x - y;
                    break;
                }
                case '*':
                {
                    sol = x * y;
                    break;
                }
                case '/': 
                {
                    if (x != 0) 
                    {
                        sol = x / y;
                        break;
                    }
                    else 
                    {
                        System.out.println("undefined not possible");
                    }
                }
                case '%':
                {
                    sol = x % y;
                }
            } 
            System.out.println("Result: " + sol);
            System.out.println("want to countinue 0-no 1-yes");
            cho=in.nextInt();
            if (cho==0)
            {
                break;
            }
            else
            {
                continue;
            }
        }
    }
}
    

