package insert;
import student.StudentBean;
import connections.DBUtil; 
import java.sql.Connection;
import java.sql.SQLException;

public class StudentInsertion {
public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException{
	Connection con = DBUtil.DBConnection();
	return 0;
}

}
