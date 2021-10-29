package com.yash.jdbc1.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger; 

//import com.mysql.jdbc.Statement;



public class CarInformation {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement st=(Statement) con.createStatement();
		
		ResultSet rs=( st).executeQuery("INSERT INTO Car(regNumber,ownerName,carType,engine) values(12121,'Ram','spots','f54'");
		while(rs.next())
		{

			Logger.info("Employee data is"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		con.close();
		st.close();
		rs.close();
	
}
}