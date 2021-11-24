public class gradedlab_4 
{
    class Vehicle
    {  
        void run(){System.out.println("Vehicle is running");}  
    }  
    //Creating a child class  
    class Bike extends Vehicle
    {  
        public static void main(String args[])
        {  
            //creating an instance of child class  
            Bike OBJ = new Bike();  
            //calling the method with child class instance  
            OBJ.run();  
        }  
    }  
    
}
