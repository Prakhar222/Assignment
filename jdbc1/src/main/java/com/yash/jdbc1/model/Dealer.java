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

import com.mysql.jdbc.PreparedStatement;

public class Dealer {
		static Logger logger =Logger.getAnonymousLogger();
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");    
			logger.info("Databases connected");


			//shop_table
			String q ="insert into shop(reg_id,shop_name,owner_name,proid) values(?,?,?,?)";
			java.sql.PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,111);
			pstmt.setString(2, "Mega_Stores");
			pstmt.setString(3, "Ron");
			pstmt.setInt(4,1);
			pstmt.executeUpdate();
			Statement st =(Statement) con.createStatement();
			ResultSet rs=st.executeQuery("Select * from shop");
			while(rs.next())
			{

				logger.info("Data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			

			/*   ///product_table
	        String q1="insert into product(product_id,prodcut_name,product_des) values(?,?,?)";
	        java.sql.PreparedStatement pstmt2 = con.prepareStatement(q1);
	        pstmt2.setInt(1, 2);
	        pstmt2.setString(2,"Washing Powder");
	        pstmt2.setString(3,"For Machine");
	        pstmt2.executeUpdate();
	        logger.info("Inserted in Product Table ");
	        

			Statement st =(Statement) con.createStatement();
			ResultSet rs=st.executeQuery("Select * from product");
			while(rs.next())
			{

				logger.info("Data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
           */
			con.close();
		}
	}

