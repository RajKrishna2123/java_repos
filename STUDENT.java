import java.util.*;   //imported all no need to specify any specific
import java.lang.*;   //imported all no need to specify any specific
                      //will need string and math library

//------positions-------\\    //overall\\

//---------stud---------\\
// name                 =0          0
// univercity name      =1          1
// roll no              =2          2
// grade                =3          3

//---------mark---------\\

// marks_java           =0          4
// mark_co              =1          5    
// mar_dm               =2          6    
// total                =3          7
// per                  =4          8


public class STUDENT
{   
    //------------defining common public identifiers-------------//

    public static String[][] stud= new String[4][100];
    public static int[][] mark=new int[5][100];
    public static final Scanner sc = new Scanner(System.in);
    public static int i,count,choice;
    public static int test=0;

    //-----------------defineing all OBJects------------------\\

    public static   STUDENT         OBJ0    =   new     STUDENT();
    public static   name            OBJ1    =   new     name();
    public static   univercity_name OBJ2    =   new     univercity_name();
    public static   rollno          OBJ3    =   new     rollno();
    public static   marks_java      OBJ4    =   new     marks_java();
    public static   marks_co        OBJ5    =   new     marks_co();
    public static   marks_dm        OBJ6    =   new     marks_dm();
    public static   total           OBJ7    =   new     total();
    public static   per             OBJ8    =   new     per();
    public static   grade           OBJ9    =   new     grade();
    public static   table_format    OBJ10   =   new     table_format();
    public static   search          OBJ11   =   new     search();
    
    //------------displaying basic details-----------//

    void DISPLAY()
    {       
       System.out.println("Name:- Raj krishna \n"
                         +"Sap Id:- 1000015049 \n"
                         +"roll no :- 200102297 \n"
                         +"Section = 'I' \n"         );
    }
    void input()
    {   

        //-------------------defining array seize---------------------\\

        //feature no 1
        //the code below is a try catch statement to avoid any mistypeing
        //error message while input.

        while(test==0)
        {
            System.out.println("enter the no of students (max cap 100)");
            try
            {
                count = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                sc.nextLine();//written to flush sc cause it don't do itself 
                continue;
            }
            //--------check whether input is in valid range or not---------\\
            if(count>=0 & count<=100)
            {
                break;
            }
            else
            {
                System.out.println("entered value was incorrect!!!!"
                                  +"enter same value again it shuold"
                                  +" be between 1-100"                  );
                continue;
            }
        }

         //--------for loop to take input for all students---------\\

        for(i=0;i<count;i++)
        {
            OBJ1.input(i);
            OBJ2.input(i);
            OBJ3.input(i);
            OBJ4.input(i);
            OBJ5.input(i);
            OBJ6.input(i);
        }
        for(i=0;i<count;i++)
        {   
            //------for loop for dispalying the taken information------\\

            System.out.println("\n\n\n---------------------------"
            +"---------------------------------------------------"
            +"---------------------\n\n\n");
            OBJ1.display(i);
            OBJ2.display(i);
            OBJ3.display(i);
            OBJ4.display(i);
            OBJ5.display(i);
            OBJ6.display(i);
            OBJ7.calculate(i);
            OBJ7.display(i);
            OBJ8.calculate(i);
            OBJ8.display(i);
            OBJ9.grade_display(i);
            System.out.println("\n\n\n---------------------------"
            +"---------------------------------------------------"
            +"---------------------\n\n\n");
        }

    }

    public static void main(String[] args)
    {
        OBJ0.DISPLAY();

        //---------------------menu---------------------\\

        while(test==0)
        {
            System.out.println("1.	Input student data of n students");
            System.out.println("2.	Search student record by rollno (table form)");
            System.out.println("3.	Display student data sorted by name (table form)");
            System.out.println("4.	Display data sorted by name (table form)");
            System.out.println("5.  exit !");
            System.out.println("enter your choice");
            try
            {
                choice =sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-4");
                sc.nextLine();
                continue;
            }
            if      (choice == 1)
            {
                OBJ0.input();
            }
            else if (choice == 2)
            {
                OBJ11.search_roll_no(i);
            }
            else if (choice == 3)
            {
                OBJ10.sort();
                OBJ10.sorted_table();
            }
            else if (choice == 4)
            {   
                OBJ10.sort();
                OBJ10.complete();
            }
            else if (choice == 5)
            {
                break;
            }
            else 
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-4");
                sc.nextLine();
                continue;
            }
        }
    }
}

