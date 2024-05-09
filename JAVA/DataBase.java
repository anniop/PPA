import java.sql.*;  // Step:1

class DataBase
{
    public static void main(String Google[]) 
    {
        try
        {
        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA50","root","a");  // Step:2
        Statement sobj = cobj.createStatement();  // Step:3
        ResultSet robj = sobj.executeQuery("select * from student");  // Step:4

        while (robj.next()) // Step:5
        {
            System.out.println("RNO : "+ robj.getInt("rno"));
            System.out.println("Name : "+ robj.getString("Name"));
            System.out.println("City : "+ robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("marks"));
        }

        }
        catch(Exception obj)
        {

        }
    }
}