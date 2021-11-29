import java.util.Scanner;
public class chk_no_if_else 
{
    public static void main(String[ ] arg)
    {   
        System.out.print("Name :- Shubham kumar singh \nSection :- I"+
            "\nroll no :- 200102299\nSap Id :- 1000015053\n");
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :i++;
        }
        if(i==1)
        {
            System.out.println("Entered character "+ch+" is Vowel");
        }
        else
        {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                System.out.println("Entered character "+ch+" is Consonant");
            }
            else
            {
                System.out.println("Not an alphabet");
            }
        }
        sc.close();
    }
    
}
