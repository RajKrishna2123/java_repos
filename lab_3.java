import java.awt.*;    
import javax.swing.*;    
    
public class lab_3  
{   
   
    JFrame frameObj;  
  
// constructor    
    lab_3()  
    {    
        // creating a frame object  
        frameObj = new JFrame();    
        
         // creating the buttons  
        JButton b1 = new JButton(" Button 1");    
        JButton b2 = new JButton(" Button 2");    
        JButton b3 = new JButton(" button 3");    
        JButton b4 = new JButton(" Button 4");    
        JButton b5 = new JButton(" button 5");  
        JButton b6 = new JButton(" button 6");    
 
    
         
        // adding the buttons to frame        
        frameObj.add(b1);
        frameObj.add(b2);
        frameObj.add(b3);
        frameObj.add(b4);      
        frameObj.add(b5);
        frameObj.add(b6);      
       
        // parameter less constructor is used  
        // therefore, alignment is center   
        // horizontal as well as the vertical gap is 5 units.  
        frameObj.setLayout(new FlowLayout());    
        frameObj.setSize(900, 300);    
        frameObj.setVisible(true);    
    }    
  
    // main method  
    public static void main(String args[])   
    {    
        new lab_3();    
    }    
}    