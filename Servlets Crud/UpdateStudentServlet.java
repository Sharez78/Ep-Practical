package one;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudentServlet
 */
public class UpdateStudentServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  PrintWriter out=response.getWriter();  
        out.println("<h1>Update Student</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        Student e=StudentDB.getStudentById(id);  
        out.print("<form action='UpdateStudentServlet1' method='post'>");  
        out.print("<table style=\\\"color:red;\\\">");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
        out.print("<tr><td>Regno:</td><td><input type='text' name='regno' value='"+e.getRegno()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+e.getPassword()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");  
        out.print("<tr><td>Branch:</td><td>");  
        out.print("<select name='branch' style='width:150px'>");  
        out.print("<option>CSE</option>");  
        out.print("<option>ECE</option>");  
        out.print("<option>EEE</option>");  
        out.print("<option>ME</option>");  
        out.print("</select>");  
        out.print("</td></tr>"); 
        out.print("<tr><td>City:</td><td>");  
        out.print("<select name='city' style='width:150px'>");  
        out.print("<option>Vijayawada</option>");  
        out.print("<option>Guntur</option>");  
        out.print("<option>Tenali</option>");  
        out.print("<option>Eluru</option>");  
        out.print("</select>");  
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save'/></td></tr>"); 
        out.print("</table>");  
        out.print("</form>");  
        out.close();  
 }
}