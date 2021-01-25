package main;

import java.sql.SQLException;
import java.util.Scanner;

import supermarket.SalesBean;
import connections.DBUtils;
import insert.SalesInsert;
public class SalesMain {
	
	private static Scanner sc;
 
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		SalesBean sb = new SalesBean();
		SalesInsert si = new SalesInsert();
		sc = new Scanner(System.in);
		String choice;
		do 
		{
			System.out.println("Select an CRUD Operation");
			System.out.println("1.Insertion");
			System.out.println("Enter your choice : ");
			int ch =sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Insertion");
						 System.out.println("Enter ItemId : ");
						 int id = sc.nextInt();
					 	 sb.setItemid(id);
						 System.out.println("Enter Itemname : ");
						 String name = sc.next();
					 	 sb.setItemname(name);
					 	 System.out.println("Enter Cost Of Item : ");
					 	 int costitem = sc.nextInt();
					 	 sb.setCost(costitem);
					 	 int i = si.SalesInsert(sb);
					 	 if(i>0)
					 	 {
					 		 System.out.println("Ur insertion is successfull");
					 		 System.out.println("");
					 	 }
					 	 else
					 	 {
					 		 System.out.println("Ur insertion is failed");
					 	 }
					 	 break;
				case 2 : System.out.println("Display of items");
				 si.Items_Display();
				 break;
				 
		case 3 : System.out.println("Total Cost of items");
				 si.items_totalCost();
		  		 break;
		  		 

				
				default : System.exit(0);
			}
			System.out.println("Enter your choice to repeat this operation : ");
			choice = sc.next();
		}
		while(choice.equals("Yes"));
	}
}
