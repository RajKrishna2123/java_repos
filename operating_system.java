import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


public class operating_system
{
    public static void main(String[] args) 
    {
        gui obj = new gui();
    }
}

class gui extends JFrame 
{
    //defining all important variables    
    JButton pop,push,add,delete;
    JRadioButton stack,queue;
    int x,i,int_tempo,dump;
    String tempo,k;
    public gui()
    {   
        setLayout(new FlowLayout());
        JLabel l= new JLabel("<html><h1 align='left'>INPUT</h1></html>");
        add(l);
        setVisible(true);
        setSize(550,750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}