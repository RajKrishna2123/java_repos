import javax.swing.*;

public class framework extends JFrame
{
	static JFrame f;
	static JButton b1,b2,b3,b4,b5,b6;
	static JLabel l;
	public static void main(String args[] )
	{
		f= new JFrame("yo! thats me yo yo yo yo !!!! made it hahah 😂😂😂");
		// JPanel ff=new JPanel();
		b1= new JButton("raj");
		l=  new JLabel("YO YO YO YO !!!!");
		// l=new JLabel("YOYOYOYOYOY!!!!!!");
		//setting visibility
		// f.setTitle();
		JPanel p = new JPanel();
		p.add(l);
		p.add(b1);
		
		f.add(p);
		f.setSize(1750,850);  
		f.setLayout(null);
		f.setVisible(true);
		f.show();

	}

}