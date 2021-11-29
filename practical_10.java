import java.util.*;
class practical_10 extends Exception
{
    practical_10(String msg)
    {
        super(msg);
    }
     public static void main(String args[])
    {
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of University: ");
        a=sc.nextLine();
        System.out.print("Enter the course: ");
        b=sc.nextLine();
        Except c = new Except(a,b);
        c.output();
        sc.close();
    }
}
class Except extends RuntimeException
{
    String uni_name,course; 
    Except(String a,String b)
    {
        try
        {
            if(b.compareToIgnoreCase("Java")!=0)
            {
                String msg ="Course is not java";
                practical_10 ex = new practical_10(msg);
                throw ex;
            }
        }
        catch(practical_10 e)
        {
            e.printStackTrace();
            System.exit(0);
        }
        this.uni_name=a;
        this.course=b;
    }
    void output()
    {
        System.out.println("Details: ");
        System.out.println(this.uni_name+"\n"+this.course);
    }
   
}