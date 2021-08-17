package com.yash.jdbc1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Engine {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	
		

		String sql="Insert into Engine(modelYear,manufactureDetails) values(2007,'Extreme')";
		
				Statement st=(Statement) con.createStatement();
		
		int i =st.executeUpdate(sql);
		//Logger.info("Data Inserted");
		ResultSet rs=st.executeQuery("Select * from Engine");
		while(rs.next())
		{

			Logger.info("Engine data is "+rs.getString(1)+" "+rs.getString(2));
		}
		
	con.close();
	st.close();
	rs.close();





	}
}