//-------------------usage of stud array from here---------------------\\

class name extends STUDENT
{
    void input (int i)// for input of name variable
    {
        System.out.println("enter name of the student :- "+ i);
        sc.nextLine();
        stud[0][i]=sc.nextLine();
    }
    void display(int i)//for display of name variable
    {
        System.out.println("Name of the student :- "+ stud[0][i]+"\n");
    }
}
class univercity_name extends STUDENT
{   
    Scanner in = new Scanner(System.in);
    void input(int i)
    {
        System.out.println("enter the univercity name below for student " 
                            + stud[0][i]);
        stud[1][i]=sc.nextLine();
        
    }
    void display(int i)
    {
        System.out.println(stud[0][i]+"'s Univercity name:- "+ stud[1][i]+"\n");
    }
}
class rollno extends STUDENT
{
    void input(int i)
    {
        System.out.println("enter the Roll no for student "+ stud[0][i]);
        String x=sc.nextLine();
        stud[2][i]=x.trim();        
    }
    void display(int i)
    {
        System.out.println("Roll no of "+stud[0][i]+" is "
                            +stud[2][i]+"\n");
    }
}

//--------------------usage of mark array from here--------------------\\

class marks_java extends STUDENT
{
    void input (int i)
    {   
        while(test==0)
        {
            System.out.println("enter mark obtained by "+ stud[0][i]
                            +" in java");
            try
            {
                mark[0][i]=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                sc.nextLine();
                continue;
            }            
            if(mark[0][i]>=0 & mark[0][i]<=100)
            {
                break;
            }
            else
            {
                System.out.println("entered value was incorrect!!!!"
                                  +"enter same value again it shuold"
                                  +" be between 0-100");
                continue;
            }
        }
    }
    
    void display(int i)
    {
        System.out.println("mark obtained by "+ stud[0][i]+" in java is    "
                            +mark[0][i]+"/100"+"\n");
    }
}
class marks_co extends STUDENT
{
    void input (int i)
    {   
        while(test==0)
        {
            System.out.println("enter marks obtained by "+ stud[0][i]
                            +"in COA");
             try
            {
                mark[1][i]=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                sc.nextLine();
                continue;
            }          
            if(mark[1][i]>=0 & mark[1][i]<=100)
            {
                break;
            }
            else
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                continue;
            }
        }
    }
    void display(int i)
    {
        System.out.println("mark obtained by "+ stud[0][i]+" in java is    "
                            +mark[1][i]+"/100"+"\n");
    }
    void display_table(int i)
    {
        
    }
}
class marks_dm extends STUDENT
{
    void input (int i)
    {
        while(test==0)
        {
            System.out.println("enter marks obtained by "+ stud[0][i]
                                +" in descrete mathematics");
             try
            {
                mark[2][i]=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                sc.nextLine();
                continue;
            }          
            if(mark[2][i]>=0 & mark[2][i]<=100)
            {
                break;
            }
            else
            {
                System.out.println("entered value was incorrect!!!!"
                                    +"enter same value again it shuold"
                                    +" be between 0-100");
                continue;
            }
        }
    }    
    void display(int i)
    {
        System.out.println("mark obtained by "+ stud[0][i]+" in java is    "
                            +mark[2][i]+"/100"+"\n");
    }
    void display_table(int i)
    {
        System.out.println(mark[2][i]);
    }
}
class total extends STUDENT
{   
    
