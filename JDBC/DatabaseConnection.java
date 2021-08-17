package com.yash.jdbc;
import java.util.*;
import java.util.logging.Logger;
import java.lang.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DatabaseConnection {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		//System.out.println("Database Connected");
		Logger.info("Database Connected");
		Statement st=(Statement) con.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from employee");
		while(rs.next())
		{
			//System.out.println("Employee data is :"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

			Logger.info("Employee data is"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		con.close();
		st.close();
		rs.close();
	
	
	}

}
