import java.awt.*;    
import javax.swing.*; 


public class pk_test 
{   
    

    public class main_menu implements ActionListener
    {   JFrame f= new JFrame();
        JButton b1 = new JButton("ADD");    
        JButton b2 = new JButton("SUBTRACT");    
        JButton b3 = new JButton("MULTIPLY");                 
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
         
        ActionListener al = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {   
        
            if (e.getSource() == b1)
            {
                String a=JOptionPane.showInputDialog( "enter any inteeger 1" );
                String b=JOptionPane.showInputDialog( "enter any inteeger 2" );

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            int m = x + y;
            JOptionPane.showMessageDialog( null, m );
        }
        else if (e.getSource() == b2)
        {
            String a=JOptionPane.showInputDialog( "enter any inteeger 1" );
            String b=JOptionPane.showInputDialog( "enter any inteeger 2" );

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            int m = x- y;
            JOptionPane.showMessageDialog( null, m );
        }
        else if (e.getSource() == b3)
        {
            String a=JOptionPane.showInputDialog( "enter any inteeger 1" );
            String b=JOptionPane.showInputDialog( "enter any inteeger 2" );

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            int m = x* y;
            JOptionPane.showMessageDialog( null, m );
        }
    }
    
        b1.addActionListener(al);
        b2.addActionListener(al);                
        b3.addActionListener(al);                

        f.setLayout(new FlowLayout());    
        f.setSize(900, 300);    
        f.setVisible(true);
};   
    
