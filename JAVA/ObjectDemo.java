/*
Object Class Contains below methods in it.

            getClass()
            hashCode()
            equals()
            clone()
            finalise()

*/

class Marvellous
{

}

// class ObjectDemo extends Object 
 class ObjectDemo 
{
    public static void main(String Google[])
    {
        Object obj = new Marvellous(); // Upcasting
        Marvellous mobj = new Marvellous();
        System.out.println(obj.getClass().getName());

    }
}
