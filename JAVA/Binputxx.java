import java.io.*;

class Binputxx
{
    public static void main(String Arg[])
    {
        try
        {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Second Number :  ");
        int No1 = Integer.parseInt(bobj.readLine());
        //String name = bobj.readLine();
        

        System.out.println("Enter Second Number : ");
        int No2 = Integer.parseInt(bobj.readLine());

        int Ans = No1 + No2;
        System.out.println(Ans);
        }
        catch (IOException obj)
        {}
    }
} 
