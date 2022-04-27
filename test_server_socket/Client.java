import java.io.*;
import java.net.*;
import java.util.Scanner;
class Client
{
    public static void main(String[] args) 
    {   String c,t;
        try
        {
            String IP="192.168.111.243";
            System.out.println("Waiting for connection. . .");
            Socket s=new Socket(IP,6000);
            System.out.println("Connected");
            Scanner sc=new Scanner(System.in);
            DataOutputStream toServer=new DataOutputStream(s.getOutputStream());
            DataInputStream fromServer=new DataInputStream(s.getInputStream());
            // toServer.writeDouble(9);
            // toServer.writeDouble(8);
            toServer.writeUTF("DEEPAK GRUJI KAISE HO");

            // System.out.println(fromServer.readDouble());
            while(true)
            {
                System.out.println("CLIENT_DEEEPAK:_-"+fromServer.readUTF());
                System.out.println("REPLY:_-");
                t=sc.nextLine();
                toServer.writeUTF(t);
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}