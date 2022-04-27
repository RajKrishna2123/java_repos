import javax.swing.*;
import java.awt.*;
public class framework extends JFrame
{
	static JFrame f;
	static JButton b1;
	static JLabel l;
	public static void main(String args[] )
	{
		f= new JFrame("yo! thats me yo yo yo yo !!!! made it hahah 😂😂😂" );
		l= new JLabel("YO YO YO YO !!!!",JLabel.RIGHT);
		f.setContentPane(new JLabel(new ImageIcon("E://wallpaper/collection/3200x1600.jpg")));
		b1= new JButton("raj");		
		b1.setBounds(850,400,100,200);
		
		JPanel p = new JPanel();
		JPanel q = new JPanel();
		f.setLayout(new FlowLayout());
		p.add(l);
		p.setBackground(Color.ORANGE);
		p.setOpaque(true); // make transparent background
		p.setBackground(Color.LIGHT_GRAY);
		p.setPreferredSize(new Dimension(250,150));

		q.add(b1);
		q.setBackground(new Color(0,0,0,65));
		q.setPreferredSize(new Dimension(250,150));

		
		f.add(p);
		f.add(q);

		f.setSize(1750,850);  
		//f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		//f.show();

	}

}