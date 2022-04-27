package test_server_socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
//import java.lang.System.exit;
public class project 
{
    public static void main(String[] args) throws Exception
    {
        // gui start from here
        final String[] a = new String[1];
        LinkedList<Integer> li = new LinkedList<>();
        JFrame f = new JFrame();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,20,25);
        f.setLayout(fl);
        JLabel jls = new JLabel("Stack");
        JLabel jlq = new JLabel("Queue");
        JButton push = new JButton("PUSH");
        JButton pop = new JButton("POP");
        JButton add = new JButton("ADD");
        JButton delete = new JButton("DELETE");
        JTextArea jta = new JTextArea("the 10 random generated number Project – CSF 206 Advanced Java Programming, Even Sem, 2022 Your Name: Devansh Kumar SAP ID:1000014640 Major:cs are :-");
        jta.setColumns(12);
        jta.setRows(10);
        f.add(jta);
        JRadioButton js = new JRadioButton();
        JRadioButton jq = new JRadioButton();
        f.add(js);
        f.add(jls);
        f.add(jq);
        f.add(jlq);
        f.add(push);
        f.add(pop);
        f.add(add);
        f.add(delete);
        // actionlistener start from here
        ActionListener al1 = e ->
        {
            if (e.getSource() == js)
            {
                add.setEnabled(false);
                delete.setEnabled(false);
                push.setEnabled(true);
                pop.setEnabled(true);
            }
            else if (e.getSource()==jq)
            {
                push.setEnabled(false);
                pop.setEnabled(false);
                add.setEnabled(true);
                delete.setEnabled(true);
            } 
        };
        js.addActionListener(al1);

        jq.addActionListener(al1);
        ActionListener al = e ->    
        {
            if (e.getSource() == push) 
            {
                String ab = JOptionPane.showInputDialog("enter the number ");
                jta.setEditable(false);
                jta.setText("");
                jta.setText("the 10 random generated number are :-");
                for (int i : li) 
                {
                    String s1 = Integer.toString(i);
                    jta. append("\n" + s1);
                }
                jta.append("\n"+ab);
            }
            else if(e.getSource()==pop)
            {
                li.remove(0);
                jta.setText(" the modified list is ...");
                for(int i :li)
                {
                    String s1 = Integer.toString(i);
                    jta. append("\n" + s1);
                }
            }
        };
        ActionListener q = e -> 
        {
            if(e.getSource()==add)
            {
                a[0] =JOptionPane.showInputDialog("enter the number ");
                jta.setEditable(false);
                jta.setText("");
                jta.setText("the 10 random generated number are :-");
                jta.append(a[0]);
                for (int i : li) 
                {
                    String s1 = Integer.toString(i);
                    jta. append("\n" + s1);
                }
            }
            else if (e.getSource() == delete)
            {
                li.remove(a[0]);
                jta.setText(" the modified list ...");
                for(int i:li)
                {
                    String s2 = Integer.toString(i);
                    jta.append("\n"+s2);
                }
            }
        };

        add.addActionListener(q);
        delete.addActionListener(q);
        push.addActionListener(al);
        pop.addActionListener(al);
        f.setSize(500,300);
        f.setVisible(true);
        f.setTitle("MiniProject");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //generation of the 10 random number
        Random randomGenerator = new Random();
        for(int i =0;i<10;i++)
        {
            li.add(i, randomGenerator.nextInt(10)+1);
        }
        // printing them out
        for(int j :li) 
        {
            String s = Integer.toString(j);
            jta.append("\n"+s);
            // System.out.println(s);
        }
    }
}
