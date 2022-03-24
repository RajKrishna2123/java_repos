import java.awt.*;    
import javax.swing.*;

public class pk2_test 
{
       public static void main (String[] args)
       {
            Frame x=new Frame("Show grid layout");           
            x.setSize(350,150);
            x.setVisible(true);
            Panel p = new Panel();                       
            Label jFirstName = new Label("First Name");
            TextField lFirstName = new TextField(20);
            Label jIM = new Label("IM");
            TextField lIM = new TextField(20);
            Label jLastName =new Label("Last Name");
            TextField lLastName=new TextField(20);            
            p.setLayout(new GridLayout(3,2));
            p.add(jFirstName);
            p.add(lFirstName);
            p.add(jIM);
            p.add(lIM);
            p.add(jLastName);
            p.add(lLastName);            
            x.add(p);
       };     
}

     