package one;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        StudentDB.delete(id);  
        response.sendRedirect("ViewStudentServlet");
 }
}