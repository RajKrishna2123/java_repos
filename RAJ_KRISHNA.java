package javaCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class assignment_1 {
    public static void main(String[] args) {
String x1="10";
String x2="20";
        JFrame f = new JFrame();
FlowLayout fl = new FlowLayout();
        JButton add= new  JButton("Add");

        JButton multiply= new  JButton("Multiply");
        JButton sub= new  JButton("Subtract");
        f.setLayout(fl);
        f.add(add);
        f.add(multiply);
        f.add(sub);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(x1);
                int b=Integer.parseInt(x2);

                if(e.getSource()==add){

                    System.out.println(" addition of the number "+a+" and "+b+" is "+(a+b));
                }
                else if(e.getSource()==multiply){
                    System.out.println(" multiplication of the number "+a+" and "+b+" is "+a*b);
                }
                else if(e.getSource()==sub){
                    System.out.println(" subtraction of the number"+b+" and "+a+" is "+ (b-a));
                }
            }
        };
        add.addActionListener(al);
        sub.addActionListener(al);
        multiply.addActionListener(al);

        f.setTitle("Basic math operation ");
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
