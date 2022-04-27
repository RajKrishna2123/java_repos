import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


public class linlist
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

        // setting up gui in frame
        setContentPane(new JLabel(new ImageIcon("E://wallpaper/collection/l4.jpg")));
        setLayout(new FlowLayout());
        JLabel l= new JLabel("<html><h1><center>Stack & Queue<br/>Select any one"
        +"from the following options</center></h1></html>");
        l.setForeground(Color.GREEN);
        JLabel l1= new JLabel("information pannel");
        l1.setForeground(Color.GREEN);
        JLabel l3=new JLabel("enter desired number to be added in given area below");
        l3.setForeground(Color.GREEN);
        JLabel l5=new JLabel("enter desired number to be added in given area below");
        l5.setForeground(Color.GREEN);
        JLabel l2=new JLabel("<html><center>This Project has been prepared by<br/><br/>"
        +"Name:- Raj Krishna <br/> sap_ID:- 1000015049 <br/> roll_no:- 200102297 <center></html>");
        l2.setForeground(Color.ORANGE);
        JTextArea in = new JTextArea();
        in.setColumns(30);
        JTextArea in2 = new JTextArea();
        in2.setColumns(30);
        JButton push = new JButton ("push");
        JButton pop = new JButton ("pop");
        JButton add = new JButton ("add");
        JButton delete = new JButton ("delete");
        JButton act = new JButton ("get Linked List");
        act.setBounds(100,80,200,50);
        JRadioButton stack = new JRadioButton("stack");
        JRadioButton queue = new JRadioButton("queue");
        
        //creating button group to be selected at once
        ButtonGroup MyOptiongroup = new ButtonGroup();
        MyOptiongroup.add(stack);
        MyOptiongroup.add(queue);
        
        //defining pannels
        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();


        //creating a linked list
        LinkedList<Integer> li = new LinkedList<>();
        System.out.println(li);
        for (i=0;i<=9;i++)
        {
            x= 1 + (int) (Math.random() * 1000);
            li.push(x);
        }
        System.out.println(li);
        
        //adding pannels to the jfram serially 
        p0.add(l);

        p1.add(stack);
        p2.add(queue);
        p1.add(l3);
        p1.add(in);
        p1.add(push);
        p1.add(pop);

        p2.add(l5);
        p2.add(in2);
        p2.add(add);
        p2.add(delete);

        p5.add(l1);
        p3.add(act);

        p4.add(l2);

        setTitle("Linked list implementation");

        //some personalisation for better appearence setting seize of each pane 
        p0.setPreferredSize(new Dimension(550,120));
        p1.setPreferredSize(new Dimension(350,130));
        p2.setPreferredSize(new Dimension(350,130));
        p3.setPreferredSize(new Dimension(350,35));
        p4.setPreferredSize(new Dimension(350,120));
        p5.setPreferredSize(new Dimension(350,100));

        //some personalisation for better appearence setting color and tranparecy level of each pane
        p0.setBackground(new Color(112,128,144,250));
        p1.setBackground(new Color(0,0,0,125));
        p2.setBackground(new Color(0,0,0,125));
        p3.setBackground(new Color(0,0,0,125));
        p4.setBackground(new Color(0,0,0,125));
        p5.setBackground(new Color(0,0,0,250));

        //implmenting action listner to the push button
        push.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {   
                
                if(stack.isSelected())
                {
                    l.setText("<html><h1>stack is selected</h1></html>");
                    int_tempo=Integer.parseInt(in.getText());
                            
                    if(li.size()!=10)
                    {   
                        li.push(int_tempo);
                        System.out.println(li);
                        System.out.println("pushed sucesfully");
                        l1.setText("pushed sucesfully");
                    }
                    else
                    {
                        System.out.println("sorry but Linked List is already full");
                        l1.setText("sorry but Linked List is already full");
                    }
                }
                else  if(queue.isSelected())
                {
                      l.setText("<html><h1><center>Queue is selected<br/>invalid push "
                      +"operation</center></h1></html>");          
                    
                }
                else
                {
                    l.setText("wrong selection");
                }
            }
        });

        //implmenting action listner to the pop button
        pop.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if(stack.isSelected())
                {   
                    l.setText("<html><h1>stack is selected</h1></html>");
                    if(li.size()<=10 || li.size()<=1)
                    {
                        li.pop();
                        System.out.println("poped sucesfully");
                        l1.setText("poped sucesfully");
                    } 
                    else 
                    {
                        System.out.println("linkd list already empty");
                        l1.setText("linkd list already empty");
                    }
                                 
                }
                
                else  if(queue.isSelected())
                {
                      l.setText("<html><h1><center>Queue is selected<br/>invalid"
                      +" pop operation</center></h1></html>");          
                    
                }
                else
                {
                    l1.setText("wrong selection");
                }
            }
        });

        //implmenting action listner to the add button
        add.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {   
                
                if(stack.isSelected())
                {
                    l.setText("<html><h1><center>Stack is selected<br/>invalid"
                    +" add operation</center></h1></html>");          
                }
                else  if(queue.isSelected())
                {
                    
                    l.setText("<html><h1>Queue is selected</h1></html>");
                    int_tempo=Integer.parseInt(in2.getText());
                    if(li.size()!=10)
                    {   
                        li.push(int_tempo);
                        System.out.println(li);
                        System.out.println("added sucesfully");
                        l1.setText("added sucesfully");
                    }
                        
                    
                    else
                    {
                        System.out.println("sorry but Linked List is already full");
                        l1.setText("sorry but Linked List is already full");
                    }         
                    
                }
                else
                {
                    l.setText("<html><h1><center>Stack is selected<br/>invalid "
                    +"add operation</center></h1></html>");
                }
            }
        });

        //implmenting action listner to the delete button
        delete.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if(stack.isSelected())
                {
                      l.setText("<html><h1><center>stack is selected<br/>invalid "
                      +"delete operation</center></h1></html>");          
                }
                else  if(queue.isSelected())
                {
                    l.setText("<html><h1>Queue is selected</h1></html>");
                    if(li.size()<=10 || li.size()<=1)
                    {
                        li.removeLast();
                        System.out.println("deleted sucesfully");
                        l1.setText("deleted sucesfully");
                    } 
                    else 
                    {
                        System.out.println("linkd list already empty");
                        l1.setText("linkd list already empty");
                    }          
                    
                }
                else
                {
                    l.setText("<html><h1><center>stack is selected<br/>invalid"
                    +" delete operation</center></h1></html>");
                }
            }
        });
        
        //implmenting action listner to the act button
        act.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   
                Object[] arr = li.toArray();
                System.out.println(arr);
                if(li.size()==10)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+","+arr[8]+","+arr[9]+"]</center></html>";
                else if(li.size()==9)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+","+arr[8]+"]</center></html>";
                else if(li.size()==8)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+"]</center></html>";
                else if(li.size()==7)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+"]</center></html>";
                else if(li.size()==6)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+"]</center></html>";
                else if(li.size()==5)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+"]</center></html>";
                else if(li.size()==4)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+"]</center></html>";
                else if(li.size()==3)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+","+arr[2]+"]</center></html>";
                else if(li.size()==2)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+","+arr[1]+"]</center></html>";
                else if(li.size()==1)   
                tempo="<html><center>current values in linkedlist  :-  <br/>["+arr[0]+"]</center></html>";
                else
                tempo="linkdlist is empty now :( ";


                System.out.println(tempo);
                l1.setText(tempo);
            }
        }
        );
        
        //adding all panneles to JFrame
        add(p0);
        add(p1);
        add(p2);
        add(p5);
        add(p3);
        add(p4);

        //seting up some common atttributes 
        setVisible(true);
        setSize(550,750); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
            
    }
   
}