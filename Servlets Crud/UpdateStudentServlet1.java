package one;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudentServlet1
 */
public class UpdateStudentServlet1 extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  PrintWriter pw=response.getWriter();  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String s=request.getParameter("regno");  
        int regno=Integer.parseInt(s);
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        String email=request.getParameter("email");  
        String branch=request.getParameter("branch");
        String city=request.getParameter("city");  
        Student e=new Student();  
        e.setId(id);  
        e.setRegno(regno);
        e.setName(name);  
        e.setPassword(password);  
        e.setEmail(email); 
        e.setBranch(branch);
        e.setCity(city);  
        int status=StudentDB.update(e);  
        if(status>0){  
            response.sendRedirect("ViewStudentServlet"); 
        }else{  
            pw.println("Unable to update Student!!!");  
        }  
        pw.close();
 }
}