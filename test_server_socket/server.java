import java.io.*;
import java.net.*;
import java.util.Scanner;
class server
{
    public static void main(String[] args) 
    {   double x,y=1;
        String t ,c;
        try
        {
            System.out.println("Waiting for connection. . .");
            ServerSocket ss=new ServerSocket(6000);
            Socket s=ss.accept();
            System.out.println("Connected");
            Scanner sc=new Scanner(System.in);
            DataInputStream fromClient = new DataInputStream(s.getInputStream());
            DataOutputStream toClient = new DataOutputStream(s.getOutputStream());
            // x=fromClient.readDouble();
            // y=fromClient.readDouble();
            // System.out.println(fromClient.readUTF());


            
            

            // y=x;
            // for (double i=x-1;i>=1;i--)
            // {
            //     x=x*i;

            // }
            
            while(true)
            {
                System.out.println("DEVOP_RAJ_KRISHNA:_-"+fromClient.readUTF());
                t=sc.nextLine();
                toClient.writeUTF(t);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // ss.close();
            // s.close();
        }
    }
}