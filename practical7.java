import java.util.*;
class practical7 
{
    int teacherid;
    String name;
    String dept;
    String subject;
    void getvalues()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher i'd : ");
        teacherid = sc.nextInt();
        System.out.print("Enter name : ");
        name = sc.next();
        while(true) 
        {
            System.out.println("Choose type : ");
            System.out.println(" 1. Programming Teacher");
            System.out.println(" 2. Theory Teacher");
            int temp = sc.nextInt();
            if(temp == 1) 
            {
                dept = "Programming Teacher";
                break;
            }
            else if(temp ==2) 
            {
                dept = "Theory Teacher";
                break; 
            }
            else 
            {
                System.out.println("Wrong choice Enter again");
            }
        }
        sc.nextLine();
        System.out.print("Enter subject allocated : ");
        subject = sc.nextLine();
        sc.close();
    }
    void display() 
    {
        System.out.println("Teacher i'd : " + teacherid);
        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);
        System.out.println("Subject : " + subject);
    }
    public static void main(String[] args) 
    {   
        System.out.print("Name :- Shubham Kumar Singh \nSection :- I"+
            "\nroll no :- 200102299\nSap Id :- 1000015053\n");
        practical7 o1 = new practical7();
        o1.getvalues();
        o1.display();
    }
}
