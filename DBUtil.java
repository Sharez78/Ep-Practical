package connections;
import java.sql.Connection;
import java.sql.SQLException;

import main.PreparedStatement;

import java.sql.DriverManager;

public class DBUtil {
final static String forNameURL="oracle.jdbc.driver.OracleDriver";
final static String dbURL="jdbc.oracle.thin:@localhost:1521:XE";
final static String username="system";
final static String password="123456";
public static Connection DBConnection() throws SQLException,ClassNotFoundException{
	Connection con=DriverManager.getConnection(dbURL,username,password);

	return con;
}
}
