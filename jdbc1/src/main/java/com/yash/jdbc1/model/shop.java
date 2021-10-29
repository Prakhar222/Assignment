package com.yash.jdbc1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
/*
 * 
 * author 
 * Prakhar Gupta
 */
public class shop {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	
		

	//	String sql="Insert into shop(reg_id,shop_name,owner_name) values(123,'Mega_Stores','Ron')";
		String sql="Insert into shop(reg_id,shop_name,owner_name,proid) values(12,'Mega_Stores','Ron',1)";
			Statement st=(Statement) con.createStatement();
		
		int i =st.executeUpdate(sql);
		//Logger.info("Data Inserted");
		ResultSet rs=st.executeQuery("Select * from shop");
		while(rs.next())
		{

			Logger.info("shop data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	con.close();
	st.close();
	rs.close();





	}



}
