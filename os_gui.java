import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


public class os_gui
{
    public static void main(String[] args) 
    {
        gui obj = new gui();
    }
}

class gui extends JFrame 
{
    public gui()
    {
        setTitle("shecduling representation");
        JPanel p=new JPanel();
        p.setPreferredSize(new Dimension(150,120));
        p.setBackground(new Color(112,128,144,250));

          
        JComboBox dropdown_menu=new JComboBox();
        dropdown_menu.addItem("")

        p.add(popupMenu);
        add(p);
        
        setVisible(true);
        setSize(550,650); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
class output extends JFrame
{

}