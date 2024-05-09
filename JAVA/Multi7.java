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
            
        }
        }
        catch(Exception obj)
        {}
    }
}

class Multi7
{
    public static void main(String Google[])
    {
        
        System.out.println("the thread is "+ Thread.currentThread().getName());
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("PPA ");
        dobj2.setName("LB ");
        System.out.println("Proiroity of dobj1 is : " + dobj1.getPriority());
        System.out.println("Priority of dobj2 is : "+ dobj2.getPriority());
        
        dobj1.setPriority(10);
        dobj2.setPriority(10);
        System.out.println("Proiroity of dobj1 is : " + dobj1.getPriority());
        System.out.println("Priority of dobj2 is : "+ dobj2.getPriority());
        
        dobj1.start();
        dobj2.start();

    }    
}
