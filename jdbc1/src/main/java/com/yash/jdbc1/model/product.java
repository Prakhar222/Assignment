package com.yash.jdbc1.model;

import java.sql.Connection;
/*
 * 
 * author 
 * Prakhar Gupta
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class product {
	static Logger Logger=java.util.logging.Logger.getAnonymousLogger();


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	
		

		String sql="Insert into product(product_id,product_name,product_des) values(1,'washing_Powder','For_Machine')";
		//String sql="Insert into product(product_id,product_name,product_des,shop_id) values(2,'Handwash','100% germs free',122)";
			Statement st=(Statement) con.createStatement();
		
		int i =st.executeUpdate(sql);
		//Logger.info("Data Inserted");
		ResultSet rs=st.executeQuery("Select * from product");
		while(rs.next())
		{

			Logger.info("product data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	con.close();
	st.close();
	rs.close();





	}
}
