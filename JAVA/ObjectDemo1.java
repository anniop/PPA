class Marvellous
{
    public int i,j;
    public Marvellous()
    {
        System.out.println("Inside Marvellous Class");
    }

    protected void finalise()
    {
        System.out.println("Inside Finalize method");
    }
}


 class ObjectDemo1
{
    public static void main(String Google[])
    {
        
        Marvellous mobj = new Marvellous();
        System.out.println(mobj.hashCode());
        mobj = null;
        System.gc();

    }
}