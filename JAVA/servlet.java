import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

class servlet extends HttpServlet
{
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws Exception
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        pw.println("<html><body>");
        pw.println("Welcome to servlet");
        pw.println("</body></html>");

        pw.close();
    }
}