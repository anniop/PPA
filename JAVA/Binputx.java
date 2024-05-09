import java.io.*;

class Binputx
{
    public static void main(String Arg[])
    {
        try
        {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Your Name : ");
        String name = bobj.readLine();
        
        System.out.println("Welcome " + name);
        }
        catch (IOException obj)
        {}
    }
} 
