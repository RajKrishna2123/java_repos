// java Program to create a simple JPanel add components to it
import java.awt.*;
import javax.swing.*;

//A sub class is created b extending JFrame
class tempo extends JFrame
{
    // creates a JFrame
    static JFrame fr;
    
    // creates JButton
    static JButton bt, bt1, bt2;
    
    //creates JLabel that helps in displaying the text
    static JLabel lb;
    
    // main class
    public static void main(String[] args)
    {
        // A new frame is created to store buttons
        fr= new JFrame("Panel");

        // Label to display text is created
        lb= new JLabel("Panel's Label");
        
        //new buttons are created
        bt = new JButton("A Button");
        bt1 = new JButton("B Button");
        bt2 = new JButton("C Button");
        
        //Panel to add buttons is created
        JPanel p = new JPanel();
        
        //Add buttons and text field to panel
        p.add(bt);
        p.add(bt1);
        p.add(bt2);
        p.add(lb);
        
        // set the background color of panel
        p.setBackground(Color.green);
        
        // add panel to frame
        fr.add(p);
        
        // set the size of frame
        fr.setSize(1750, 850);
        fr.show();
    }
}