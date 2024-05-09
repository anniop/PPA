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

class Multi6
{
    public static void main(String Google[]) throws Exception
    {
        System.out.println("Current thread is : "+ Thread.currentThread().getName());
        Demo dobj1 = new Demo();
        dobj1.setName("PPA ");
        dobj1.start();
        
        dobj1.join();
        System.out.println("End of main thread");
    }    
}
