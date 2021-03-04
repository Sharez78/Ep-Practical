package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class StudentDB 
{
 public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ser", "root", "root");
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int AddStudent(Student e){  
        int status=0;  
        try{  
            Connection con=StudentDB.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into std_management(id,regno,name,password,email,branch,city) values (?,?,?,?,?,?,?)");  
            ps.setInt(1, e.getId());
            ps.setInt(2, e.getRegno());
            ps.setString(3, e.getName());  
            ps.setString(4, e.getPassword());  
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getBranch());
            ps.setString(7, e.getCity());  
            status=ps.executeUpdate();  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
        return status;  
    }  
    public static int update(Student e){  
        int status=0;  
        try{  
            Connection con=StudentDB.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update std_management set regno=?,name=?,password=?,email=?,branch=?,city=? where id=?");  
            ps.setInt(1,e.getRegno());
            ps.setString(2,e.getName());  
            ps.setString(3,e.getPassword());  
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getBranch());
            ps.setString(6,e.getCity());
            ps.setInt(7,e.getId());  
            status=ps.executeUpdate();  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
        return status;  
    }  
    public static int delete(int id){    
        int status=0;
     try{  
            Connection con=StudentDB.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from std_management where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate(); 
            con.close();  
        }catch(Exception e){e.printStackTrace();}
  return status;  
    }  
    public static Student getStudentById(int id){  
        Student e=new Student();  
        try{  
            Connection con=StudentDB.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from std_management where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));
                e.setRegno(rs.getInt(2));
                e.setName(rs.getString(3));  
                e.setPassword(rs.getString(4));  
                e.setEmail(rs.getString(5));  
                e.setBranch(rs.getString(6)); 
                e.setCity(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
        return e;  
    }  
    public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
        try{  
            Connection con=StudentDB.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from std_management");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student e=new Student();  
                e.setId(rs.getInt(1));
                e.setRegno(rs.getInt(2));
                e.setName(rs.getString(3));  
                e.setPassword(rs.getString(4));  
                e.setEmail(rs.getString(5));  
                e.setBranch(rs.getString(6)); 
                e.setCity(rs.getString(7));
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
        return list;
}
}