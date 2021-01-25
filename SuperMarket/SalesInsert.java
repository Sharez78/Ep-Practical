package insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import supermarket.SalesBean;
import connections.DBUtils;

public class SalesInsert {
	
	public int SalesInsert(SalesBean sales) throws ClassNotFoundException, SQLException{
		
		Connection con=DBUtils.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into sales values(?,?,?)");  
		ps.setInt(1,sales.getItemid());
		ps.setString(2,sales.getItemname());
		ps.setInt(3,sales.getCost());
		int i = ps.executeUpdate();
		con.close();
		
		return i;
	}
	public void Items_Display() throws ClassNotFoundException, SQLException{
		Connection con=DBUtils.DBConnection();
		PreparedStatement ps=con.prepareStatement("select * from sales");
		ResultSet display = (ResultSet) 
		ps.executeQuery();
		System.out.println("itemid \t itemname \t itemcost");
		while(display.next()) {
			System.out.print(display.getInt(1));
			System.out.print("\t  "+display.getString(2));
			System.out.print("\t \t  "+display.getInt(3));
			System.out.println();
		}
		con.close();
	}
	
	public void items_totalCost() throws ClassNotFoundException, SQLException{
		Connection con=DBUtils.DBConnection();
		PreparedStatement ps=con.prepareStatement("SELECT sum(itemcost) FROM sales.sales;");
		ResultSet display = (ResultSet) 
		ps.executeQuery();
		System.out.println("itemcost");
		int sum = 0;
		while(display.next()) {
			int c = display.getInt(1);
			sum = sum + c;
			System.out.println("Total Cost "+sum);
		}
		con.close();
	}

	  }

