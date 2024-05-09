
class Base
{
    public int A,B;

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.A = 11;
        this.B = 21;
    }
    public void fun()
    {
        System.out.println("Inside Fun of Base");
    }
}
class Derived extends Base
{
    public int X,Y;
    
    public Derived(int i, int j)
    {
       
        System.out.println("Inside Derived Constructor");
        this.X = i;
        this.Y = j; 
        
    }
    public void gun()
    {
        System.out.println("Inside Gun of Derived ");
        super.fun();
        System.out.println("Value of A is "+ super.A);
        System.out.println("Value of X is "+ this.X);
    }
}

class Keyword 
{
    public static void main(String Google[])
    {
        Derived dobj = new Derived(51, 101);
        dobj.gun(); 
        
    }    
}
