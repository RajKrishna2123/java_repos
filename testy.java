import javax.swing.*;
import java.awt.*;
class testy extends JFrame
{   
    static JFrame f;
	static JButton b1;
	static JLabel l, l1;
    public static void main(String args[])
    {
        // Set title and default close operation
        f= new JFrame();
        f.setTitle("Transparent Panel");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Set a background for JFrame
        f.setContentPane(new JLabel(new ImageIcon("E://wallpaper/collection/3200x1600.jpg")));
        
        // Set some layout, say FlowLayout
        f.setLayout(new FlowLayout());
        l= new JLabel("YO YO YO YO !!!!",JLabel.RIGHT);
        l1= new JLabel("YO YO YO YO gr8!!!!",JLabel.RIGHT);
        l.setForeground(Color.GREEN);
        l1.setForeground(Color.ORANGE);
        //l.setBounds(0, 800, 120, 20);
        l.setBounds(150, 100, 150, 50);
        l1.setBounds(150, 100, 150, 50);

        

        JPanel p = new JPanel();
        // Set the background, black with 125 as alpha value
        // This is less transparent
        p.add(l);
        p.setBackground(new Color(0,0,0,125));
        
        // Create another JPanel
        JPanel q=new JPanel();
        
        // This is more transparent than the previous
        // one
        q.add(l1);
        q.setBackground(new Color(0,0,0,65));
        
        // Set some size to the panels
        p.setPreferredSize(new Dimension(800,800));
        q.setPreferredSize(new Dimension(800,800));
        
        // Add the panels to the JFrame
        f.add(p);
        f.add(q);
        
        // Set the size of the JFrame and
        // make it visible
        f.setSize(1750,850); 
        f.setVisible(true);
    }      
}
