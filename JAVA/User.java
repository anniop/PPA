import java.io.*;
import java.util.*;

class InvalidAge extends Exception
{
    
}

class User
{
    public static void main(String Google[])
    {
        try
        {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please Enter Age :");
        int Age = sobj.nextInt();
        
        if ( Age < 18 )
        {
            throw new InvalidAge();
        }
        else
        {
            System.out.println("Age is Valid to register on the site");
        }
    }
    catch (InvalidAge obj)
    {
        System.out.println("Invalid Age to Register On the site ");
    }
    }
}