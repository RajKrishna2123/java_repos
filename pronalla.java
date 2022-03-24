import java.util.*;   //imported all no need to specify any specific
import java.lang.*;
import javax.swing.JOptionPane;     //including GUI

public class pronalla 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,count,choice,test=0;
  


    
        while(test==0)
        {
            System.out.println("enter any no between 1 to 100");
            try
            {
                String a=JOptionPane.showInputDialog( "enter any inteeger 1" );
                count = Integer.parseInt(a);
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                +"enter same value again it shuold"
                                +" be between 0-100");
                sc.nextLine();          //written to flush sc cause it don't do itself 
                continue;
            }
            //--------check whether input is in valid range or not---------\\
            if(count>=0 & count<=100)
            {   
                break;
            }
            else
            {
                System.out.println("entered value was incorrect!!!!"
                              +"enter same value again it shuold"
                              +" be between 1-100"                  );
                continue;
            }
        }
    }
    
}
