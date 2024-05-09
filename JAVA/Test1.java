import java.sql.*;

class Test1 
{
    public static void main(String Google[])
    {
        try
        {
            Connection cobj = DriverManager.getConnection("Path", "UserName", "Password");
            Statement sobj = cobj.createStatement();
            ResultSet robj = sobj.executeQuery("select * from student");

            while(robj.next())
            {
                System.out.println("RNo"+robj.getInt("rno"));
                System.out.println("Name"+ robj.getString("name"));
                System.out.println("City"+ robj.getString("City"));
                
            }
        }
        catch(Exception obj)
        {

        }
    }    
}
