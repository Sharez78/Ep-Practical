package one;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter(); 
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
        int status=StudentDB.AddStudent(e);  
        if(status>0){  
            out.print("<p style=\"color:blue;\">Student added successfully!!!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Unable to add Student!!!");  
        }  
        out.close();  
    }
}