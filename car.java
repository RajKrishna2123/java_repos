import java.util.*;
class car
{
   public static void main (String[] args)
    {
        int x;
        String y;
        System.out.println("eneter the vehicle no ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("eneter the car type sedan or hatchback ");
        y=sc.nextLine();
        sc.close();
        alto details=new alto(x,y);
        alto.display(x,y);
        alto.engineno(x);
        alto.car_type(y);
    }  
        
}
class alto extends car
{    
     public static void engineno(int i)
    {
        System.out.println("engine no is  "+i);
    }
    public static void car_type(String z)
    {
        System.out.println("car_type is "+z);

    }
    public  static void display(int w,String j)
    {   
            
        System.out.println("all details displyed");
    }    
   
} 

 