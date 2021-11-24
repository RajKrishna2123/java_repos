package vehicles;
public class car1 implements Vehicle
{
        public void run()
        {
                System.out.println("Car is running.");
        }
        public void speed()
        {
                System.out.println("Speed of Car: 50 Km/h");
        }
        public static void main(String args[])
        {
                car1 Car = new car1();
                Car.run();
                Car.speed();
                System.out.println("Hello World!");
        }
}