    void calculate (int i)
    {
       mark[3][i]=mark[0][i]+mark[1][i]+mark[2][i];
    }
    void display(int i)
    {
        System.out.println("the total marks scored by "+stud[0][i]+" is   "
                            +mark[3][i]+"/300"+"\n");
    }
}
class per extends STUDENT
{
    void calculate (int i)
    {
        mark[4][i]=(mark[3][i]*100)/300;
    }
    void display(int i)
    {
        System.out.println("percent obtained by"+stud[0][i]+"is"+mark[4][i]+"%"+"\n");
    }
}
class grade extends STUDENT
{
    void grade_display (int i)
    {
        if (mark[4][i]>=80)
        {
            System.out.println("The grade for the student is A");
            stud[3][i]="A";
        }
        else if (mark[4][i]>=70 & mark[4][i]<=79)
        {
            System.out.println("The grade for the student is B");
            stud[3][i]="B";
        }
        else if (mark[4][i]>=60 & mark[4][i]<=69)
        {
            System.out.println("The grade for the student is C");
            stud[3][i]="C";
        }
        else if (mark[4][i]>=30 & mark[4][i]<=59)
        {
            System.out.println("The grade for the student is D");
            stud[3][i]="D";
        }
        else
        {
            System.out.println("The student has Failed");
            stud[3][i]="F";
        }
       
    }
}
class table_format extends STUDENT
{ 
    void sort()
    {   
        String temp1,temp2,temp3,temp4;
        int temp5,temp6,temp7,temp8,temp9;
        for(i=0;i<count-1;i++)
        {   
            //applying lenear lexilogically sort acc to name
            if (stud[0][i].compareTo(stud[0][i+1])>0)
            {   
                temp1=stud[0][i];
                temp2=stud[1][i];
                temp3=stud[2][i];
                temp4=stud[3][i];
                temp5=mark[0][i];
                temp6=mark[1][i];
                temp7=mark[2][i];
                temp8=mark[3][i];
                temp9=mark[4][i];

                //---------------------------------------\\

                stud[0][i]=stud[0][i+1];
                stud[1][i]=stud[1][i+1];
                stud[2][i]=stud[2][i+1];
                stud[3][i]=stud[3][i+1];
                mark[0][i]=mark[0][i+1];
                mark[1][i]=mark[1][i+1];
                mark[2][i]=mark[2][i+1];
                mark[3][i]=mark[3][i+1];
                mark[4][i]=mark[4][i+1];
                

                //----------------------------------------\\

                stud[0][i+1]=temp1;
                stud[1][i+1]=temp2;
                stud[2][i+1]=temp3;
                stud[3][i+1]=temp4;
                mark[0][i+1]=temp5;
                mark[1][i+1]=temp6;
                mark[2][i+1]=temp7;
                mark[3][i+1]=temp8;
                mark[4][i+1]=temp9;
                
            
            }
        }
    }
    void sorted_table()
    {
        System.out.println("Name \t univercity name \t\t roll no"
        +"\tgrade");
        for(i=0;i<count;i++)
        {
            System.out.println(stud[0][i]+"\t"+stud[1][i]+"\t\t"
                               +stud[2][i]+"\t"+stud[3][i]);
        }
    }
    void complete()
    {
        System.out.println("Name \t\t univercity name \t\t roll no"
        +"Java \t COA \t Descrete math \t total \t percentage"
        +"\t grade");
        int b;
        for(b=0;b<count;b++)
        {
            System.out.println(stud[0][b]+"\t\t"+stud[1][b]+"\t\t"
            +stud[2][b]+"\t"+mark[0][b]+"\t"+mark[1][b]+"\t"
            +mark[2][b]+"\t"+mark[3][b]+"\t"+mark[4][b]+"\t"
            +stud[3][b]);
        }
    }

}
class search extends STUDENT 
{   
    void search_roll_no(int i)
    {      
        int t;
        System.out.println("enter the roll no to be found");
        sc.nextLine();
        String comp=sc.nextLine();
        String comp1=comp.trim(); 
        for(t=0;t<count;t++)
        {
            if (stud[2][t].equals(comp1))
            {
                System.out.println("found ! roll no :- "+stud[2][t]+"\n ");
                OBJ1.display(t);
                OBJ2.display(t);
                OBJ3.display(t);
                OBJ4.display(t);
                OBJ5.display(t);
                OBJ6.display(t);
                OBJ7.calculate(t);
                OBJ7.display(t);
                OBJ8.calculate(t);
                OBJ8.display(t);
                OBJ9.grade_display(t);
            }
            else 
            {
                // System.out.println("not in records!");
                continue;
            }
        }
    }
}
