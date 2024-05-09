class Wrapper 
{
    public static void main(String Google[])
    {
        Integer iobj = new Integer(11);
        Object  obj = new Object();

        int no = 11;
        Integer i = no;     // Auto Boxing

        int j = iobj.intValue();       // Unboxing
        System.out.println(i);
    }    
}

