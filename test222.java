import javax.swing.JOptionPane;
public class test222 extends JOptionPane
{
    public static void main (String[] args)
    {
        String a=JOptionPane.showInputDialog( "enter any inteeger 1" );
        String b=JOptionPane.showInputDialog( "enter any inteeger 2" );
        String c=JOptionPane.showInputDialog( "enter any inteeger 3" );


        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int m = x* y *z ;
        JOptionPane.showMessageDialog( null, m );
    }
}

