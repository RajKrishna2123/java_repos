import mca.Student;
import java.util.*;
public class StudentMain {
     public static void main(String[] args)
     {
          String nm;
          int roll;
          System.out.println("deeepak,,sap Id 1000014934");
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Roll no:= ");
          roll = sc.nextInt();
          System.out.print("Enter Name:= ");
          nm = sc.next();
          int m1,m2,m3;
          System.out.print("Enter 3 sub mark:= ");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          Student s = new Student( roll,nm,m1,m2,m3);
          s.display();
          sc.close();
     }
    
}
