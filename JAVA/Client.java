import java.net.*;
import java.io.*;

class Client 
{
    public static void main(String Google[]) throws Exception
    {
        System.out.println("Client Application is Running....");


        Socket sobj = new Socket("192.168.1.18",2100);
        System.out.println("Client gets Successfully Connected");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;

        System.out.println("Marvellous Messenger Started....");

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter Message for Server : ");
            System.out.println("Server Says : "+ str2);
        }
        System.out.println("Thank you for using Marvellous Messanger...");

        
    }
}
