interface Area
{
    final static float pi=3.14f;
    float compute(float x, float y);    
} 
class Rectangle implements Area{
    public float compute(float x,float y)
    {return x*y;}
}
class Circle implements Area{
    public float compute(float x,float y)
    {
        return pi*x*x;
    }   
}
class interfacedemo1
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area a;
        a=rect;
        System.out.println("Rect Area = "+a.compute(10,20));
        a=cir;
        System.out.println("Circle Area = "+a.compute(10,30));
    }
}