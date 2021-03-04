package one;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ViewStudentServlet
 */
public class ViewStudentServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  PrintWriter pw=response.getWriter();  
        pw.println("<a href='index.html'>Add New Student</a>");  
        pw.println("<h1>Students List</h1>");
        List<Student> list=StudentDB.getAllStudents();  
        pw.print("<table style=\"color:red;\" border='1' cellpadding='4' width='60%'>");  
        pw.print("<tr><th>Regno</th><th>Name</th><th>Password</th><th>Email</th><th>Branch</th><th>City</th><th>Update</th><th>Delete</th></tr>");  
        for(Student e:list){  
            pw.print("<tr><td>"+e.getRegno()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getBranch()+"</td><td>"+e.getCity()+"</td><td><a href='UpdateStudentServlet?id="+e.getId()+"'>edit</a></td><td><a href='DeleteStudentServlet?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        pw.print("</table>");   
 }
}