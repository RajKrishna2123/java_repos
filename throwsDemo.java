import java.io.IOException;
import java.util.*;
class ThrowsEx {
    private int name;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name = ");
        name=sc.nextInt();
        sc.close();
    }
    void display ()
    {
        System.out.println("name"+name);
    }
}
class throwsDemo
{
    public static void main (String[] args) throws IOException
    {
        ThrowsEx ab= new ThrowsEx();
        ab.accept();
        ab.display();

    }
}



