package com.yash.jdbc1.model;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 * @author prakhar.gupta
 *
 */
public class Car {

	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	
		

		//String sql="Insert into Car(regNumber,ownerName,carType) values(12121,'Ram','spots')";
		//String sql="Insert into Car(regNumber,ownerName,carType) values(32321,'Gvind','spots')";
		//String sql="Insert into Car(regNumber,ownerName,carType) values(11111,'Krishna','spots')";
		//String sql="Insert into Car(regNumber,ownerName,carType) values(23231,'Mohan','spots')";
		//String sql="Insert into Car(regNumber,ownerName,carType) values(23531,'Ravi','spots')";
		String sq="Insert into Car(regNumber,ownerName,carType) VALUES ('6', 'Amanedeal','HYUNDAI')";
				Statement st=(Statement) con.createStatement();
		int j =st.executeUpdate(sq);
		//int i =st.executeUpdate(sql);
		//Logger.info("Data Inserted");
		ResultSet rs=st.executeQuery("Select * from Car");
		while(rs.next())
		{

			Logger.info("Car data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	con.close();
	st.close();
	rs.close();





	}
}

