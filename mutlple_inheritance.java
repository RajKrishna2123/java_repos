interface std 
{
    void define();
    void show();
}
class money implements std
{
    int rupee,paise;
    money(int a,int b)
    {
        rupee=a;paise=b;
    }
    public void show ()
    {
        System.out.println("Rupee =Rs. "+rupee);
        System.out.println("paise ="+(rupee*100+paise)+"paise");
        
    }
    public void define()
    {
        rupee =100;
        paise = 10;
    }
}
public class mutlple_inheritance 
{   
    public static void main(String[] args) {
    money m1= new money(10,60);
    // m1.define();
    m1.show();
    }
}
