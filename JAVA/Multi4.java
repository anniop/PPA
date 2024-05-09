class Demo extends Thread
{
    public void run()
    {
        try
        {
            int i =0;
        String name = Thread.currentThread().getName();
        for(i=0;i <=10; i++)
        {
            System.out.println("Running Thread is  "+ name + "with Value : "+ i);
            Thread.sleep(1000);
        }
        }
        catch(Exception obj)
        {}
    }
}

class Multi4
{
    public static void main(String Google[])
    {
        String name1 = Thread.currentThread().getName();
        System.out.println("the thread is "+ name1);
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("PPA ");
        dobj2.setName("LB ");

        dobj1.start();
        dobj2.start();

    }    
}
